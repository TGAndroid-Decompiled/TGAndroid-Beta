package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.w61;
import org.telegram.ui.an;
import org.telegram.ui.dm0;
import org.telegram.ui.e81;
import org.telegram.ui.jm0;
import org.telegram.ui.jy0;
import org.telegram.ui.ly0;
import org.telegram.ui.my0;
import org.telegram.ui.xr0;
public final class i1 extends w61 {
    public final int W;
    public final Object f14402a0;

    public i1(int i7, Context context, Object obj) {
        super(context, null);
        this.W = i7;
        this.f14402a0 = obj;
    }

    @Override
    public int F() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.F();
        }
    }

    @Override
    public boolean b(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.i1.b(android.view.MotionEvent):boolean");
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
    public void q(View view, View view2, int i7, int i10) {
        switch (this.W) {
            case 1:
                q8 q8Var = (q8) this.f14402a0;
                if (q8Var.d) {
                    q8Var.M0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void r() {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((li.d0) this.f14402a0).f19548v1.d.f39892g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void s() {
        jy0 jy0Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof ly0) && (jy0Var = ((ly0) getCurrentView()).f49062n) != null) {
                    org.telegram.messenger.g0.v1(jy0Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void t(boolean z10) {
        switch (this.W) {
            case 0:
                i2 i2Var = (i2) this.f14402a0;
                i1 i1Var = i2Var.f14406q1;
                h2 h2Var = i2Var.f14407r1;
                if (h2Var != null) {
                    h2Var.G = i1Var.getPositionAnimated();
                    h2Var.invalidate();
                }
                i2Var.f29682b.invalidate();
                invalidate();
                i2.C1 = i1Var.getCurrentPosition();
                return;
            case 1:
                ((q8) this.f14402a0).f29682b.invalidate();
                return;
            case 2:
                ((li.d0) this.f14402a0).f29682b.invalidate();
                return;
            case 3:
                an anVar = (an) this.f14402a0;
                anVar.f45277m1.getClass();
                anVar.f45277m1.getClass();
                anVar.A7();
                return;
            case 4:
                jm0 jm0Var = (jm0) this.f14402a0;
                float positionAnimated = jm0Var.J.getPositionAnimated();
                jm0Var.N.setSelected(positionAnimated);
                jm0Var.f48375e.setProgressToGradient(1.0f - c8.i9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                jm0Var.K0();
                dm0 H0 = jm0Var.H0();
                d dVar = jm0Var.R;
                if (dVar != null && H0 != null && H0 != jm0Var.S) {
                    jm0Var.S = H0;
                    ji.j jVar = H0.f46405e;
                    dVar.i((CharSequence) jVar.f17555b, true, true);
                    jm0Var.R.g((SpannableStringBuilder) jVar.f17556c, true);
                    return;
                }
                return;
            case 5:
                ((xr0) this.f14402a0).e();
                return;
            case 6:
                ((my0) this.f14402a0).f29682b.invalidate();
                return;
            case 7:
                ((e81) this.f14402a0).e();
                return;
            case 8:
                ((org.telegram.ui.Wallet.w2) this.f14402a0).f29682b.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f14402a0;
                y5Var.a1();
                org.telegram.ui.Wallet.c8 c8Var = y5Var.f44739k0;
                if (c8Var != null && c8Var.f43667i1) {
                    c8Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void v(int i7) {
        org.telegram.ui.Wallet.u8 u8Var;
        switch (this.W) {
            case 9:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f14402a0;
                y5Var.f44734f0 = i7;
                if (i7 != 1 && (u8Var = y5Var.f44738j0) != null) {
                    u8Var.b(false);
                }
                if (i7 == 1) {
                    y5Var.f44745q0.post(new org.telegram.ui.Wallet.e4(y5Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void x(int i7) {
        switch (this.W) {
            case 3:
                if (i7 == 0) {
                    an anVar = (an) this.f14402a0;
                    if (anVar.H1) {
                        anVar.H1 = false;
                        anVar.F1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public i1(org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.W = i7;
        this.f14402a0 = e2Var;
    }
}
