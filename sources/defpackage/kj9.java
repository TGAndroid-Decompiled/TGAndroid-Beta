package defpackage;

import org.json.JSONObject;
public abstract class kj9 {
    public static final gi3 a;

    static {
        qu5 qu5Var = new qu5();
        m70 m70Var = m70.a;
        qu5Var.a(kj9.class, m70Var);
        qu5Var.a(ia0.class, m70Var);
        a = new gi3(qu5Var);
    }

    public static ia0 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new ia0(string, string2, string3, string4, j);
    }
}
