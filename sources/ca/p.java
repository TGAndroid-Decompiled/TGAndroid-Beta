package ca;

import org.json.JSONObject;
public abstract class p {
    public static final org.telegram.ui.Components.m f6036a;

    static {
        pa.d dVar = new pa.d();
        a aVar = a.f5997a;
        dVar.b(p.class, aVar);
        dVar.b(b.class, aVar);
        f6036a = new org.telegram.ui.Components.m(dVar);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j3 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j3);
    }
}
