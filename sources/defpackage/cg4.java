package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class cg4 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final int c;
    public final View d;

    public cg4(b0b b0bVar, float f, int i) {
        this.a = (byte) 1;
        this.d = b0bVar;
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
                dg4 dg4Var = (dg4) view;
                if (i == 5) {
                    f = 0.0f;
                } else {
                    f = -f2;
                }
                dg4Var.b(f, i + 1);
                dg4Var.E = 0.0f;
                dg4Var.invalidate();
                return;
            case 1:
                b0b b0bVar = (b0b) view;
                b0bVar.d0 = f2;
                if (b0bVar.getValue() != i) {
                    b0bVar.e(b0bVar.getValue());
                }
                b0bVar.invalidate();
                return;
            default:
                ((dxc) view).c(i, f2, false);
                return;
        }
    }

    public cg4(View view, int i, float f, byte b) {
        this.a = b;
        this.d = view;
        this.c = i;
        this.b = f;
    }
}
