package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ee4 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final int c;
    public final View d;

    public ee4(yva yvaVar, float f, int i) {
        this.a = (byte) 1;
        this.d = yvaVar;
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
                fe4 fe4Var = (fe4) view;
                if (i == 5) {
                    f = 0.0f;
                } else {
                    f = -f2;
                }
                fe4Var.b(f, i + 1);
                fe4Var.E = 0.0f;
                fe4Var.invalidate();
                return;
            case 1:
                yva yvaVar = (yva) view;
                yvaVar.d0 = f2;
                if (yvaVar.getValue() != i) {
                    yvaVar.e(yvaVar.getValue());
                }
                yvaVar.invalidate();
                return;
            default:
                ((nsc) view).c(i, f2, false);
                return;
        }
    }

    public ee4(View view, int i, float f, byte b) {
        this.a = b;
        this.d = view;
        this.c = i;
        this.b = f;
    }
}
