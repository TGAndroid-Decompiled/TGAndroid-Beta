package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jr;
public final class f2 extends u0 {
    public final i9 f15588d0;
    public final d4 f15589e0;

    public f2(d4 d4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.f15589e0 = d4Var;
        this.f15588d0 = i9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        d1 d1Var = this.f15588d0.f15790w0;
        if (d1Var != null) {
            return d1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        q1 q1Var = this.f15589e0.U1;
        if (q1Var != null) {
            ArrayList arrayList = q1Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((p1) arrayList.get(i10)).f16080a == j10) {
                    ((p1) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        boolean z10;
        q1 q1Var = this.f15589e0.U1;
        if (q1Var == null) {
            return;
        }
        int i12 = q1Var.f16109a;
        ArrayList arrayList = q1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new p1(q1Var, q1Var, i12, j10, i11, z10));
        q1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        d4 d4Var = this.f15589e0;
        d4Var.V1.setCount((int) getStarsCount());
        r1 r1Var = d4Var.V1;
        if (this.S != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f9;
        if (!z11 || this.f16278b0 != z10) {
            this.f16278b0 = z10;
            ValueAnimator valueAnimator = this.f16276a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f16276a0 = null;
            }
            jh.e1 e1Var = this.f16279c;
            e1Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = e1Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f16276a0 = ofFloat;
                ofFloat.addUpdateListener(new bg.q1(this, 22));
                this.f16276a0.addListener(new bg.z2(5, this, z10));
                this.f16276a0.setDuration(420L);
                this.f16276a0.setInterpolator(jr.h);
                this.f16276a0.start();
            } else {
                if (z10) {
                    f9 = 0.0f;
                } else {
                    f9 = 0.5f;
                }
                this.f16275a.setAlpha(f9);
                if (z10) {
                    f10 = 0.0f;
                }
                e1Var.setAlpha(f10);
            }
            invalidate();
        }
        a aVar = this.f15589e0.T1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f15589e0.I0.setVisibility(i10);
    }
}
