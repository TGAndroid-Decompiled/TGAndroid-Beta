package defpackage;

import java.util.WeakHashMap;
public final class m56 implements Runnable {
    public final byte a;
    public final o56 b;

    public m56(o56 o56Var, byte b) {
        this.a = b;
        this.b = o56Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o56 o56Var = this.b;
        switch (b) {
            case 0:
                er3 er3Var = o56Var.c;
                if (er3Var != null) {
                    er3Var.setListSelectionHidden(true);
                    er3Var.requestLayout();
                    return;
                }
                return;
            default:
                er3 er3Var2 = o56Var.c;
                if (er3Var2 != null) {
                    WeakHashMap weakHashMap = jdc.a;
                    if (er3Var2.isAttachedToWindow() && o56Var.c.getCount() > o56Var.c.getChildCount() && o56Var.c.getChildCount() <= o56Var.y) {
                        o56Var.P.setInputMethodMode(2);
                        o56Var.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
