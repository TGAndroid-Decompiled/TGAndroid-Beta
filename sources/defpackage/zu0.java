package defpackage;

import org.json.JSONObject;
public final class zu0 implements qac {
    public final byte a;
    public final qw0 b;
    public final ow0 c;

    public zu0(qw0 qw0Var, ow0 ow0Var, byte b) {
        this.a = b;
        this.b = qw0Var;
        this.c = ow0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ow0 ow0Var = this.c;
        qw0 qw0Var = this.b;
        switch (b) {
            case 0:
                qw0Var.u(ow0Var, "location_requested", (JSONObject) obj);
                return;
            case 1:
                qw0Var.u(ow0Var, "location_requested", (JSONObject) obj);
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    qw0Var.u(ow0Var, "home_screen_added", null);
                    return;
                } else {
                    qw0Var.u(ow0Var, "home_screen_failed", qw0.x("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
