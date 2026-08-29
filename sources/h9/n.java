package h9;

import org.json.JSONObject;
public abstract class n {
    public static final o1.a f7972a;

    static {
        u9.d dVar = new u9.d();
        a aVar = a.f7939a;
        dVar.i(n.class, aVar);
        dVar.i(b.class, aVar);
        f7972a = new o1.a(dVar, 27);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j10 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j10);
    }
}
