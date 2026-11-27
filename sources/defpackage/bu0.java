package defpackage;

import org.json.JSONObject;
import org.telegram.ui.LaunchActivity;
public final class bu0 implements Runnable {
    public final byte a;
    public final rv0 b;

    public bu0(rv0 rv0Var, byte b) {
        this.a = b;
        this.b = rv0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = false;
        rv0 rv0Var = this.b;
        switch (b) {
            case 0:
                uu0 uu0Var = rv0Var.c;
                if (uu0Var != null) {
                    uu0Var.b();
                }
                LaunchActivity.K();
                return;
            case 1:
                if (rv0Var.T) {
                    rv0Var.T = false;
                    uu0 uu0Var2 = rv0Var.c;
                    if (uu0Var2 != null) {
                        uu0Var2.t(false);
                    }
                }
                rv0Var.a();
                rv0Var.O = false;
                rv0Var.Q = 0L;
                rv0Var.U = false;
                nv0 nv0Var = rv0Var.a;
                if (nv0Var != null) {
                    nv0Var.onResume();
                    rv0Var.a.reload();
                    return;
                }
                return;
            default:
                pv0 pv0Var = rv0Var.K0;
                tq0 tq0Var = rv0Var.l0;
                tq0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", tq0Var.c());
                    if (tq0Var.c()) {
                        jSONObject.put("access_requested", tq0Var.d);
                        if (tq0Var.d) {
                            if (tq0Var.e && tq0Var.a()) {
                                z = true;
                            }
                            jSONObject.put("access_granted", z);
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                rv0Var.u(pv0Var, "location_checked", jSONObject);
                return;
        }
    }
}
