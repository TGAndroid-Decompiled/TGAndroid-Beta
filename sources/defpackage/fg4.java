package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class fg4 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final int c;
    public final View d;

    public fg4(bya byaVar, float f, int i) {
        this.a = (byte) 1;
        this.d = byaVar;
        this.b = f;
        this.c = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        byte b = this.a;
        float f2 = this.b;
        int i = this.c;
        View view = this.d;
        switch (b) {
            case 0:
                gg4 gg4Var = (gg4) view;
                if (i == 5) {
                    f = 0.0f;
                } else {
                    f = -f2;
                }
                gg4Var.b(f, i + 1);
                gg4Var.E = 0.0f;
                gg4Var.invalidate();
                return;
            case 1:
                bya byaVar = (bya) view;
                byaVar.d0 = f2;
                if (byaVar.getValue() != i) {
                    byaVar.e(byaVar.getValue());
                }
                byaVar.invalidate();
                return;
            default:
                ((puc) view).c(i, f2, false);
                return;
        }
    }

    public fg4(View view, int i, float f, byte b) {
        this.a = b;
        this.d = view;
        this.c = i;
        this.b = f;
    }
}
