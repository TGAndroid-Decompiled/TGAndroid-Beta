package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class tz6 extends o39 {
    public boolean f3;
    public boolean g3;
    public int h3;
    public int i3;
    public final uz6 j3;

    public tz6(uz6 uz6Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.j3 = uz6Var;
        setOnScrollListener(new ao2(this, (byte) 24));
        i(new sz6(this));
    }

    @Override
    public final void m0(int i) {
        uz6 uz6Var = this.j3;
        uz6Var.invalidate();
        uz6Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        uz6 uz6Var = this.j3;
        kz6 kz6Var = uz6Var.f;
        or7 or7Var = uz6Var.e;
        boolean z2 = uz6Var.c.t;
        boolean z3 = this.g3;
        if (!z2 ? z3 || or7Var == null || or7Var.e == null || !or7Var.f || motionEvent.getY() >= or7Var.e.getBottom() : z3 || or7Var == null || or7Var.e == null || !or7Var.f || motionEvent.getY() <= or7Var.e.getTop()) {
            if (!this.f3 && xv2.e().g(motionEvent, uz6Var.b, null, this.o2)) {
                z = true;
            } else {
                z = false;
            }
            if (((kz6Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && kz6Var.N()) {
                if (kz6Var.o0 == null) {
                    mz3 mz3Var = new mz3(kz6Var, kz6Var.f, kz6Var.n, kz6Var.r, (byte) 1);
                    kz6Var.o0 = mz3Var;
                    mz3Var.a();
                }
                kz6Var.o0.b();
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
        uz6 uz6Var = this.j3;
        boolean g = uz6Var.g();
        t26 currentLayoutManager = uz6Var.getCurrentLayoutManager();
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
        if (uz6Var.I) {
            uz6Var.H = true;
            currentLayoutManager.g1(0, 100000);
            super.onLayout(false, i, i2, i3, i4);
            uz6Var.H = false;
            uz6Var.I = false;
        } else if (M0 != -1 && i7 == this.h3 && i8 - this.i3 != 0) {
            uz6Var.H = true;
            currentLayoutManager.h1(M0, i5, false);
            super.onLayout(false, i, i2, i3, i4);
            uz6Var.H = false;
        }
        this.i3 = i8;
        this.h3 = i7;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        uz6 uz6Var = this.j3;
        or7 or7Var = uz6Var.e;
        if (or7Var != null) {
            or7Var.d = Integer.valueOf(size);
            sb sbVar = or7Var.e;
            if (sbVar != null) {
                sbVar.requestLayout();
            }
        }
        float min = (int) Math.min(gl.L(126.0f), gl.q.y * 0.22f);
        uz6Var.w = min;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uz6 uz6Var = this.j3;
        or7 or7Var = uz6Var.e;
        boolean z = uz6Var.c.t;
        boolean z2 = this.g3;
        if (z) {
            if (!z2 && or7Var != null && or7Var.e != null && or7Var.f && motionEvent.getY() > or7Var.e.getTop()) {
                return false;
            }
        } else if (!z2 && or7Var != null && or7Var.e != null && or7Var.f && motionEvent.getY() < or7Var.e.getBottom()) {
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
        uz6 uz6Var = this.j3;
        uz6Var.invalidate();
        uz6Var.b();
    }
}
