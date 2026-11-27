package defpackage;

import org.json.JSONObject;
public final class gu0 implements Runnable {
    public final byte a;
    public final String[] b;
    public final int c;
    public final nv0 d;
    public final pv0 e;

    public gu0(String[] strArr, int i, nv0 nv0Var, pv0 pv0Var, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = i;
        this.d = nv0Var;
        this.e = pv0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pv0 pv0Var = this.e;
        nv0 nv0Var = this.d;
        int i = this.c;
        String[] strArr = this.b;
        switch (b) {
            case 0:
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        rv0.t(i, nv0Var, pv0Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr[0]);
                    rv0.t(i, nv0Var, pv0Var, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
