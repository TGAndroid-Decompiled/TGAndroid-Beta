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
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputStorePaymentPurpose;
public class BillingUtilities {
    public static void extractCurrencyExp(Map<String, Integer> map) {
        if (map.isEmpty()) {
            try {
                InputStream open = ApplicationLoader.applicationContext.getAssets().open("currencies.json");
                JSONObject jSONObject = new JSONObject(new String(Util.toByteArray(open), Charsets.UTF_8));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    map.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
                }
                open.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static Pair<String, String> createDeveloperPayload(TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose, AccountInstance accountInstance) {
        return Pair.create(Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(Charsets.UTF_8), 0), savePurpose(tLRPC$InputStorePaymentPurpose));
    }

    public static String savePurpose(TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose) {
        long nextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + tLRPC$InputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + bytesToHex + " paymentPurpose=" + tLRPC$InputStorePaymentPurpose);
        TL_savedPurpose tL_savedPurpose = new TL_savedPurpose();
        tL_savedPurpose.id = nextLong;
        tL_savedPurpose.flags = 1;
        tL_savedPurpose.purpose = tLRPC$InputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(tL_savedPurpose.getObjectSize());
        tL_savedPurpose.serializeToStream(serializedData2);
        String bytesToHex2 = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (tL_savedPurpose.getObjectSize() > 28) {
            FileLog.d("BillingUtilities.savePurpose: sending short version, original size is " + tL_savedPurpose.getObjectSize() + " bytes");
            tL_savedPurpose.flags = 0;
            tL_savedPurpose.purpose = null;
        }
        SerializedData serializedData3 = new SerializedData(tL_savedPurpose.getObjectSize());
        tL_savedPurpose.serializeToStream(serializedData3);
        String bytesToHex3 = Utilities.bytesToHex(serializedData3.toByteArray());
        serializedData3.cleanup();
        ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().putString(bytesToHex, bytesToHex2).apply();
        FileLog.d("BillingUtilities.savePurpose: saved {" + bytesToHex2 + "} under " + bytesToHex);
        StringBuilder sb = new StringBuilder();
        sb.append("BillingUtilities.savePurpose: but sending {");
        sb.append(bytesToHex3);
        sb.append("}");
        FileLog.d(sb.toString());
        return bytesToHex3;
    }

    public static TLRPC$InputStorePaymentPurpose getPurpose(String str) throws RuntimeException {
        FileLog.d("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
        TL_savedPurpose TLdeserialize = TL_savedPurpose.TLdeserialize(serializedData, serializedData.readInt32(true), true);
        serializedData.cleanup();
        if (TLdeserialize.purpose != null) {
            FileLog.d("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return TLdeserialize.purpose;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(TLdeserialize.id);
        String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        FileLog.d("BillingUtilities.getPurpose: searching purpose under " + bytesToHex);
        String string = ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).getString(bytesToHex, null);
        if (string == null) {
            FileLog.d("BillingUtilities.getPurpose: purpose under " + bytesToHex + " not found");
            throw new RuntimeException("no purpose under " + bytesToHex + " found :(");
        }
        FileLog.d("BillingUtilities.getPurpose: got {" + string + "} under " + bytesToHex);
        SerializedData serializedData3 = new SerializedData(Utilities.hexToBytes(string));
        TL_savedPurpose TLdeserialize2 = TL_savedPurpose.TLdeserialize(serializedData3, serializedData3.readInt32(true), true);
        serializedData3.cleanup();
        return TLdeserialize2.purpose;
    }

    public static void clearPurpose(String str) {
        try {
            FileLog.d("BillingUtilities.clearPurpose: got {" + str + "}");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
            TL_savedPurpose TLdeserialize = TL_savedPurpose.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            SerializedData serializedData2 = new SerializedData(8);
            serializedData2.writeInt64(TLdeserialize.id);
            String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
            serializedData2.cleanup();
            FileLog.d("BillingUtilities.clearPurpose: id_hex = " + bytesToHex);
            ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(bytesToHex).apply();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static class TL_savedPurpose extends TLObject {
        public int flags;
        public long id;
        public TLRPC$InputStorePaymentPurpose purpose;

        public static TL_savedPurpose TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            TL_savedPurpose tL_savedPurpose = i != 495638674 ? null : new TL_savedPurpose();
            if (tL_savedPurpose == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_savedPurpose", Integer.valueOf(i)));
            }
            if (tL_savedPurpose != null) {
                tL_savedPurpose.readParams(abstractSerializedData, z);
            }
            return tL_savedPurpose;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.flags = abstractSerializedData.readInt32(z);
            this.id = abstractSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.purpose = TLRPC$InputStorePaymentPurpose.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(495638674);
            abstractSerializedData.writeInt32(this.flags);
            abstractSerializedData.writeInt64(this.id);
            if ((this.flags & 1) != 0) {
                this.purpose.serializeToStream(abstractSerializedData);
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

    public static Pair<AccountInstance, TLRPC$InputStorePaymentPurpose> extractDeveloperPayload(Purchase purchase) {
        TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose;
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
                tLRPC$InputStorePaymentPurpose = getPurpose(obfuscatedProfileId);
            } catch (Exception e) {
                FileLog.e("Billing: Extract payload, failed to get purpose", e);
                tLRPC$InputStorePaymentPurpose = null;
            }
            AccountInstance findAccountById = findAccountById(Long.parseLong(new String(Base64.decode(obfuscatedAccountId, 0), Charsets.UTF_8)));
            if (findAccountById == null) {
                FileLog.d("Billing: Extract payload. AccountInstance not found");
                return null;
            }
            return Pair.create(findAccountById, tLRPC$InputStorePaymentPurpose);
        } catch (Exception e2) {
            FileLog.e("Billing: Extract Payload", e2);
            return null;
        }
    }

    public static void cleanupPurchase(Purchase purchase) {
        clearPurpose(purchase.getAccountIdentifiers().getObfuscatedProfileId());
    }
}
