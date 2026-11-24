package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class vq1 extends wec {
    public final byte W;
    public final Object a0;

    public vq1(byte b, Context context, Object obj) {
        super(context, null);
        this.W = b;
        this.a0 = obj;
    }

    @Override
    public final void A(int i) {
        switch (this.W) {
            case 0:
                if (i == 0) {
                    mu1 mu1Var = (mu1) this.a0;
                    if (mu1Var.H1) {
                        mu1Var.H1 = false;
                        mu1Var.F1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final int H() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.H();
        }
    }

    @Override
    public final boolean g(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq1.g(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean h(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            default:
                return super.h(motionEvent);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
            case 6:
                return false;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void s(View view, View view2, int i, int i2) {
        switch (this.W) {
            case 7:
                y5b y5bVar = (y5b) this.a0;
                if (y5bVar.d) {
                    y5bVar.F0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void u() {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() == 1) {
                    ((eo2) this.a0).u1.d.g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void v() {
        z79 z79Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof a89) && (z79Var = ((a89) getCurrentView()).n) != null) {
                    gl.t1(z79Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z) {
        byte b = this.W;
        Object obj = this.a0;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                mu1Var.m1.getClass();
                mu1Var.m1.getClass();
                mu1Var.r5();
                return;
            case 1:
                ((eo2) obj).b.invalidate();
                return;
            case 2:
                ew3 ew3Var = (ew3) obj;
                vq1 vq1Var = ew3Var.p1;
                dw3 dw3Var = ew3Var.q1;
                if (dw3Var != null) {
                    dw3Var.G = vq1Var.getPositionAnimated();
                    dw3Var.invalidate();
                }
                ew3Var.b.invalidate();
                invalidate();
                ew3.C1 = vq1Var.getCurrentPosition();
                return;
            case 3:
                ((ki7) obj).b.invalidate();
                return;
            case 4:
                a18 a18Var = (a18) obj;
                float positionAnimated = a18Var.J.getPositionAnimated();
                a18Var.N.setSelected(positionAnimated);
                a18Var.e.setProgressToGradient(1.0f - moe.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                a18Var.J0();
                t08 E0 = a18Var.E0();
                u41 u41Var = a18Var.R;
                if (u41Var != null && E0 != null && E0 != a18Var.S) {
                    a18Var.S = E0;
                    sk4 sk4Var = E0.e;
                    u41Var.i((CharSequence) sk4Var.b, true, true);
                    a18Var.R.g((SpannableStringBuilder) sk4Var.c, true);
                    return;
                }
                return;
            case 5:
                ((ve8) obj).e();
                return;
            case 6:
                ((b89) obj).b.invalidate();
                return;
            case 7:
                ((y5b) obj).b.invalidate();
                return;
            case 8:
                ((jpb) obj).e();
                return;
            default:
                hmc hmcVar = (hmc) obj;
                hmcVar.f1();
                koc kocVar = hmcVar.k0;
                if (kocVar != null && kocVar.i1) {
                    kocVar.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public final void y(int i) {
        zoc zocVar;
        switch (this.W) {
            case 9:
                hmc hmcVar = (hmc) this.a0;
                hmcVar.f0 = i;
                if (i != 1 && (zocVar = hmcVar.j0) != null) {
                    zocVar.b(false);
                }
                if (i == 1) {
                    hmcVar.s0.post(new qkc(hmcVar, (byte) 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public vq1(d dVar, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.W = b;
        this.a0 = dVar;
    }
}
