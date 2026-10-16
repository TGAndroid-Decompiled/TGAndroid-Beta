package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.es;
public final class h3 extends g1 {
    public final sb f3115h0;
    public final q5 f3116i0;

    public h3(q5 q5Var, Context context, sb sbVar, hb hbVar, View view, FrameLayout frameLayout, sb sbVar2) {
        super(context, sbVar, hbVar, view, frameLayout);
        this.f3116i0 = q5Var;
        this.f3115h0 = sbVar2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        t1 t1Var = this.f3115h0.A0;
        if (t1Var != null) {
            return t1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        l2 l2Var = this.f3116i0.Y1;
        if (l2Var != null) {
            ArrayList arrayList = l2Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((k2) arrayList.get(i10)).f3230a == j10) {
                    ((k2) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        boolean z10;
        l2 l2Var = this.f3116i0.Y1;
        if (l2Var == null) {
            return;
        }
        int i12 = l2Var.f3267a;
        ArrayList arrayList = l2Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new k2(l2Var, l2Var, i12, j10, i11, z10));
        l2Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        q5 q5Var = this.f3116i0;
        q5Var.Z1.setCount((int) getStarsCount());
        m2 m2Var = q5Var.Z1;
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        m2Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f7;
        if (!z11 || this.f3063f0 != z10) {
            this.f3063f0 = z10;
            ValueAnimator valueAnimator = this.f3061e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f3061e0 = null;
            }
            o0 o0Var = this.f3058c;
            o0Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = o0Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f3061e0 = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(this, 4));
                this.f3061e0.addListener(new ah.p0(2, this, z10));
                this.f3061e0.setDuration(420L);
                this.f3061e0.setInterpolator(es.h);
                this.f3061e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f3054a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                o0Var.setAlpha(f10);
            }
            invalidate();
        }
        a aVar = this.f3116i0.X1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f3116i0.M0.setVisibility(i10);
    }
}
