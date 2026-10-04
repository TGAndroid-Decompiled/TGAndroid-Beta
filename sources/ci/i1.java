package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g91;
import org.telegram.ui.ge1;
import org.telegram.ui.gw0;
import org.telegram.ui.qp0;
import org.telegram.ui.t31;
import org.telegram.ui.u31;
import org.telegram.ui.v31;
import org.telegram.ui.wp0;
import org.telegram.ui.yn;
public final class i1 extends g91 {
    public final int V;
    public final Object W;

    public i1(Object obj, Context context, int i10) {
        super(context, null);
        this.V = i10;
        this.W = obj;
    }

    @Override
    public void A(int i10) {
        switch (this.V) {
            case 3:
                if (i10 == 0) {
                    yn ynVar = (yn) this.W;
                    if (ynVar.f43469q1) {
                        ynVar.f43469q1 = false;
                        ynVar.f43445o1.h.clear();
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
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.i1.i(android.view.MotionEvent):boolean");
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
    public void t(View view, View view2, int i10, int i11) {
        switch (this.V) {
            case 1:
                ea eaVar = (ea) this.W;
                if (ea.d0(eaVar)) {
                    eaVar.f1();
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
                    ((fi.k0) this.W).v.d.f25250f3.N(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        t31 t31Var;
        switch (this.V) {
            case 6:
                if ((getCurrentView() instanceof u31) && (t31Var = ((u31) getCurrentView()).f41048n) != null) {
                    AndroidUtilities.hideKeyboard(t31Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                s2 s2Var = (s2) this.W;
                i1 i1Var = s2Var.f5894f;
                r2 r2Var = s2Var.h;
                if (r2Var != null) {
                    r2Var.F = i1Var.getPositionAnimated();
                    r2Var.invalidate();
                }
                s2.b0(s2Var).invalidate();
                invalidate();
                s2.G = i1Var.getCurrentPosition();
                return;
            case 1:
                ea.c0((ea) this.W).invalidate();
                return;
            case 2:
                fi.k0.s((fi.k0) this.W).invalidate();
                return;
            case 3:
                yn ynVar = (yn) this.W;
                ynVar.V0.getClass();
                ynVar.V0.getClass();
                ynVar.l7();
                return;
            case 4:
                wp0 wp0Var = (wp0) this.W;
                float positionAnimated = wp0Var.I.getPositionAnimated();
                wp0Var.M.setSelected(positionAnimated);
                wp0Var.f42586e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                wp0Var.F0();
                qp0 C0 = wp0Var.C0();
                d dVar = wp0Var.Q;
                if (dVar != null && C0 != null && C0 != wp0Var.R) {
                    wp0Var.R = C0;
                    n7.z0 z0Var = C0.f39775e;
                    dVar.g((CharSequence) z0Var.f16851b, true, true);
                    wp0Var.Q.f((SpannableStringBuilder) z0Var.f16852c, true);
                    return;
                }
                return;
            case 5:
                ((gw0) this.W).e();
                return;
            case 6:
                v31.o((v31) this.W).invalidate();
                return;
            default:
                ((ge1) this.W).e();
                return;
        }
    }

    public i1(Context context, org.telegram.ui.ActionBar.d6 d6Var, yn ynVar) {
        super(context, d6Var);
        this.V = 3;
        this.W = ynVar;
    }
}
