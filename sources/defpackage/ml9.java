package defpackage;

import org.json.JSONObject;
public abstract class ml9 {
    public static final lj4 a;

    static {
        qw5 qw5Var = new qw5();
        m80 m80Var = m80.a;
        qw5Var.a(ml9.class, m80Var);
        qw5Var.a(ib0.class, m80Var);
        a = new lj4(qw5Var);
    }

    public static ib0 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new ib0(string, string2, string3, string4, j);
    }
}
