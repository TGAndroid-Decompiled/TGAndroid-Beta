package defpackage;

import org.json.JSONObject;
public final class xt0 implements Runnable {
    public final byte a;
    public final String[] b;
    public final int c;
    public final cv0 d;
    public final ev0 e;

    public xt0(String[] strArr, int i, cv0 cv0Var, ev0 ev0Var, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = i;
        this.d = cv0Var;
        this.e = ev0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ev0 ev0Var = this.e;
        cv0 cv0Var = this.d;
        int i = this.c;
        String[] strArr = this.b;
        switch (b) {
            case 0:
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        hv0.t(i, cv0Var, ev0Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr[0]);
                    hv0.t(i, cv0Var, ev0Var, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
