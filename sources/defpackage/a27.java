package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class a27 extends d79 {
    public boolean f3;
    public boolean g3;
    public int h3;
    public int i3;
    public final b27 j3;

    public a27(b27 b27Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.j3 = b27Var;
        setOnScrollListener(new to2(this, (byte) 24));
        i(new z17(this));
    }

    @Override
    public final void n0(int i) {
        b27 b27Var = this.j3;
        b27Var.invalidate();
        b27Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        b27 b27Var = this.j3;
        r17 r17Var = b27Var.f;
        uu7 uu7Var = b27Var.e;
        boolean z2 = b27Var.c.t;
        boolean z3 = this.g3;
        if (!z2 ? z3 || uu7Var == null || uu7Var.e == null || !uu7Var.f || motionEvent.getY() >= uu7Var.e.getBottom() : z3 || uu7Var == null || uu7Var.e == null || !uu7Var.f || motionEvent.getY() <= uu7Var.e.getTop()) {
            if (!this.f3 && rw2.e().g(motionEvent, b27Var.b, null, this.o2)) {
                z = true;
            } else {
                z = false;
            }
            if (((r17Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && r17Var.N()) {
                if (r17Var.o0 == null) {
                    h04 h04Var = new h04(r17Var, r17Var.f, r17Var.n, r17Var.r, (byte) 1);
                    r17Var.o0 = h04Var;
                    h04Var.a();
                }
                r17Var.o0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int M0;
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        b27 b27Var = this.j3;
        boolean g = b27Var.g();
        x46 currentLayoutManager = b27Var.getCurrentLayoutManager();
        if (g) {
            M0 = currentLayoutManager.K0();
        } else {
            M0 = currentLayoutManager.M0();
        }
        View m = currentLayoutManager.m(M0);
        if (m != null) {
            int top = m.getTop();
            if (g) {
                i6 = 0;
            } else {
                i6 = this.i3 - i8;
            }
            i5 = top - i6;
        } else {
            i5 = 0;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (b27Var.I) {
            b27Var.H = true;
            currentLayoutManager.g1(0, 100000);
            super.onLayout(false, i, i2, i3, i4);
            b27Var.H = false;
            b27Var.I = false;
        } else if (M0 != -1 && i7 == this.h3 && i8 - this.i3 != 0) {
            b27Var.H = true;
            currentLayoutManager.h1(M0, i5, false);
            super.onLayout(false, i, i2, i3, i4);
            b27Var.H = false;
        }
        this.i3 = i8;
        this.h3 = i7;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        b27 b27Var = this.j3;
        uu7 uu7Var = b27Var.e;
        if (uu7Var != null) {
            uu7Var.d = Integer.valueOf(size);
            tb tbVar = uu7Var.e;
            if (tbVar != null) {
                tbVar.requestLayout();
            }
        }
        float min = (int) Math.min(hl.L(126.0f), hl.q.y * 0.22f);
        b27Var.w = min;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b27 b27Var = this.j3;
        uu7 uu7Var = b27Var.e;
        boolean z = b27Var.c.t;
        boolean z2 = this.g3;
        if (z) {
            if (!z2 && uu7Var != null && uu7Var.e != null && uu7Var.f && motionEvent.getY() > uu7Var.e.getTop()) {
                return false;
            }
        } else if (!z2 && uu7Var != null && uu7Var.e != null && uu7Var.f && motionEvent.getY() < uu7Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.j3.H) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        b27 b27Var = this.j3;
        b27Var.invalidate();
        b27Var.b();
    }
}
