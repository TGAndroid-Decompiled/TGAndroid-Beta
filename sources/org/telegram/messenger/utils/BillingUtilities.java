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
import org.telegram.tgnet.SerializedData;
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
        String encodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(Charsets.UTF_8), 0);
        SerializedData serializedData = new SerializedData(tLRPC$InputStorePaymentPurpose.getObjectSize());
        tLRPC$InputStorePaymentPurpose.serializeToStream(serializedData);
        String encodeToString2 = Base64.encodeToString(serializedData.toByteArray(), 0);
        serializedData.cleanup();
        return Pair.create(encodeToString, encodeToString2);
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
            SerializedData serializedData = new SerializedData(Base64.decode(obfuscatedProfileId, 0));
            TLRPC$InputStorePaymentPurpose TLdeserialize = TLRPC$InputStorePaymentPurpose.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            serializedData.cleanup();
            AccountInstance findAccountById = findAccountById(Long.parseLong(new String(Base64.decode(obfuscatedAccountId, 0), Charsets.UTF_8)));
            if (findAccountById == null) {
                FileLog.d("Billing: Extract payload. AccountInstance not found");
                return null;
            }
            return Pair.create(findAccountById, TLdeserialize);
        } catch (Exception e) {
            FileLog.e("Billing: Extract Payload", e);
            return null;
        }
    }
}
