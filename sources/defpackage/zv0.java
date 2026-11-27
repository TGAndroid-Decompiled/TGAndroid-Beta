package defpackage;

import org.telegram.tgnet.TLRPC;
public final class zv0 implements pcc {
    public final byte a;
    public final xw0 b;

    public zv0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                pw0 pw0Var = xw0Var.E;
                if (pw0Var != null) {
                    if (bool.booleanValue()) {
                        pw0Var.Q = System.currentTimeMillis();
                        pw0Var.v("main_button_pressed", null);
                        return;
                    }
                    pw0Var.Q = System.currentTimeMillis();
                    pw0Var.v("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                hl.c3(new a30(xw0Var, (TLRPC.UserFull) obj, (byte) 20));
                return;
        }
    }
}
