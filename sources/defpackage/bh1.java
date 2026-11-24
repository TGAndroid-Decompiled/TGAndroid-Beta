package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class bh1 extends FrameLayout implements tjb {
    public jia a;
    public tgb b;
    public tl c;
    public wjb d;
    public boolean e;
    public int f;

    public final void a(int i, int i2, boolean z) {
        ea7 ea7Var;
        da7 da7Var = null;
        if (i2 < 0) {
            b(null);
        } else if (i2 < 7) {
            this.f = bkb.v0(bkb.q8[i2], this.d);
        } else {
            na7 q1 = na7.q1(i);
            if (z) {
                ea7Var = q1.E3;
            } else {
                ea7Var = q1.F3;
            }
            if (ea7Var != null) {
                da7Var = ea7Var.d(i2);
            }
            b(da7Var);
        }
        invalidate();
    }

    public final void b(da7 da7Var) {
        wjb wjbVar = this.d;
        if (da7Var == null) {
            int i = bkb.r8;
            if (gl.B(bkb.v0(i, wjbVar)) > 0.8f) {
                this.f = bkb.v0(bkb.m6, wjbVar);
                return;
            } else if (gl.B(bkb.v0(i, wjbVar)) < 0.2f) {
                this.f = bkb.p1(0.5f, bkb.v0(bkb.z8, wjbVar));
                return;
            } else {
                this.f = bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.7f, a18.y0(bkb.v0(i, wjbVar))));
                return;
            }
        }
        this.f = da7Var.e(0, wjbVar);
    }

    public final void c(long j, boolean z, boolean z2) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        tl tlVar = this.c;
        if (i == 0) {
            tlVar.g(null, z2);
            if (this.b == null) {
                this.b = new tgb(k96.M0(2131752299, null), 16.0f, null);
            }
        } else {
            tlVar.j(j, z2);
            this.b = null;
        }
        tlVar.m(z, z2);
    }

    public final void d(TLRPC.Document document) {
        tl tlVar = this.c;
        if (document == null) {
            tlVar.g(null, false);
            if (this.b == null) {
                this.b = new tgb(k96.M0(2131752299, null), 16.0f, null);
            }
        } else {
            tlVar.i(document, false);
            this.b = null;
        }
        tlVar.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i;
        wjb wjbVar = this.d;
        super.dispatchDraw(canvas);
        f();
        tl tlVar = this.c;
        tlVar.k(Integer.valueOf(this.f));
        tgb tgbVar = this.b;
        if (tgbVar != null) {
            canvas2 = canvas;
            tgbVar.c((getMeasuredWidth() - this.b.j()) - gl.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, bkb.v0(bkb.p6, wjbVar), canvas2);
        } else {
            canvas2 = canvas;
            tlVar.draw(canvas2);
        }
        if (this.e) {
            if (wjbVar != null) {
                paint = wjbVar.d("paintDivider");
            } else {
                paint = bkb.j0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (k96.a0) {
                    L = 0.0f;
                } else {
                    L = gl.L(23.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (k96.a0) {
                    i = gl.L(23.0f);
                } else {
                    i = 0;
                }
                canvas2.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i) {
        jia jiaVar = this.a;
        if (i <= 0) {
            jiaVar.i(null);
            return;
        }
        jiaVar.i(new gc(i, this.d, getContext(), false));
        jiaVar.setDrawablePadding(gl.L(6.0f));
    }

    public final void f() {
        tl tlVar = this.c;
        tlVar.setBounds((getWidth() - tlVar.s) - gl.L(21.0f), (getHeight() - tlVar.s) / 2, getWidth() - gl.L(21.0f), (getHeight() + tlVar.s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        jia jiaVar = this.a;
        if (jiaVar != null) {
            jiaVar.setTextColor(bkb.v0(bkb.F6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
