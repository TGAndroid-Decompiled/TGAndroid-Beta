package ba;

import org.json.JSONObject;
public abstract class p {
    public static final hi.d f3204a;

    static {
        oa.d dVar = new oa.d();
        a aVar = a.f3165a;
        dVar.c(p.class, aVar);
        dVar.c(b.class, aVar);
        f3204a = new hi.d(dVar, 19);
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
