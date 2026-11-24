package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class t17 extends r59 {
    public boolean f3;
    public boolean g3;
    public int h3;
    public int i3;
    public final u17 j3;

    public t17(u17 u17Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.j3 = u17Var;
        setOnScrollListener(new ip2(this, (byte) 25));
        i(new s17(this));
    }

    @Override
    public final void m0(int i) {
        u17 u17Var = this.j3;
        u17Var.invalidate();
        u17Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        u17 u17Var = this.j3;
        k17 k17Var = u17Var.f;
        pt7 pt7Var = u17Var.e;
        boolean z2 = u17Var.c.t;
        boolean z3 = this.g3;
        if (!z2 ? z3 || pt7Var == null || pt7Var.e == null || !pt7Var.f || motionEvent.getY() >= pt7Var.e.getBottom() : z3 || pt7Var == null || pt7Var.e == null || !pt7Var.f || motionEvent.getY() <= pt7Var.e.getTop()) {
            if (!this.f3 && hx2.e().g(motionEvent, u17Var.b, null, this.o2)) {
                z = true;
            } else {
                z = false;
            }
            if (((k17Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && k17Var.N()) {
                if (k17Var.o0 == null) {
                    w04 w04Var = new w04(k17Var, k17Var.f, k17Var.n, k17Var.r, (byte) 1);
                    k17Var.o0 = w04Var;
                    w04Var.a();
                }
                k17Var.o0.b();
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
        u17 u17Var = this.j3;
        boolean g = u17Var.g();
        u46 currentLayoutManager = u17Var.getCurrentLayoutManager();
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
        if (u17Var.I) {
            u17Var.H = true;
            currentLayoutManager.g1(0, 100000);
            super.onLayout(false, i, i2, i3, i4);
            u17Var.H = false;
            u17Var.I = false;
        } else if (M0 != -1 && i7 == this.h3 && i8 - this.i3 != 0) {
            u17Var.H = true;
            currentLayoutManager.h1(M0, i5, false);
            super.onLayout(false, i, i2, i3, i4);
            u17Var.H = false;
        }
        this.i3 = i8;
        this.h3 = i7;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        u17 u17Var = this.j3;
        pt7 pt7Var = u17Var.e;
        if (pt7Var != null) {
            pt7Var.d = Integer.valueOf(size);
            sb sbVar = pt7Var.e;
            if (sbVar != null) {
                sbVar.requestLayout();
            }
        }
        float min = (int) Math.min(gm.L(126.0f), gm.q.y * 0.22f);
        u17Var.w = min;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u17 u17Var = this.j3;
        pt7 pt7Var = u17Var.e;
        boolean z = u17Var.c.t;
        boolean z2 = this.g3;
        if (z) {
            if (!z2 && pt7Var != null && pt7Var.e != null && pt7Var.f && motionEvent.getY() > pt7Var.e.getTop()) {
                return false;
            }
        } else if (!z2 && pt7Var != null && pt7Var.e != null && pt7Var.f && motionEvent.getY() < pt7Var.e.getBottom()) {
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
        u17 u17Var = this.j3;
        u17Var.invalidate();
        u17Var.b();
    }
}
