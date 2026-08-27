package gf;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

public abstract class b {
    public static void a(Map map) {
        if (map.isEmpty()) {
            try {
                InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("currencies.json");
                JSONObject jSONObject = new JSONObject(new String(d5.g0.R(inputStreamOpen), o8.d.f19363c));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
                }
                inputStreamOpen.close();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public static TLRPC.InputStorePaymentPurpose b(String str) {
        FileLog.d("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
        a aVarA = a.a(serializedData, serializedData.readInt32(true));
        serializedData.cleanup();
        if (aVarA.f6928c != null) {
            FileLog.d("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return aVarA.f6928c;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(aVarA.f6927b);
        String strBytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        FileLog.d("BillingUtilities.getPurpose: searching purpose under " + strBytesToHex);
        String string = ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).getString(strBytesToHex, null);
        if (string == null) {
            FileLog.d("BillingUtilities.getPurpose: purpose under " + strBytesToHex + " not found");
            throw new RuntimeException(a9.p.m("no purpose under ", strBytesToHex, " found :("));
        }
        FileLog.d("BillingUtilities.getPurpose: got {" + string + "} under " + strBytesToHex);
        SerializedData serializedData3 = new SerializedData(Utilities.hexToBytes(string));
        a aVarA2 = a.a(serializedData3, serializedData3.readInt32(true));
        serializedData3.cleanup();
        return aVarA2.f6928c;
    }
}
