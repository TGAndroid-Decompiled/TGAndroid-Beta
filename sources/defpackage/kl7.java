package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
public class kl7 extends ny0 implements snb {
    public l9c S1;
    public final ViewGroup T1;
    public final Paint U1;
    public float V1;

    public kl7(Context context, ViewGroup viewGroup, vnb vnbVar) {
        super(context, null, true, false, vnbVar);
        this.U1 = new Paint();
        this.u1 = 0.1f;
        this.T1 = viewGroup;
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, 0);
        updateColors();
        this.S1.O(false);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new yt4(this, (byte) 21), this.J0);
        this.S1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return null;
    }

    @Override
    public void P0(float f) {
        this.V1 = f;
        if (this.F != null) {
            this.F.setTranslationY(Math.max((this.b.getY() + f) + this.t0, this.F.getHeight() + (hl.L(56.0f) + hl.m)) - this.F.getBottom());
        }
    }

    @Override
    public final void W(Canvas canvas) {
        float width;
        float f;
        ex0 ex0Var = this.c;
        float height = ex0Var.getHeight();
        float max = Math.max(height - hl.n, this.b.getY() + this.V1 + this.t0);
        if (max >= height) {
            return;
        }
        if (this.b.getWidth() < ex0Var.getWidth()) {
            f = this.b.getX() + this.u0;
            width = (this.b.getX() + this.b.getWidth()) - this.u0;
        } else {
            width = ex0Var.getWidth();
            f = 0.0f;
        }
        canvas.drawRect(f, max, width, height, this.U1);
    }

    public int Z0() {
        return aob.v0(aob.a7, this.J0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.a7));
    }

    @Override
    public void show() {
        boolean z;
        if (getWindow() != null) {
            hl.S(getWindow());
        }
        super.show();
        int Z0 = Z0();
        y0(Z0);
        if (hl.B(Z0) > 0.721f) {
            z = true;
        } else {
            z = false;
        }
        hl.i3(this, z);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final void updateColors() {
        int Z0 = Z0();
        this.U1.setColor(Z0);
        s0(Z0);
        K(Z0);
        ViewGroup viewGroup = this.T1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void y0(int i) {
        super.y0(i);
        hl.o3(this, 0, false, null);
    }
}
