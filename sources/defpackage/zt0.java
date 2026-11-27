package defpackage;

import org.json.JSONObject;
public final class zt0 implements pcc {
    public final byte a;
    public final rv0 b;
    public final pv0 c;

    public zt0(rv0 rv0Var, pv0 pv0Var, byte b) {
        this.a = b;
        this.b = rv0Var;
        this.c = pv0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        pv0 pv0Var = this.c;
        rv0 rv0Var = this.b;
        switch (b) {
            case 0:
                rv0Var.u(pv0Var, "location_requested", (JSONObject) obj);
                return;
            case 1:
                rv0Var.u(pv0Var, "location_requested", (JSONObject) obj);
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    rv0Var.u(pv0Var, "home_screen_added", null);
                    return;
                } else {
                    rv0Var.u(pv0Var, "home_screen_failed", rv0.x("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
