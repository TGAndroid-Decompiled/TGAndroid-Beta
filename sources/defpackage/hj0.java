package defpackage;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class hj0 {
    public static void a(HashMap hashMap) {
        if (!hashMap.isEmpty()) {
            return;
        }
        try {
            InputStream open = a.b.getAssets().open("currencies.json");
            String str = hac.a;
            JSONObject jSONObject = new JSONObject(new String(i61.b(open), kl1.a));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
            }
            open.close();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public static TLRPC.InputStorePaymentPurpose b(String str) {
        fc4.b("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.v(str));
        gj0 a = gj0.a(serializedData.readInt32(true), serializedData);
        serializedData.cleanup();
        if (a.c != null) {
            fc4.b("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return a.c;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(a.b);
        String f = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        fc4.b("BillingUtilities.getPurpose: searching purpose under ".concat(f));
        String string = a.b.getSharedPreferences("purchases", 0).getString(f, null);
        if (string != null) {
            fc4.b("BillingUtilities.getPurpose: got {" + string + "} under " + f);
            SerializedData serializedData3 = new SerializedData(Utilities.v(string));
            gj0 a2 = gj0.a(serializedData3.readInt32(true), serializedData3);
            serializedData3.cleanup();
            return a2.c;
        }
        fc4.b("BillingUtilities.getPurpose: purpose under " + f + " not found");
        zo4.k(kt6.o("no purpose under ", f, " found :("));
        return null;
    }
}
