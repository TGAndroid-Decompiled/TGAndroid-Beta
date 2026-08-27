package g9;

import n2.b0;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class n {

    public static final b0 f6825a;

    static {
        t9.d dVar = new t9.d();
        a aVar = a.f6792a;
        dVar.d(n.class, aVar);
        dVar.d(b.class, aVar);
        f6825a = new b0(dVar, 22);
    }

    public static b a(String str) throws JSONException {
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
