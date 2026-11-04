package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public final class k2 extends w0 {
    public final r9 f10562i0;
    public final j4 f10563j0;

    public k2(j4 j4Var, Context context, r9 r9Var, f9 f9Var, View view, FrameLayout frameLayout, r9 r9Var2) {
        super(context, r9Var, f9Var, view, frameLayout);
        this.f10563j0 = j4Var;
        this.f10562i0 = r9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        g1 g1Var = this.f10562i0.B0;
        if (g1Var != null) {
            return g1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        v1 v1Var = this.f10563j0.I1;
        if (v1Var != null) {
            ArrayList arrayList = v1Var.h;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((u1) arrayList.get(i3)).f11075a == j10) {
                    ((u1) arrayList.get(i3)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i3, int i10, long j10) {
        boolean z10;
        v1 v1Var = this.f10563j0.I1;
        if (v1Var == null) {
            return;
        }
        int i11 = v1Var.f11110a;
        ArrayList arrayList = v1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new u1(v1Var, v1Var, i11, j10, i10, z10));
        v1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        j4 j4Var = this.f10563j0;
        j4Var.J1.setCount((int) getStarsCount());
        w1 w1Var = j4Var.J1;
        if (this.f11147a0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f10;
        if (!z11 || this.f11157g0 != z10) {
            this.f11157g0 = z10;
            ValueAnimator valueAnimator = this.f11156f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11156f0 = null;
            }
            ci.j1 j1Var = this.f11150c;
            j1Var.invalidate();
            float f11 = 1.0f;
            if (z11) {
                float alpha = j1Var.getAlpha();
                if (z10) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                this.f11156f0 = ofFloat;
                ofFloat.addUpdateListener(new bh.f(this, 14));
                this.f11156f0.addListener(new dh.x(2, this, z10));
                this.f11156f0.setDuration(420L);
                this.f11156f0.setInterpolator(xq.h);
                this.f11156f0.start();
            } else {
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.5f;
                }
                this.f11146a.setAlpha(f10);
                if (z10) {
                    f11 = 0.0f;
                }
                j1Var.setAlpha(f11);
            }
            invalidate();
        }
        a aVar = this.f10563j0.H1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        this.f10563j0.f10518w0.setVisibility(i3);
    }
}
