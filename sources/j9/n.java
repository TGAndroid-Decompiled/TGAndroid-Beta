package j9;

import org.json.JSONObject;
import org.telegram.ui.Components.ai;
public abstract class n {
    public static final ai f9980a;

    static {
        w9.d dVar = new w9.d();
        a aVar = a.f9947a;
        dVar.b(n.class, aVar);
        dVar.b(b.class, aVar);
        f9980a = new ai(dVar, 19);
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
