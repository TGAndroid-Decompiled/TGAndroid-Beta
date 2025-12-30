package org.telegram.messenger.utils;

import android.util.Base64;
import androidx.core.util.Pair;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.Purchase;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public abstract class BillingUtilities {
    public static void extractCurrencyExp(Map map) {
        if (map.isEmpty()) {
            try {
                InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("currencies.json");
                JSONObject jSONObject = new JSONObject(new String(Util.toByteArray(inputStreamOpen), Charsets.UTF_8));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
                }
                inputStreamOpen.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static Pair createDeveloperPayload(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, AccountInstance accountInstance) {
        String strEncodeToString;
        if (accountInstance.getUserConfig().isClientActivated()) {
            strEncodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(Charsets.UTF_8), 0);
        } else {
            strEncodeToString = Base64.encodeToString(("account-" + accountInstance.getCurrentAccount()).getBytes(Charsets.UTF_8), 0);
        }
        return Pair.create(strEncodeToString, savePurpose(inputStorePaymentPurpose));
    }

    public static String savePurpose(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose) {
        long jNextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + jNextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(jNextLong);
        String strBytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + strBytesToHex + " paymentPurpose=" + inputStorePaymentPurpose);
        TL_savedPurpose tL_savedPurpose = new TL_savedPurpose();
        tL_savedPurpose.id = jNextLong;
        tL_savedPurpose.flags = 1;
        tL_savedPurpose.purpose = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(tL_savedPurpose.getObjectSize());
        tL_savedPurpose.serializeToStream(serializedData2);
        String strBytesToHex2 = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (tL_savedPurpose.getObjectSize() > 28) {
            FileLog.d("BillingUtilities.savePurpose: sending short version, original size is " + tL_savedPurpose.getObjectSize() + " bytes");
            tL_savedPurpose.flags = 0;
            tL_savedPurpose.purpose = null;
        }
        SerializedData serializedData3 = new SerializedData(tL_savedPurpose.getObjectSize());
        tL_savedPurpose.serializeToStream(serializedData3);
        String strBytesToHex3 = Utilities.bytesToHex(serializedData3.toByteArray());
        serializedData3.cleanup();
        ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().putString(strBytesToHex, strBytesToHex2).apply();
        FileLog.d("BillingUtilities.savePurpose: saved {" + strBytesToHex2 + "} under " + strBytesToHex);
        StringBuilder sb = new StringBuilder();
        sb.append("BillingUtilities.savePurpose: but sending {");
        sb.append(strBytesToHex3);
        sb.append("}");
        FileLog.d(sb.toString());
        return strBytesToHex3;
    }

    public static TLRPC.InputStorePaymentPurpose getPurpose(String str) {
        FileLog.d("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
        TL_savedPurpose tL_savedPurposeTLdeserialize = TL_savedPurpose.TLdeserialize(serializedData, serializedData.readInt32(true), true);
        serializedData.cleanup();
        if (tL_savedPurposeTLdeserialize.purpose != null) {
            FileLog.d("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return tL_savedPurposeTLdeserialize.purpose;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(tL_savedPurposeTLdeserialize.id);
        String strBytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        FileLog.d("BillingUtilities.getPurpose: searching purpose under " + strBytesToHex);
        String string = ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).getString(strBytesToHex, null);
        if (string == null) {
            FileLog.d("BillingUtilities.getPurpose: purpose under " + strBytesToHex + " not found");
            throw new RuntimeException("no purpose under " + strBytesToHex + " found :(");
        }
        FileLog.d("BillingUtilities.getPurpose: got {" + string + "} under " + strBytesToHex);
        SerializedData serializedData3 = new SerializedData(Utilities.hexToBytes(string));
        TL_savedPurpose tL_savedPurposeTLdeserialize2 = TL_savedPurpose.TLdeserialize(serializedData3, serializedData3.readInt32(true), true);
        serializedData3.cleanup();
        return tL_savedPurposeTLdeserialize2.purpose;
    }

    public static void clearPurpose(String str) {
        try {
            FileLog.d("BillingUtilities.clearPurpose: got {" + str + "}");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
            TL_savedPurpose tL_savedPurposeTLdeserialize = TL_savedPurpose.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            SerializedData serializedData2 = new SerializedData(8);
            serializedData2.writeInt64(tL_savedPurposeTLdeserialize.id);
            String strBytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
            serializedData2.cleanup();
            FileLog.d("BillingUtilities.clearPurpose: id_hex = " + strBytesToHex);
            ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(strBytesToHex).apply();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static class TL_savedPurpose extends TLObject {
        public int flags;
        public long id;
        public TLRPC.InputStorePaymentPurpose purpose;

        public static TL_savedPurpose TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_savedPurpose) TLObject.TLdeserialize(TL_savedPurpose.class, i != 495638674 ? null : new TL_savedPurpose(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.purpose = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(495638674);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.id);
            if ((this.flags & 1) != 0) {
                this.purpose.serializeToStream(outputSerializedData);
            }
        }
    }

    private static AccountInstance findAccountById(long j) {
        for (int i = 0; i < 4; i++) {
            AccountInstance accountInstance = AccountInstance.getInstance(i);
            if (accountInstance.getUserConfig().getClientUserId() == j) {
                return accountInstance;
            }
        }
        return null;
    }

    public static Pair extractDeveloperPayload(Purchase purchase) {
        TLRPC.InputStorePaymentPurpose purpose;
        AccountInstance accountInstance;
        AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
        if (accountIdentifiers == null) {
            FileLog.d("Billing: Extract payload. No AccountIdentifiers");
            return null;
        }
        String obfuscatedAccountId = accountIdentifiers.getObfuscatedAccountId();
        String obfuscatedProfileId = accountIdentifiers.getObfuscatedProfileId();
        if (obfuscatedAccountId == null || obfuscatedAccountId.isEmpty() || obfuscatedProfileId == null || obfuscatedProfileId.isEmpty()) {
            FileLog.d("Billing: Extract payload. Empty AccountIdentifiers");
            return null;
        }
        try {
            try {
                purpose = getPurpose(obfuscatedProfileId);
            } catch (Exception e) {
                FileLog.e("Billing: Extract payload, failed to get purpose", e);
                purpose = null;
            }
            String str = new String(Base64.decode(obfuscatedAccountId, 0), Charsets.UTF_8);
            FileLog.d("Billing: Extract payload. obfuscatedAccountIdString=" + str);
            if (str.startsWith("account-")) {
                accountInstance = AccountInstance.getInstance(Integer.parseInt(str.substring(8)));
            } else {
                long j = Long.parseLong(str);
                AccountInstance accountInstanceFindAccountById = findAccountById(j);
                if (accountInstanceFindAccountById == null) {
                    FileLog.d("Billing: Extract payload. AccountInstance not found, accountId=" + j);
                    return null;
                }
                accountInstance = accountInstanceFindAccountById;
            }
            return Pair.create(accountInstance, purpose);
        } catch (Exception e2) {
            FileLog.e("Billing: Extract Payload", e2);
            return null;
        }
    }

    public static void cleanupPurchase(Purchase purchase) {
        clearPurpose(purchase.getAccountIdentifiers().getObfuscatedProfileId());
    }
}
