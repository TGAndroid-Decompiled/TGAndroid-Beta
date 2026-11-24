package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n38 extends k96 {
    public final oab i0;
    public final a58 j0;

    public n38(a58 a58Var, Context context, oab oabVar, dab dabVar, View view, FrameLayout frameLayout, oab oabVar2) {
        super(context, oabVar, dabVar, view, frameLayout);
        this.j0 = a58Var;
        this.i0 = oabVar2;
    }

    @Override
    public final void g(long j) {
        wt7 wt7Var = this.j0.O1;
        if (wt7Var != null) {
            ArrayList arrayList = wt7Var.h;
            for (int i = 0; i < arrayList.size(); i++) {
                if (((vt7) arrayList.get(i)).a == j) {
                    ((vt7) arrayList.get(i)).h = true;
                }
            }
        }
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        s96 s96Var = this.i0.B0;
        if (s96Var != null) {
            return s96Var.l();
        }
        return null;
    }

    @Override
    public final void h(int i, int i2, long j) {
        boolean z;
        wt7 wt7Var = this.j0.O1;
        if (wt7Var == null) {
            return;
        }
        int i3 = wt7Var.a;
        ArrayList arrayList = wt7Var.h;
        if (arrayList.size() < 5) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new vt7(wt7Var, wt7Var, i3, j, i2, z));
        wt7Var.invalidate();
    }

    @Override
    public final void i() {
        boolean z;
        a58 a58Var = this.j0;
        a58Var.P1.setCount((int) getStarsCount());
        xt7 xt7Var = a58Var.P1;
        if (this.a0 != null) {
            z = true;
        } else {
            z = false;
        }
        xt7Var.setFilled(z);
    }

    @Override
    public final void p(boolean z, boolean z2) {
        float f;
        if (!z2 || this.g0 != z) {
            this.g0 = z;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            fv fvVar = this.c;
            fvVar.invalidate();
            float f2 = 1.0f;
            if (z2) {
                float alpha = fvVar.getAlpha();
                if (z) {
                    f2 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f2);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new fh4(this, (byte) 21));
                this.f0.addListener(new jf4((byte) 11, this, z));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(d53.h);
                this.f0.start();
            } else {
                if (z) {
                    f = 0.0f;
                } else {
                    f = 0.5f;
                }
                this.a.setAlpha(f);
                if (z) {
                    f2 = 0.0f;
                }
                fvVar.setAlpha(f2);
            }
            invalidate();
        }
        vn2 vn2Var = this.j0.N1;
        if (vn2Var != null) {
            vn2Var.a(z, z2);
        }
    }

    @Override
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.j0.C0.setVisibility(i);
    }
}
