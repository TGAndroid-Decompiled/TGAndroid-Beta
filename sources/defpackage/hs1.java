package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class hs1 extends wgc {
    public final byte W;
    public final Object a0;

    public hs1(byte b, Context context, Object obj) {
        super(context, null);
        this.W = b;
        this.a0 = obj;
    }

    @Override
    public final void A(int i) {
        switch (this.W) {
            case 0:
                if (i == 0) {
                    yv1 yv1Var = (yv1) this.a0;
                    if (yv1Var.H1) {
                        yv1Var.H1 = false;
                        yv1Var.F1.h.clear();
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
    public final boolean c(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs1.c(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            default:
                return super.d(motionEvent);
        }
    }

    @Override
    public final boolean h(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
            case 6:
                return false;
            default:
                return super.h(motionEvent);
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
                a8b a8bVar = (a8b) this.a0;
                if (a8bVar.d) {
                    a8bVar.F0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void t() {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() == 1) {
                    ((pp2) this.a0).u1.d.g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void v() {
        ba9 ba9Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof ca9) && (ba9Var = ((ca9) getCurrentView()).n) != null) {
                    gm.t1(ba9Var);
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
                yv1 yv1Var = (yv1) obj;
                yv1Var.m1.getClass();
                yv1Var.m1.getClass();
                yv1Var.y5();
                return;
            case 1:
                ((pp2) obj).b.invalidate();
                return;
            case 2:
                px3 px3Var = (px3) obj;
                hs1 hs1Var = px3Var.p1;
                ox3 ox3Var = px3Var.q1;
                if (ox3Var != null) {
                    ox3Var.G = hs1Var.getPositionAnimated();
                    ox3Var.invalidate();
                }
                px3Var.b.invalidate();
                invalidate();
                px3.C1 = hs1Var.getCurrentPosition();
                return;
            case 3:
                ((mk7) obj).b.invalidate();
                return;
            case 4:
                d38 d38Var = (d38) obj;
                float positionAnimated = d38Var.J.getPositionAnimated();
                d38Var.N.setSelected(positionAnimated);
                d38Var.e.setProgressToGradient(1.0f - pqe.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                d38Var.K0();
                w28 F0 = d38Var.F0();
                b61 b61Var = d38Var.R;
                if (b61Var != null && F0 != null && F0 != d38Var.S) {
                    d38Var.S = F0;
                    mj4 mj4Var = F0.e;
                    b61Var.i((CharSequence) mj4Var.b, true, true);
                    d38Var.R.g((SpannableStringBuilder) mj4Var.c, true);
                    return;
                }
                return;
            case 5:
                ((xg8) obj).e();
                return;
            case 6:
                ((da9) obj).b.invalidate();
                return;
            case 7:
                ((a8b) obj).b.invalidate();
                return;
            case 8:
                ((krb) obj).e();
                return;
            default:
                goc gocVar = (goc) obj;
                gocVar.g1();
                mqc mqcVar = gocVar.k0;
                if (mqcVar != null && mqcVar.i1) {
                    mqcVar.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public final void y(int i) {
        brc brcVar;
        switch (this.W) {
            case 9:
                goc gocVar = (goc) this.a0;
                gocVar.f0 = i;
                if (i != 1 && (brcVar = gocVar.j0) != null) {
                    brcVar.b(false);
                }
                if (i == 1) {
                    gocVar.s0.post(new pmc(gocVar, (byte) 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public hs1(d dVar, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.W = b;
        this.a0 = dVar;
    }
}
