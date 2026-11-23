package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.j71;
import org.telegram.ui.bn;
import org.telegram.ui.bs0;
import org.telegram.ui.fm0;
import org.telegram.ui.i81;
import org.telegram.ui.lm0;
import org.telegram.ui.ny0;
import org.telegram.ui.py0;
import org.telegram.ui.qy0;
public final class h1 extends j71 {
    public final int W;
    public final Object f14663a0;

    public h1(int i7, Context context, Object obj) {
        super(context, null);
        this.W = i7;
        this.f14663a0 = obj;
    }

    @Override
    public int D() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.D();
        }
    }

    @Override
    public boolean b(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.h1.b(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean e(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            default:
                return super.e(motionEvent);
        }
    }

    @Override
    public boolean f(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.f(motionEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void p(View view, View view2, int i7, int i10) {
        switch (this.W) {
            case 1:
                q8 q8Var = (q8) this.f14663a0;
                if (q8Var.d) {
                    q8Var.N0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void q() {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((li.d0) this.f14663a0).f19906v1.d.f35742g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void r() {
        ny0 ny0Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof py0) && (ny0Var = ((py0) getCurrentView()).f50943n) != null) {
                    org.telegram.messenger.g0.v1(ny0Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void s(boolean z10) {
        switch (this.W) {
            case 0:
                i2 i2Var = (i2) this.f14663a0;
                h1 h1Var = i2Var.f14707q1;
                h2 h2Var = i2Var.f14708r1;
                if (h2Var != null) {
                    h2Var.G = h1Var.getPositionAnimated();
                    h2Var.invalidate();
                }
                i2Var.f30142b.invalidate();
                invalidate();
                i2.C1 = h1Var.getCurrentPosition();
                return;
            case 1:
                ((q8) this.f14663a0).f30142b.invalidate();
                return;
            case 2:
                ((li.d0) this.f14663a0).f30142b.invalidate();
                return;
            case 3:
                bn bnVar = (bn) this.f14663a0;
                bnVar.f46064m1.getClass();
                bnVar.f46064m1.getClass();
                bnVar.A7();
                return;
            case 4:
                lm0 lm0Var = (lm0) this.f14663a0;
                float positionAnimated = lm0Var.J.getPositionAnimated();
                lm0Var.N.setSelected(positionAnimated);
                lm0Var.f49630e.setProgressToGradient(1.0f - c8.m9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                lm0Var.K0();
                fm0 H0 = lm0Var.H0();
                d dVar = lm0Var.R;
                if (dVar != null && H0 != null && H0 != lm0Var.S) {
                    lm0Var.S = H0;
                    ji.k kVar = H0.f47740e;
                    dVar.i((CharSequence) kVar.f17942b, true, true);
                    lm0Var.R.g((SpannableStringBuilder) kVar.f17943c, true);
                    return;
                }
                return;
            case 5:
                ((bs0) this.f14663a0).e();
                return;
            case 6:
                ((qy0) this.f14663a0).f30142b.invalidate();
                return;
            case 7:
                ((i81) this.f14663a0).e();
                return;
            case 8:
                ((org.telegram.ui.Wallet.d3) this.f14663a0).f30142b.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f14663a0;
                n6Var.g1();
                org.telegram.ui.Wallet.r8 r8Var = n6Var.f44643k0;
                if (r8Var != null && r8Var.f44915i1) {
                    r8Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void u(int i7) {
        org.telegram.ui.Wallet.j9 j9Var;
        switch (this.W) {
            case 9:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f14663a0;
                n6Var.f44638f0 = i7;
                if (i7 != 1 && (j9Var = n6Var.f44642j0) != null) {
                    j9Var.b(false);
                }
                if (i7 == 1) {
                    n6Var.f44653s0.post(new org.telegram.ui.Wallet.q4(n6Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void w(int i7) {
        switch (this.W) {
            case 3:
                if (i7 == 0) {
                    bn bnVar = (bn) this.f14663a0;
                    if (bnVar.H1) {
                        bnVar.H1 = false;
                        bnVar.F1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.W = i7;
        this.f14663a0 = g2Var;
    }
}
