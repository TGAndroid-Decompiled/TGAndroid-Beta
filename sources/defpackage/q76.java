package defpackage;

import java.util.WeakHashMap;
public final class q76 implements Runnable {
    public final byte a;
    public final s76 b;

    public q76(s76 s76Var, byte b) {
        this.a = b;
        this.b = s76Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        s76 s76Var = this.b;
        switch (b) {
            case 0:
                vr3 vr3Var = s76Var.c;
                if (vr3Var != null) {
                    vr3Var.setListSelectionHidden(true);
                    vr3Var.requestLayout();
                    return;
                }
                return;
            default:
                vr3 vr3Var2 = s76Var.c;
                if (vr3Var2 != null) {
                    WeakHashMap weakHashMap = ihc.a;
                    if (vr3Var2.isAttachedToWindow() && s76Var.c.getCount() > s76Var.c.getChildCount() && s76Var.c.getChildCount() <= s76Var.y) {
                        s76Var.P.setInputMethodMode(2);
                        s76Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
