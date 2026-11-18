package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
public final class a2 extends t0 {
    public final f9 f11719i0;
    public final z3 f11720j0;

    public a2(z3 z3Var, Context context, f9 f9Var, u8 u8Var, View view, FrameLayout frameLayout, f9 f9Var2) {
        super(context, f9Var, u8Var, view, frameLayout);
        this.f11720j0 = z3Var;
        this.f11719i0 = f9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        c1 c1Var = this.f11719i0.B0;
        if (c1Var != null) {
            return c1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        m1 m1Var = this.f11720j0.I1;
        if (m1Var != null) {
            ArrayList arrayList = m1Var.h;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((l1) arrayList.get(i7)).f12206a == j3) {
                    ((l1) arrayList.get(i7)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i7, int i10, long j3) {
        boolean z10;
        m1 m1Var = this.f11720j0.I1;
        if (m1Var == null) {
            return;
        }
        int i11 = m1Var.f12255a;
        ArrayList arrayList = m1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new l1(m1Var, m1Var, i11, j3, i10, z10));
        m1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        z3 z3Var = this.f11720j0;
        z3Var.J1.setCount((int) getStarsCount());
        n1 n1Var = z3Var.J1;
        if (this.f12558a0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f10;
        if (!z11 || this.f12568g0 != z10) {
            this.f12568g0 = z10;
            ValueAnimator valueAnimator = this.f12567f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f12567f0 = null;
            }
            di.b1 b1Var = this.f12561c;
            b1Var.invalidate();
            float f11 = 1.0f;
            if (z11) {
                float alpha = b1Var.getAlpha();
                if (z10) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                this.f12567f0 = ofFloat;
                ofFloat.addUpdateListener(new ah.g(this, 15));
                this.f12567f0.addListener(new bi.e7(3, this, z10));
                this.f12567f0.setDuration(420L);
                this.f12567f0.setInterpolator(lr.h);
                this.f12567f0.start();
            } else {
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.5f;
                }
                this.f12557a.setAlpha(f10);
                if (z10) {
                    f11 = 0.0f;
                }
                b1Var.setAlpha(f11);
            }
            invalidate();
        }
        a aVar = this.f11720j0.H1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f11720j0.f12887w0.setVisibility(i7);
    }
}
