package bg;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class b {
    public static void a(HashMap hashMap) {
        if (!hashMap.isEmpty()) {
            return;
        }
        try {
            InputStream open = org.telegram.messenger.t0.f25566b.getAssets().open("currencies.json");
            String str = h2.m0.f14112a;
            JSONObject jSONObject = new JSONObject(new String(i9.f.b(open), g9.j.f13590a));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
            }
            open.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static TLRPC.InputStorePaymentPurpose b(String str) {
        a8.b("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.v(str));
        a a10 = a.a(serializedData.readInt32(true), serializedData);
        serializedData.cleanup();
        if (a10.f3234c != null) {
            a8.b("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return a10.f3234c;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(a10.f3233b);
        String f10 = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        a8.b("BillingUtilities.getPurpose: searching purpose under ".concat(f10));
        String string = org.telegram.messenger.t0.f25566b.getSharedPreferences("purchases", 0).getString(f10, null);
        if (string != null) {
            a8.b("BillingUtilities.getPurpose: got {" + string + "} under " + f10);
            SerializedData serializedData3 = new SerializedData(Utilities.v(string));
            a a11 = a.a(serializedData3.readInt32(true), serializedData3);
            serializedData3.cleanup();
            return a11.f3234c;
        }
        a8.b("BillingUtilities.getPurpose: purpose under " + f10 + " not found");
        throw new RuntimeException(a8.p0.p("no purpose under ", f10, " found :("));
    }
}
