package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
public class cj7 extends fy0 implements tjb {
    public l5c S1;
    public final ViewGroup T1;
    public final Paint U1;
    public float V1;

    public cj7(Context context, ViewGroup viewGroup, wjb wjbVar) {
        super(context, null, true, false, wjbVar);
        this.U1 = new Paint();
        this.u1 = 0.1f;
        this.T1 = viewGroup;
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, 0);
        updateColors();
        this.S1.O(false);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new ur4(this, (byte) 21), this.J0);
        this.S1 = l5cVar;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return null;
    }

    @Override
    public void O0(float f) {
        this.V1 = f;
        if (this.F != null) {
            this.F.setTranslationY(Math.max((this.b.getY() + f) + this.t0, this.F.getHeight() + (gl.L(56.0f) + gl.m)) - this.F.getBottom());
        }
    }

    @Override
    public final void W(Canvas canvas) {
        float width;
        float f;
        ww0 ww0Var = this.c;
        float height = ww0Var.getHeight();
        float max = Math.max(height - gl.n, this.b.getY() + this.V1 + this.t0);
        if (max >= height) {
            return;
        }
        if (this.b.getWidth() < ww0Var.getWidth()) {
            f = this.b.getX() + this.u0;
            width = (this.b.getX() + this.b.getWidth()) - this.u0;
        } else {
            width = ww0Var.getWidth();
            f = 0.0f;
        }
        canvas.drawRect(f, max, width, height, this.U1);
    }

    public int Y0() {
        return bkb.v0(bkb.Z6, this.J0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Z6));
    }

    @Override
    public void show() {
        boolean z;
        if (getWindow() != null) {
            gl.S(getWindow());
        }
        super.show();
        int Y0 = Y0();
        x0(Y0);
        if (gl.B(Y0) > 0.721f) {
            z = true;
        } else {
            z = false;
        }
        gl.j3(this, z);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final void updateColors() {
        int Y0 = Y0();
        this.U1.setColor(Y0);
        s0(Y0);
        L(Y0);
        ViewGroup viewGroup = this.T1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void x0(int i) {
        super.x0(i);
        gl.p3(this, 0, false, null);
    }
}
