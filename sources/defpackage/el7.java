package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
public class el7 extends mz0 implements vlb {
    public l7c S1;
    public final ViewGroup T1;
    public final Paint U1;
    public float V1;

    public el7(Context context, ViewGroup viewGroup, ylb ylbVar) {
        super(context, null, true, false, ylbVar);
        this.U1 = new Paint();
        this.u1 = 0.1f;
        this.T1 = viewGroup;
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, 0);
        updateColors();
        this.S1.O(false);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new vt4(this, (byte) 21), this.J0);
        this.S1 = l7cVar;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return null;
    }

    @Override
    public void O0(float f) {
        this.V1 = f;
        if (this.F != null) {
            this.F.setTranslationY(Math.max((this.b.getY() + f) + this.t0, this.F.getHeight() + (gm.L(56.0f) + gm.m)) - this.F.getBottom());
        }
    }

    @Override
    public final void W(Canvas canvas) {
        float width;
        float f;
        dy0 dy0Var = this.c;
        float height = dy0Var.getHeight();
        float max = Math.max(height - gm.n, this.b.getY() + this.V1 + this.t0);
        if (max >= height) {
            return;
        }
        if (this.b.getWidth() < dy0Var.getWidth()) {
            f = this.b.getX() + this.u0;
            width = (this.b.getX() + this.b.getWidth()) - this.u0;
        } else {
            width = dy0Var.getWidth();
            f = 0.0f;
        }
        canvas.drawRect(f, max, width, height, this.U1);
    }

    public int Y0() {
        return cmb.v0(cmb.Z6, this.J0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Z6));
    }

    @Override
    public void show() {
        boolean z;
        if (getWindow() != null) {
            gm.S(getWindow());
        }
        super.show();
        int Y0 = Y0();
        x0(Y0);
        if (gm.B(Y0) > 0.721f) {
            z = true;
        } else {
            z = false;
        }
        gm.i3(this, z);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final void updateColors() {
        int Y0 = Y0();
        this.U1.setColor(Y0);
        s0(Y0);
        K(Y0);
        ViewGroup viewGroup = this.T1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void x0(int i) {
        super.x0(i);
        gm.o3(this, 0, false, null);
    }
}
