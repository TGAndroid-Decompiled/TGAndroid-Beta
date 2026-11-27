package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class kh1 extends FrameLayout implements snb {
    public ema a;
    public pkb b;
    public ul c;
    public vnb d;
    public boolean e;
    public int f;

    public final void a(int i, int i2, boolean z) {
        lc7 lc7Var;
        kc7 kc7Var = null;
        if (i2 < 0) {
            b(null);
        } else if (i2 < 7) {
            this.f = aob.v0(aob.r8[i2], this.d);
        } else {
            uc7 s1 = uc7.s1(i);
            if (z) {
                lc7Var = s1.E3;
            } else {
                lc7Var = s1.F3;
            }
            if (lc7Var != null) {
                kc7Var = lc7Var.d(i2);
            }
            b(kc7Var);
        }
        invalidate();
    }

    public final void b(kc7 kc7Var) {
        vnb vnbVar = this.d;
        if (kc7Var == null) {
            int i = aob.s8;
            if (hl.B(aob.v0(i, vnbVar)) > 0.8f) {
                this.f = aob.v0(aob.n6, vnbVar);
                return;
            } else if (hl.B(aob.v0(i, vnbVar)) < 0.2f) {
                this.f = aob.p1(0.5f, aob.v0(aob.A8, vnbVar));
                return;
            } else {
                this.f = aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.7f, h48.z0(aob.v0(i, vnbVar))));
                return;
            }
        }
        this.f = kc7Var.e(0, vnbVar);
    }

    public final void c(long j, boolean z, boolean z2) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ul ulVar = this.c;
        if (i == 0) {
            ulVar.g(null, z2);
            if (this.b == null) {
                this.b = new pkb(ob6.M0(2131752277, null), 16.0f, null);
            }
        } else {
            ulVar.j(j, z2);
            this.b = null;
        }
        ulVar.m(z, z2);
    }

    public final void d(TLRPC.Document document) {
        ul ulVar = this.c;
        if (document == null) {
            ulVar.g(null, false);
            if (this.b == null) {
                this.b = new pkb(ob6.M0(2131752277, null), 16.0f, null);
            }
        } else {
            ulVar.i(document, false);
            this.b = null;
        }
        ulVar.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i;
        vnb vnbVar = this.d;
        super.dispatchDraw(canvas);
        f();
        ul ulVar = this.c;
        ulVar.k(Integer.valueOf(this.f));
        pkb pkbVar = this.b;
        if (pkbVar != null) {
            canvas2 = canvas;
            pkbVar.c((getMeasuredWidth() - this.b.j()) - hl.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, aob.v0(aob.q6, vnbVar), canvas2);
        } else {
            canvas2 = canvas;
            ulVar.draw(canvas2);
        }
        if (this.e) {
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = aob.j0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (ob6.a0) {
                    L = 0.0f;
                } else {
                    L = hl.L(23.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(23.0f);
                } else {
                    i = 0;
                }
                canvas2.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i) {
        ema emaVar = this.a;
        if (i <= 0) {
            emaVar.i(null);
            return;
        }
        emaVar.i(new hc(i, this.d, getContext(), false));
        emaVar.setDrawablePadding(hl.L(6.0f));
    }

    public final void f() {
        ul ulVar = this.c;
        ulVar.setBounds((getWidth() - ulVar.s) - hl.L(21.0f), (getHeight() - ulVar.s) / 2, getWidth() - hl.L(21.0f), (getHeight() + ulVar.s) / 2);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        ema emaVar = this.a;
        if (emaVar != null) {
            emaVar.setTextColor(aob.v0(aob.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
