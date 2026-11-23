package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.k71;
import org.telegram.ui.bn;
import org.telegram.ui.dm0;
import org.telegram.ui.g81;
import org.telegram.ui.jm0;
import org.telegram.ui.my0;
import org.telegram.ui.oy0;
import org.telegram.ui.py0;
import org.telegram.ui.zr0;
public final class q1 extends k71 {
    public final int W;
    public final Object f15203a0;

    public q1(int i7, Context context, Object obj) {
        super(context, null);
        this.W = i7;
        this.f15203a0 = obj;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.q1.b(android.view.MotionEvent):boolean");
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
                k9 k9Var = (k9) this.f15203a0;
                if (k9Var.d) {
                    k9Var.N0();
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
                    ((li.c0) this.f15203a0).f20003v1.d.f35323g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void s() {
        my0 my0Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof oy0) && (my0Var = ((oy0) getCurrentView()).f50790n) != null) {
                    org.telegram.messenger.g0.v1(my0Var);
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
                r2 r2Var = (r2) this.f15203a0;
                q1 q1Var = r2Var.f15279q1;
                q2 q2Var = r2Var.f15280r1;
                if (q2Var != null) {
                    q2Var.G = q1Var.getPositionAnimated();
                    q2Var.invalidate();
                }
                r2Var.f30226b.invalidate();
                invalidate();
                r2.D1 = q1Var.getCurrentPosition();
                return;
            case 1:
                ((k9) this.f15203a0).f30226b.invalidate();
                return;
            case 2:
                ((li.c0) this.f15203a0).f30226b.invalidate();
                return;
            case 3:
                bn bnVar = (bn) this.f15203a0;
                bnVar.f46279m1.getClass();
                bnVar.f46279m1.getClass();
                bnVar.A7();
                return;
            case 4:
                jm0 jm0Var = (jm0) this.f15203a0;
                float positionAnimated = jm0Var.J.getPositionAnimated();
                jm0Var.N.setSelected(positionAnimated);
                jm0Var.f49161e.setProgressToGradient(1.0f - c8.m9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                jm0Var.K0();
                dm0 H0 = jm0Var.H0();
                e eVar = jm0Var.R;
                if (eVar != null && H0 != null && H0 != jm0Var.S) {
                    jm0Var.S = H0;
                    j6.k kVar = H0.f47171e;
                    eVar.i((CharSequence) kVar.f17343b, true, true);
                    jm0Var.R.g((SpannableStringBuilder) kVar.f17344c, true);
                    return;
                }
                return;
            case 5:
                ((zr0) this.f15203a0).e();
                return;
            case 6:
                ((py0) this.f15203a0).f30226b.invalidate();
                return;
            case 7:
                ((g81) this.f15203a0).e();
                return;
            case 8:
                ((org.telegram.ui.Wallet.e3) this.f15203a0).f30226b.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.f15203a0;
                o6Var.g1();
                org.telegram.ui.Wallet.s8 s8Var = o6Var.f44805k0;
                if (s8Var != null && s8Var.f45077i1) {
                    s8Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void v(int i7) {
        org.telegram.ui.Wallet.k9 k9Var;
        switch (this.W) {
            case 9:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.f15203a0;
                o6Var.f44800f0 = i7;
                if (i7 != 1 && (k9Var = o6Var.f44804j0) != null) {
                    k9Var.b(false);
                }
                if (i7 == 1) {
                    o6Var.f44815s0.post(new org.telegram.ui.Wallet.r4(o6Var, 13));
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
                    bn bnVar = (bn) this.f15203a0;
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

    public q1(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.W = i7;
        this.f15203a0 = g2Var;
    }
}
