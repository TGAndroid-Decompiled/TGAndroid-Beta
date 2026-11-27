package defpackage;

import org.telegram.ui.Components.UndoView;
public final class tt1 implements Runnable {
    public final byte a;
    public final ju1 b;
    public final r47 c;

    public tt1(ju1 ju1Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = ju1Var;
        this.c = r47Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        r47 r47Var = this.c;
        ju1 ju1Var = this.b;
        switch (b) {
            case 0:
                zu1 zu1Var = ju1Var.a;
                zu1Var.i6();
                UndoView undoView = zu1Var.N3;
                if (undoView != null) {
                    if (zu1Var.a0.getVisibility() == 0 && zu1Var.T.getVisibility() != 0) {
                        i = 16;
                    } else {
                        i = 17;
                    }
                    undoView.k(0L, i, r47Var.C0(), null, null, new tt1(ju1Var, r47Var, (byte) 2));
                    return;
                }
                return;
            case 1:
                zu1 zu1Var2 = ju1Var.a;
                zu1Var2.lc = r47Var.e1();
                zu1Var2.mc = 0;
                return;
            default:
                zu1 zu1Var3 = ju1Var.a;
                if (zu1Var3.r5()) {
                    p7a b2 = p7a.b(r47Var.C0(), zu1Var3.l6, zu1Var3.F5, zu1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b2.K = zu1Var3.X6();
                    zu1Var3.getSendMessagesHelper().q0(b2);
                    return;
                }
                return;
        }
    }
}
