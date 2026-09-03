package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;
public final class h2 extends v0 {
    public final i9 f17176e0;
    public final f4 f17177f0;

    public h2(f4 f4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.f17177f0 = f4Var;
        this.f17176e0 = i9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        e1 e1Var = this.f17176e0.f17305x0;
        if (e1Var != null) {
            return e1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        r1 r1Var = this.f17177f0.V1;
        if (r1Var != null) {
            ArrayList arrayList = r1Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((q1) arrayList.get(i10)).f17645a == j10) {
                    ((q1) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        boolean z4;
        r1 r1Var = this.f17177f0.V1;
        if (r1Var == null) {
            return;
        }
        int i12 = r1Var.f17677a;
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
        f4 f4Var = this.f17177f0;
        f4Var.W1.setCount((int) getStarsCount());
        s1 s1Var = f4Var.W1;
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
        if (!z10 || this.f17834c0 != z4) {
            this.f17834c0 = z4;
            ValueAnimator valueAnimator = this.f17832b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f17832b0 = null;
            }
            mh.d1 d1Var = this.f17833c;
            d1Var.invalidate();
            float f11 = 1.0f;
            if (z10) {
                float alpha = d1Var.getAlpha();
                if (z4) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                this.f17832b0 = ofFloat;
                ofFloat.addUpdateListener(new eg.m1(this, 22));
                this.f17832b0.addListener(new eg.u2(5, this, z4));
                this.f17832b0.setDuration(420L);
                this.f17832b0.setInterpolator(pr.h);
                this.f17832b0.start();
            } else {
                if (z4) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.5f;
                }
                this.f17829a.setAlpha(f10);
                if (z4) {
                    f11 = 0.0f;
                }
                d1Var.setAlpha(f11);
            }
            invalidate();
        }
        a aVar = this.f17177f0.U1;
        if (aVar != null) {
            aVar.a(z4, z10);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f17177f0.J0.setVisibility(i10);
    }
}
