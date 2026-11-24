package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ji1 extends FrameLayout implements vlb {
    public lka a;
    public uib b;
    public tm c;
    public ylb d;
    public boolean e;
    public int f;

    public final void a(int i, int i2, boolean z) {
        fc7 fc7Var;
        ec7 ec7Var = null;
        if (i2 < 0) {
            b(null);
        } else if (i2 < 7) {
            this.f = cmb.v0(cmb.q8[i2], this.d);
        } else {
            oc7 r1 = oc7.r1(i);
            if (z) {
                fc7Var = r1.E3;
            } else {
                fc7Var = r1.F3;
            }
            if (fc7Var != null) {
                ec7Var = fc7Var.d(i2);
            }
            b(ec7Var);
        }
        invalidate();
    }

    public final void b(ec7 ec7Var) {
        ylb ylbVar = this.d;
        if (ec7Var == null) {
            int i = cmb.r8;
            if (gm.B(cmb.v0(i, ylbVar)) > 0.8f) {
                this.f = cmb.v0(cmb.m6, ylbVar);
                return;
            } else if (gm.B(cmb.v0(i, ylbVar)) < 0.2f) {
                this.f = cmb.p1(0.5f, cmb.v0(cmb.z8, ylbVar));
                return;
            } else {
                this.f = cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.7f, d38.z0(cmb.v0(i, ylbVar))));
                return;
            }
        }
        this.f = ec7Var.e(0, ylbVar);
    }

    public final void c(long j, boolean z, boolean z2) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        tm tmVar = this.c;
        if (i == 0) {
            tmVar.g(null, z2);
            if (this.b == null) {
                this.b = new uib(jb6.M0(2131752249, null), 16.0f, null);
            }
        } else {
            tmVar.j(j, z2);
            this.b = null;
        }
        tmVar.m(z, z2);
    }

    public final void d(TLRPC.Document document) {
        tm tmVar = this.c;
        if (document == null) {
            tmVar.g(null, false);
            if (this.b == null) {
                this.b = new uib(jb6.M0(2131752249, null), 16.0f, null);
            }
        } else {
            tmVar.i(document, false);
            this.b = null;
        }
        tmVar.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i;
        ylb ylbVar = this.d;
        super.dispatchDraw(canvas);
        f();
        tm tmVar = this.c;
        tmVar.k(Integer.valueOf(this.f));
        uib uibVar = this.b;
        if (uibVar != null) {
            canvas2 = canvas;
            uibVar.c((getMeasuredWidth() - this.b.j()) - gm.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, cmb.v0(cmb.p6, ylbVar), canvas2);
        } else {
            canvas2 = canvas;
            tmVar.draw(canvas2);
        }
        if (this.e) {
            if (ylbVar != null) {
                paint = ylbVar.d("paintDivider");
            } else {
                paint = cmb.j0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (jb6.a0) {
                    L = 0.0f;
                } else {
                    L = gm.L(23.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (jb6.a0) {
                    i = gm.L(23.0f);
                } else {
                    i = 0;
                }
                canvas2.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i) {
        lka lkaVar = this.a;
        if (i <= 0) {
            lkaVar.i(null);
            return;
        }
        lkaVar.i(new hd(i, this.d, getContext(), false));
        lkaVar.setDrawablePadding(gm.L(6.0f));
    }

    public final void f() {
        tm tmVar = this.c;
        tmVar.setBounds((getWidth() - tmVar.s) - gm.L(21.0f), (getHeight() - tmVar.s) / 2, getWidth() - gm.L(21.0f), (getHeight() + tmVar.s) / 2);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        lka lkaVar = this.a;
        if (lkaVar != null) {
            lkaVar.setTextColor(cmb.v0(cmb.F6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
