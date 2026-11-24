package defpackage;

import org.telegram.tgnet.TLRPC;
public final class yw0 implements qac {
    public final byte a;
    public final wx0 b;

    public yw0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                ox0 ox0Var = wx0Var.E;
                if (ox0Var != null) {
                    if (bool.booleanValue()) {
                        ox0Var.Q = System.currentTimeMillis();
                        ox0Var.v("main_button_pressed", null);
                        return;
                    }
                    ox0Var.Q = System.currentTimeMillis();
                    ox0Var.v("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                gm.c3(new x30(wx0Var, (TLRPC.UserFull) obj, (byte) 21));
                return;
        }
    }
}
