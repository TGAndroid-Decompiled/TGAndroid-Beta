package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
public final class n2 extends x0 {
    public final aa f5631h0;
    public final q4 f5632i0;

    public n2(q4 q4Var, Context context, aa aaVar, p9 p9Var, View view, FrameLayout frameLayout, aa aaVar2) {
        super(context, aaVar, p9Var, view, frameLayout);
        this.f5632i0 = q4Var;
        this.f5631h0 = aaVar2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        h1 h1Var = this.f5631h0.A0;
        if (h1Var != null) {
            return h1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        x1 x1Var = this.f5632i0.Y1;
        if (x1Var != null) {
            ArrayList arrayList = x1Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((w1) arrayList.get(i10)).f6104a == j10) {
                    ((w1) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        boolean z10;
        x1 x1Var = this.f5632i0.Y1;
        if (x1Var == null) {
            return;
        }
        int i12 = x1Var.f6149a;
        ArrayList arrayList = x1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new w1(x1Var, x1Var, i12, j10, i11, z10));
        x1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        q4 q4Var = this.f5632i0;
        q4Var.Z1.setCount((int) getStarsCount());
        y1 y1Var = q4Var.Z1;
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f7;
        if (!z11 || this.f6141f0 != z10) {
            this.f6141f0 = z10;
            ValueAnimator valueAnimator = this.f6139e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f6139e0 = null;
            }
            ai.u1 u1Var = this.f6136c;
            u1Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = u1Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f6139e0 = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(this, 11));
                this.f6139e0.addListener(new ah.p0(2, this, z10));
                this.f6139e0.setDuration(420L);
                this.f6139e0.setInterpolator(bs.h);
                this.f6139e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f6132a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                u1Var.setAlpha(f10);
            }
            invalidate();
        }
        a aVar = this.f5632i0.X1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f5632i0.M0.setVisibility(i10);
    }
}
