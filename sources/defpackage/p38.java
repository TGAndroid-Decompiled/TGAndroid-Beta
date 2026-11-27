package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class p38 extends d79 {
    public final boolean f3;
    public final a48 g3;

    public p38(a48 a48Var, Context context, vnb vnbVar, int i) {
        super(context, vnbVar);
        this.g3 = a48Var;
        this.f3 = i;
    }

    @Override
    public final Integer X0(int i) {
        a48 a48Var = this.g3;
        if ((i >= a48Var.c0 && i < a48Var.d0) || (i >= a48Var.e0 && i < a48Var.f0)) {
            return 0;
        }
        return super.X0(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        a48 a48Var = this.g3;
        g48 g48Var = a48Var.F;
        if (a48Var.H && g48Var != null && a48Var.G != null) {
            int save = canvas.save();
            canvas.translate(g48Var.getLeft() + a48Var.G.getLeft(), a48Var.G.getTop());
            g48Var.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        axa axaVar;
        super.onLayout(z, i, i2, i3, i4);
        a48 a48Var = this.g3;
        a48Var.h();
        if (a48Var.L != null) {
            if (a48Var.K != null && a48Var.b()) {
                a48Var.K.o(false);
                return;
            }
            return;
        }
        h48 h48Var = a48Var.q0;
        if (this.f3) {
            axaVar = h48Var.c;
        } else {
            axaVar = h48Var.b;
        }
        if (axaVar != null && a48Var.b()) {
            axaVar.a();
        }
    }
}
