package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;

public final class g2 extends u0 {

    public final i9 f13349d0;

    public final e4 f13350e0;

    public g2(e4 e4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.f13350e0 = e4Var;
        this.f13349d0 = i9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        d1 d1Var = this.f13349d0.f13512w0;
        if (d1Var != null) {
            return d1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        q1 q1Var = this.f13350e0.U1;
        if (q1Var == null) {
            return;
        }
        ArrayList arrayList = q1Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((p1) arrayList.get(i10)).f13809a == j10) {
                ((p1) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        q1 q1Var = this.f13350e0.U1;
        if (q1Var == null) {
            return;
        }
        int i12 = q1Var.f13843a;
        ArrayList arrayList = q1Var.h;
        arrayList.add(new p1(q1Var, q1Var, i12, j10, i11, arrayList.size() < 5));
        q1Var.invalidate();
    }

    @Override
    public final void j() {
        e4 e4Var = this.f13350e0;
        e4Var.V1.setCount((int) getStarsCount());
        e4Var.V1.setFilled(this.S != null);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.f14011b0 != z10) {
            this.f14011b0 = z10;
            ValueAnimator valueAnimator = this.f14009a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f14009a0 = null;
            }
            hh.f1 f1Var = this.f14012c;
            f1Var.invalidate();
            if (z11) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f1Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.f14009a0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 16));
                this.f14009a0.addListener(new ag.x(4, this, z10));
                this.f14009a0.setDuration(420L);
                this.f14009a0.setInterpolator(er.h);
                this.f14009a0.start();
            } else {
                this.f14008a.setAlpha(z10 ? 0.0f : 0.5f);
                f1Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.f13350e0.T1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f13350e0.I0.setVisibility(i10);
    }
}
