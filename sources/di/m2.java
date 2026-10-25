package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
public final class m2 extends x0 {
    public final y9 f8774h0;
    public final q4 f8775i0;

    public m2(q4 q4Var, Context context, y9 y9Var, n9 n9Var, View view, FrameLayout frameLayout, y9 y9Var2) {
        super(context, y9Var, n9Var, view, frameLayout);
        this.f8775i0 = q4Var;
        this.f8774h0 = y9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        h1 h1Var = this.f8774h0.A0;
        if (h1Var != null) {
            return h1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        w1 w1Var = this.f8775i0.N1;
        if (w1Var != null) {
            ArrayList arrayList = w1Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((v1) arrayList.get(i10)).f9243a == j10) {
                    ((v1) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        boolean z10;
        w1 w1Var = this.f8775i0.N1;
        if (w1Var == null) {
            return;
        }
        int i12 = w1Var.f9288a;
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
        q4 q4Var = this.f8775i0;
        q4Var.O1.setCount((int) getStarsCount());
        x1 x1Var = q4Var.O1;
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
        if (!z11 || this.f9349f0 != z10) {
            this.f9349f0 = z10;
            ValueAnimator valueAnimator = this.f9347e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f9347e0 = null;
            }
            bi.r1 r1Var = this.f9344c;
            r1Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = r1Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f9347e0 = ofFloat;
                ofFloat.addUpdateListener(new ai.g0(this, 13));
                this.f9347e0.addListener(new bh.f0(2, this, z10));
                this.f9347e0.setDuration(420L);
                this.f9347e0.setInterpolator(ds.h);
                this.f9347e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f9340a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                r1Var.setAlpha(f10);
            }
            invalidate();
        }
        a aVar = this.f8775i0.M1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f8775i0.B0.setVisibility(i10);
    }
}
