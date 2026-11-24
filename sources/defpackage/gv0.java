package defpackage;

import org.json.JSONObject;
public final class gv0 implements Runnable {
    public final byte a;
    public final String[] b;
    public final int c;
    public final mw0 d;
    public final ow0 e;

    public gv0(String[] strArr, int i, mw0 mw0Var, ow0 ow0Var, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = i;
        this.d = mw0Var;
        this.e = ow0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ow0 ow0Var = this.e;
        mw0 mw0Var = this.d;
        int i = this.c;
        String[] strArr = this.b;
        switch (b) {
            case 0:
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        qw0.t(i, mw0Var, ow0Var, "phone_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr[0]);
                    qw0.t(i, mw0Var, ow0Var, "write_access_requested", jSONObject2);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
