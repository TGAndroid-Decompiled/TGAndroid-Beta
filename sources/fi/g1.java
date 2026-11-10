package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.v61;
import org.telegram.ui.cn;
import org.telegram.ui.cs0;
import org.telegram.ui.em0;
import org.telegram.ui.i81;
import org.telegram.ui.km0;
import org.telegram.ui.py0;
import org.telegram.ui.ry0;
import org.telegram.ui.sy0;
public final class g1 extends v61 {
    public final int V;
    public final Object W;

    public g1(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override
    public void A(int i7) {
        switch (this.V) {
            case 3:
                if (i7 == 0) {
                    cn cnVar = (cn) this.W;
                    if (cnVar.G1) {
                        cnVar.G1 = false;
                        cnVar.E1.h.clear();
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
    public int H() {
        switch (this.V) {
            case 9:
                return 12;
            default:
                return super.H();
        }
    }

    @Override
    public boolean b(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g1.b(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            default:
                return super.j(motionEvent);
        }
    }

    @Override
    public boolean k(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i7, int i10) {
        switch (this.V) {
            case 1:
                s8 s8Var = (s8) this.W;
                if (s8Var.d) {
                    s8Var.M0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void u() {
        switch (this.V) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((ii.d0) this.W).f15512u1.d.f37496f3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        py0 py0Var;
        switch (this.V) {
            case 6:
                if ((getCurrentView() instanceof ry0) && (py0Var = ((ry0) getCurrentView()).f49600n) != null) {
                    org.telegram.messenger.g0.v1(py0Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z9) {
        switch (this.V) {
            case 0:
                k2 k2Var = (k2) this.W;
                g1 g1Var = k2Var.f12256p1;
                j2 j2Var = k2Var.f12257q1;
                if (j2Var != null) {
                    j2Var.F = g1Var.getPositionAnimated();
                    j2Var.invalidate();
                }
                k2Var.f28672b.invalidate();
                invalidate();
                k2.B1 = g1Var.getCurrentPosition();
                return;
            case 1:
                ((s8) this.W).f28672b.invalidate();
                return;
            case 2:
                ((ii.d0) this.W).f28672b.invalidate();
                return;
            case 3:
                cn cnVar = (cn) this.W;
                cnVar.l1.getClass();
                cnVar.l1.getClass();
                cnVar.A7();
                return;
            case 4:
                km0 km0Var = (km0) this.W;
                float positionAnimated = km0Var.I.getPositionAnimated();
                km0Var.M.setSelected(positionAnimated);
                km0Var.f47374e.setProgressToGradient(1.0f - c8.j9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                km0Var.K0();
                em0 H0 = km0Var.H0();
                d dVar = km0Var.Q;
                if (dVar != null && H0 != null && H0 != km0Var.R) {
                    km0Var.R = H0;
                    j2.n nVar = H0.f45388e;
                    dVar.i((CharSequence) nVar.f16456b, true, true);
                    km0Var.Q.g((SpannableStringBuilder) nVar.f16457c, true);
                    return;
                }
                return;
            case 5:
                ((cs0) this.W).e();
                return;
            case 6:
                ((sy0) this.W).f28672b.invalidate();
                return;
            case 7:
                ((i81) this.W).e();
                return;
            case 8:
                ((org.telegram.ui.Wallet.x2) this.W).f28672b.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.W;
                z5Var.a1();
                org.telegram.ui.Wallet.d8 d8Var = z5Var.f43455j0;
                if (d8Var != null && d8Var.f42395h1) {
                    d8Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void y(int i7) {
        org.telegram.ui.Wallet.u8 u8Var;
        switch (this.V) {
            case 9:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.W;
                z5Var.f43449e0 = i7;
                if (i7 != 1 && (u8Var = z5Var.f43454i0) != null) {
                    u8Var.b(false);
                }
                if (i7 == 1) {
                    z5Var.f43461p0.post(new org.telegram.ui.Wallet.f4(z5Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.V = i7;
        this.W = f2Var;
    }
}
