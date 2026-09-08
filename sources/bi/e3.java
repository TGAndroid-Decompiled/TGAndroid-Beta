package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;
public final class e3 extends g1 {
    public final pb f2933h0;
    public final o5 f2934i0;

    public e3(o5 o5Var, Context context, pb pbVar, eb ebVar, View view, FrameLayout frameLayout, pb pbVar2) {
        super(context, pbVar, ebVar, view, frameLayout);
        this.f2934i0 = o5Var;
        this.f2933h0 = pbVar2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        t1 t1Var = this.f2933h0.A0;
        if (t1Var != null) {
            return t1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        k2 k2Var = this.f2934i0.Y1;
        if (k2Var != null) {
            ArrayList arrayList = k2Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((j2) arrayList.get(i10)).f3153a == j3) {
                    ((j2) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j3) {
        boolean z10;
        k2 k2Var = this.f2934i0.Y1;
        if (k2Var == null) {
            return;
        }
        int i12 = k2Var.f3213a;
        ArrayList arrayList = k2Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new j2(k2Var, k2Var, i12, j3, i11, z10));
        k2Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        o5 o5Var = this.f2934i0;
        o5Var.Z1.setCount((int) getStarsCount());
        l2 l2Var = o5Var.Z1;
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l2Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f7;
        if (!z11 || this.f3037f0 != z10) {
            this.f3037f0 = z10;
            ValueAnimator valueAnimator = this.f3035e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f3035e0 = null;
            }
            o0 o0Var = this.f3031c;
            o0Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = o0Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f3035e0 = ofFloat;
                ofFloat.addUpdateListener(new ah.d0(this, 4));
                this.f3035e0.addListener(new ah.q0(2, this, z10));
                this.f3035e0.setDuration(420L);
                this.f3035e0.setInterpolator(pr.h);
                this.f3035e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f3027a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                o0Var.setAlpha(f10);
            }
            invalidate();
        }
        a aVar = this.f2934i0.X1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f2934i0.M0.setVisibility(i10);
    }
}
