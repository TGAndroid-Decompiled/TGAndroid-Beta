package defpackage;

import android.view.View;
public final class wu3 implements Runnable {
    public final int a;
    public final int b;
    public final zu3 c;

    public wu3(zu3 zu3Var, int i, int i2) {
        this.c = zu3Var;
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void run() {
        gb2 gb2Var;
        mu1 mu1Var;
        zu3 zu3Var = this.c;
        jq1 jq1Var = zu3Var.I;
        if (zu3Var.n) {
            int i = 0;
            while (true) {
                if (i < jq1Var.getChildCount()) {
                    View childAt = jq1Var.getChildAt(i);
                    if (childAt instanceof gb2) {
                        gb2Var = (gb2) childAt;
                        String V1 = gb2Var.getMessageObject().V1();
                        if (V1 == null) {
                            V1 = gb2Var.getMessageObject().k.message;
                        }
                        if (gb2Var.getPhotoImage().E() && V1 != null && gb2Var.getMessageObject().e1() == this.a) {
                            break;
                        }
                    }
                    i++;
                } else {
                    gb2Var = null;
                    break;
                }
            }
            if (gb2Var != null && (mu1Var = zu3Var.a) != null) {
                mu1Var.Xa(gb2Var);
                String V12 = gb2Var.getMessageObject().V1();
                if (!ow3.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !gb2Var.getMessageObject().V3() && !gb2Var.getMessageObject().F2()) {
                    try {
                        gb2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                zu3Var.n(gb2Var, this.b, false, true);
            }
        }
    }
}
