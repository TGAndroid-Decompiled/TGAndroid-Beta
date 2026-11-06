package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public final class g2 extends u0 {
    public final p9 f9033h0;
    public final i4 f9034i0;

    public g2(i4 i4Var, Context context, p9 p9Var, e9 e9Var, View view, FrameLayout frameLayout, p9 p9Var2) {
        super(context, p9Var, e9Var, view, frameLayout);
        this.f9034i0 = i4Var;
        this.f9033h0 = p9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        g1 g1Var = this.f9033h0.A0;
        if (g1Var != null) {
            return g1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        q1 q1Var = this.f9034i0.H1;
        if (q1Var != null) {
            ArrayList arrayList = q1Var.h;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((p1) arrayList.get(i7)).f9497a == j3) {
                    ((p1) arrayList.get(i7)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i7, int i10, long j3) {
        boolean z9;
        q1 q1Var = this.f9034i0.H1;
        if (q1Var == null) {
            return;
        }
        int i11 = q1Var.f9622a;
        ArrayList arrayList = q1Var.h;
        if (arrayList.size() < 5) {
            z9 = true;
        } else {
            z9 = false;
        }
        arrayList.add(new p1(q1Var, q1Var, i11, j3, i10, z9));
        q1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z9;
        i4 i4Var = this.f9034i0;
        i4Var.I1.setCount((int) getStarsCount());
        r1 r1Var = i4Var.I1;
        if (this.W != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        r1Var.setFilled(z9);
    }

    @Override
    public final void q(boolean z9, boolean z10) {
        float f10;
        if (!z10 || this.f9819f0 != z9) {
            this.f9819f0 = z9;
            ValueAnimator valueAnimator = this.f9817e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f9817e0 = null;
            }
            bi.q1 q1Var = this.f9813c;
            q1Var.invalidate();
            float f11 = 1.0f;
            if (z10) {
                float alpha = q1Var.getAlpha();
                if (z9) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                this.f9817e0 = ofFloat;
                ofFloat.addUpdateListener(new ah.h(this, 14));
                this.f9817e0.addListener(new ch.y(2, this, z9));
                this.f9817e0.setDuration(420L);
                this.f9817e0.setInterpolator(xq.h);
                this.f9817e0.start();
            } else {
                if (z9) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.5f;
                }
                this.f9809a.setAlpha(f10);
                if (z9) {
                    f11 = 0.0f;
                }
                q1Var.setAlpha(f11);
            }
            invalidate();
        }
        a aVar = this.f9034i0.G1;
        if (aVar != null) {
            aVar.a(z9, z10);
        }
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f9034i0.f9204v0.setVisibility(i7);
    }
}
