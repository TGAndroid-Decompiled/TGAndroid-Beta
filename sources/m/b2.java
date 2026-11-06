package m;

import java.util.WeakHashMap;
public final class b2 implements Runnable {
    public final int f19068a;
    public final e2 f19069b;

    public b2(e2 e2Var, int i7) {
        this.f19068a = i7;
        this.f19069b = e2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f19068a;
        e2 e2Var = this.f19069b;
        switch (i7) {
            case 0:
                s1 s1Var = e2Var.f19087c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    return;
                }
                return;
            default:
                s1 s1Var2 = e2Var.f19087c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f54073a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f19087c.getCount() > e2Var.f19087c.getChildCount() && e2Var.f19087c.getChildCount() <= e2Var.f19095y) {
                        e2Var.O.setInputMethodMode(2);
                        e2Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
