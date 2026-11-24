package defpackage;

import org.json.JSONObject;
import org.telegram.ui.LaunchActivity;
public final class bv0 implements Runnable {
    public final byte a;
    public final qw0 b;

    public bv0(qw0 qw0Var, byte b) {
        this.a = b;
        this.b = qw0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = false;
        qw0 qw0Var = this.b;
        switch (b) {
            case 0:
                uv0 uv0Var = qw0Var.c;
                if (uv0Var != null) {
                    uv0Var.b();
                }
                LaunchActivity.K();
                return;
            case 1:
                if (qw0Var.T) {
                    qw0Var.T = false;
                    uv0 uv0Var2 = qw0Var.c;
                    if (uv0Var2 != null) {
                        uv0Var2.t(false);
                    }
                }
                qw0Var.a();
                qw0Var.O = false;
                qw0Var.Q = 0L;
                qw0Var.U = false;
                mw0 mw0Var = qw0Var.a;
                if (mw0Var != null) {
                    mw0Var.onResume();
                    qw0Var.a.reload();
                    return;
                }
                return;
            default:
                ow0 ow0Var = qw0Var.K0;
                tr0 tr0Var = qw0Var.l0;
                tr0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", tr0Var.c());
                    if (tr0Var.c()) {
                        jSONObject.put("access_requested", tr0Var.d);
                        if (tr0Var.d) {
                            if (tr0Var.e && tr0Var.a()) {
                                z = true;
                            }
                            jSONObject.put("access_granted", z);
                        }
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                qw0Var.u(ow0Var, "location_checked", jSONObject);
                return;
        }
    }
}
