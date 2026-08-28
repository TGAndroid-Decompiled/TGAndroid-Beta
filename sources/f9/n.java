package f9;

import n2.p;
import org.json.JSONObject;
public abstract class n {
    public static final p f6025a;

    static {
        s9.d dVar = new s9.d();
        a aVar = a.f5992a;
        dVar.l(n.class, aVar);
        dVar.l(b.class, aVar);
        f6025a = new p(dVar, 21);
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
