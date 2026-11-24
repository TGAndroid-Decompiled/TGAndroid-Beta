package defpackage;

import java.util.WeakHashMap;
public final class m76 implements Runnable {
    public final byte a;
    public final o76 b;

    public m76(o76 o76Var, byte b) {
        this.a = b;
        this.b = o76Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o76 o76Var = this.b;
        switch (b) {
            case 0:
                os3 os3Var = o76Var.c;
                if (os3Var != null) {
                    os3Var.setListSelectionHidden(true);
                    os3Var.requestLayout();
                    return;
                }
                return;
            default:
                os3 os3Var2 = o76Var.c;
                if (os3Var2 != null) {
                    WeakHashMap weakHashMap = kfc.a;
                    if (os3Var2.isAttachedToWindow() && o76Var.c.getCount() > o76Var.c.getChildCount() && o76Var.c.getChildCount() <= o76Var.y) {
                        o76Var.P.setInputMethodMode(2);
                        o76Var.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
