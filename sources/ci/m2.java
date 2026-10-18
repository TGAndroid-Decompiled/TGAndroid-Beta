package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
public final class m2 extends x0 {
    public final z9 f5530h0;
    public final p4 f5531i0;

    public m2(p4 p4Var, Context context, z9 z9Var, o9 o9Var, View view, FrameLayout frameLayout, z9 z9Var2) {
        super(context, z9Var, o9Var, view, frameLayout);
        this.f5531i0 = p4Var;
        this.f5530h0 = z9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        h1 h1Var = this.f5530h0.A0;
        if (h1Var != null) {
            return h1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        w1 w1Var = this.f5531i0.Y1;
        if (w1Var != null) {
            ArrayList arrayList = w1Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((v1) arrayList.get(i10)).f5999a == j10) {
                    ((v1) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        boolean z10;
        w1 w1Var = this.f5531i0.Y1;
        if (w1Var == null) {
            return;
        }
        int i12 = w1Var.f6034a;
        ArrayList arrayList = w1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new v1(w1Var, w1Var, i12, j10, i11, z10));
        w1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        p4 p4Var = this.f5531i0;
        p4Var.Z1.setCount((int) getStarsCount());
        x1 x1Var = p4Var.Z1;
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f7;
        if (!z11 || this.f6081f0 != z10) {
            this.f6081f0 = z10;
            ValueAnimator valueAnimator = this.f6079e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f6079e0 = null;
            }
            ai.u1 u1Var = this.f6076c;
            u1Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = u1Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f6079e0 = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(this, 11));
                this.f6079e0.addListener(new ah.p0(2, this, z10));
                this.f6079e0.setDuration(420L);
                this.f6079e0.setInterpolator(bs.h);
                this.f6079e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f6072a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                u1Var.setAlpha(f10);
            }
            invalidate();
        }
        a aVar = this.f5531i0.X1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f5531i0.M0.setVisibility(i10);
    }
}
