package defpackage;

import org.json.JSONObject;
public final class qt0 implements p8c {
    public final byte a;
    public final hv0 b;
    public final ev0 c;

    public qt0(hv0 hv0Var, ev0 ev0Var, byte b) {
        this.a = b;
        this.b = hv0Var;
        this.c = ev0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ev0 ev0Var = this.c;
        hv0 hv0Var = this.b;
        switch (b) {
            case 0:
                hv0Var.u(ev0Var, "location_requested", (JSONObject) obj);
                return;
            case 1:
                hv0Var.u(ev0Var, "location_requested", (JSONObject) obj);
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    hv0Var.u(ev0Var, "home_screen_added", null);
                    return;
                } else {
                    hv0Var.u(ev0Var, "home_screen_failed", hv0.x("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
