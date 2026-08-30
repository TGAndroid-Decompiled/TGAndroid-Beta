package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
public final class g2 extends v0 {
    public final i9 f15345e0;
    public final d4 f15346f0;

    public g2(d4 d4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.f15346f0 = d4Var;
        this.f15345e0 = i9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        e1 e1Var = this.f15345e0.f15498x0;
        if (e1Var != null) {
            return e1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        r1 r1Var = this.f15346f0.V1;
        if (r1Var != null) {
            ArrayList arrayList = r1Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((q1) arrayList.get(i10)).f15792a == j10) {
                    ((q1) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        boolean z4;
        r1 r1Var = this.f15346f0.V1;
        if (r1Var == null) {
            return;
        }
        int i12 = r1Var.f15825a;
        ArrayList arrayList = r1Var.h;
        if (arrayList.size() < 5) {
            z4 = true;
        } else {
            z4 = false;
        }
        arrayList.add(new q1(r1Var, r1Var, i12, j10, i11, z4));
        r1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z4;
        d4 d4Var = this.f15346f0;
        d4Var.W1.setCount((int) getStarsCount());
        s1 s1Var = d4Var.W1;
        if (this.T != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        s1Var.setFilled(z4);
    }

    @Override
    public final void q(boolean z4, boolean z10) {
        float f10;
        if (!z10 || this.f15974c0 != z4) {
            this.f15974c0 = z4;
            ValueAnimator valueAnimator = this.f15972b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f15972b0 = null;
            }
            lh.e1 e1Var = this.f15973c;
            e1Var.invalidate();
            float f11 = 1.0f;
            if (z10) {
                float alpha = e1Var.getAlpha();
                if (z4) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                this.f15972b0 = ofFloat;
                ofFloat.addUpdateListener(new dg.o1(this, 22));
                this.f15972b0.addListener(new dg.w2(5, this, z4));
                this.f15972b0.setDuration(420L);
                this.f15972b0.setInterpolator(nr.h);
                this.f15972b0.start();
            } else {
                if (z4) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.5f;
                }
                this.f15969a.setAlpha(f10);
                if (z4) {
                    f11 = 0.0f;
                }
                e1Var.setAlpha(f11);
            }
            invalidate();
        }
        a aVar = this.f15346f0.U1;
        if (aVar != null) {
            aVar.a(z4, z10);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f15346f0.J0.setVisibility(i10);
    }
}
