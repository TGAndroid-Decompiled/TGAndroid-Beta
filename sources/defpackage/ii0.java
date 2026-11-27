package defpackage;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class ii0 {
    public static void a(HashMap hashMap) {
        if (!hashMap.isEmpty()) {
            return;
        }
        try {
            InputStream open = a.b.getAssets().open("currencies.json");
            String str = gcc.a;
            JSONObject jSONObject = new JSONObject(new String(j51.b(open), lk1.a));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
            }
            open.close();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public static TLRPC.InputStorePaymentPurpose b(String str) {
        cc4.b("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.v(str));
        hi0 a = hi0.a(serializedData.readInt32(true), serializedData);
        serializedData.cleanup();
        if (a.c != null) {
            cc4.b("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return a.c;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(a.b);
        String f = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        cc4.b("BillingUtilities.getPurpose: searching purpose under ".concat(f));
        String string = a.b.getSharedPreferences("purchases", 0).getString(f, null);
        if (string != null) {
            cc4.b("BillingUtilities.getPurpose: got {" + string + "} under " + f);
            SerializedData serializedData3 = new SerializedData(Utilities.v(string));
            hi0 a2 = hi0.a(serializedData3.readInt32(true), serializedData3);
            serializedData3.cleanup();
            return a2.c;
        }
        cc4.b("BillingUtilities.getPurpose: purpose under " + f + " not found");
        xi4.l(qd4.y("no purpose under ", f, " found :("));
        return null;
    }
}
