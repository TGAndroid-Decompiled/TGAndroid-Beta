package defpackage;

import org.telegram.tgnet.TLRPC;
public final class pv0 implements p8c {
    public final byte a;
    public final ow0 b;

    public pv0(ow0 ow0Var, byte b) {
        this.a = b;
        this.b = ow0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                gw0 gw0Var = ow0Var.E;
                if (gw0Var != null) {
                    if (bool.booleanValue()) {
                        gw0Var.Q = System.currentTimeMillis();
                        gw0Var.v("main_button_pressed", null);
                        return;
                    }
                    gw0Var.Q = System.currentTimeMillis();
                    gw0Var.v("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                gl.c3(new z20(ow0Var, (TLRPC.UserFull) obj, (byte) 20));
                return;
        }
    }
}
