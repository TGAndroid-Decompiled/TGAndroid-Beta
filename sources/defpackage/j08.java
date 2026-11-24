package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class j08 extends o39 {
    public final boolean f3;
    public final t08 g3;

    public j08(t08 t08Var, Context context, wjb wjbVar, int i) {
        super(context, wjbVar);
        this.g3 = t08Var;
        this.f3 = i;
    }

    @Override
    public final Integer W0(int i) {
        t08 t08Var = this.g3;
        if ((i >= t08Var.c0 && i < t08Var.d0) || (i >= t08Var.e0 && i < t08Var.f0)) {
            return 0;
        }
        return super.W0(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        t08 t08Var = this.g3;
        z08 z08Var = t08Var.F;
        if (t08Var.H && z08Var != null && t08Var.G != null) {
            int save = canvas.save();
            canvas.translate(z08Var.getLeft() + t08Var.G.getLeft(), t08Var.G.getTop());
            z08Var.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        xsa xsaVar;
        super.onLayout(z, i, i2, i3, i4);
        t08 t08Var = this.g3;
        t08Var.h();
        if (t08Var.L != null) {
            if (t08Var.K != null && t08Var.b()) {
                t08Var.K.l(false);
                return;
            }
            return;
        }
        a18 a18Var = t08Var.q0;
        if (this.f3) {
            xsaVar = a18Var.c;
        } else {
            xsaVar = a18Var.b;
        }
        if (xsaVar != null && t08Var.b()) {
            xsaVar.a();
        }
    }
}
