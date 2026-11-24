package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class m28 extends r59 {
    public final boolean f3;
    public final w28 g3;

    public m28(w28 w28Var, Context context, ylb ylbVar, int i) {
        super(context, ylbVar);
        this.g3 = w28Var;
        this.f3 = i;
    }

    @Override
    public final Integer W0(int i) {
        w28 w28Var = this.g3;
        if ((i >= w28Var.c0 && i < w28Var.d0) || (i >= w28Var.e0 && i < w28Var.f0)) {
            return 0;
        }
        return super.W0(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        w28 w28Var = this.g3;
        c38 c38Var = w28Var.F;
        if (w28Var.H && c38Var != null && w28Var.G != null) {
            int save = canvas.save();
            canvas.translate(c38Var.getLeft() + w28Var.G.getLeft(), w28Var.G.getTop());
            c38Var.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ava avaVar;
        super.onLayout(z, i, i2, i3, i4);
        w28 w28Var = this.g3;
        w28Var.h();
        if (w28Var.L != null) {
            if (w28Var.K != null && w28Var.b()) {
                w28Var.K.l(false);
                return;
            }
            return;
        }
        d38 d38Var = w28Var.q0;
        if (this.f3) {
            avaVar = d38Var.c;
        } else {
            avaVar = d38Var.b;
        }
        if (avaVar != null && w28Var.b()) {
            avaVar.a();
        }
    }
}
