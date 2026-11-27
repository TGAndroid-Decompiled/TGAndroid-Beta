package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c58 extends o96 {
    public final lcb i0;
    public final o68 j0;

    public c58(o68 o68Var, Context context, lcb lcbVar, acb acbVar, View view, FrameLayout frameLayout, lcb lcbVar2) {
        super(context, lcbVar, acbVar, view, frameLayout);
        this.j0 = o68Var;
        this.i0 = lcbVar2;
    }

    @Override
    public final void g(long j) {
        bv7 bv7Var = this.j0.I1;
        if (bv7Var != null) {
            ArrayList arrayList = bv7Var.h;
            for (int i = 0; i < arrayList.size(); i++) {
                if (((av7) arrayList.get(i)).a == j) {
                    ((av7) arrayList.get(i)).h = true;
                }
            }
        }
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        w96 w96Var = this.i0.B0;
        if (w96Var != null) {
            return w96Var.l();
        }
        return null;
    }

    @Override
    public final void h(int i, int i2, long j) {
        boolean z;
        bv7 bv7Var = this.j0.I1;
        if (bv7Var == null) {
            return;
        }
        int i3 = bv7Var.a;
        ArrayList arrayList = bv7Var.h;
        if (arrayList.size() < 5) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new av7(bv7Var, bv7Var, i3, j, i2, z));
        bv7Var.invalidate();
    }

    @Override
    public final void i() {
        boolean z;
        o68 o68Var = this.j0;
        o68Var.J1.setCount((int) getStarsCount());
        cv7 cv7Var = o68Var.J1;
        if (this.a0 != null) {
            z = true;
        } else {
            z = false;
        }
        cv7Var.setFilled(z);
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
            gu guVar = this.c;
            guVar.invalidate();
            float f2 = 1.0f;
            if (z2) {
                float alpha = guVar.getAlpha();
                if (z) {
                    f2 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f2);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new ch4(this, (byte) 20));
                this.f0.addListener(new gf4((byte) 11, this, z));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(k43.h);
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
                guVar.setAlpha(f2);
            }
            invalidate();
        }
        dn2 dn2Var = this.j0.H1;
        if (dn2Var != null) {
            dn2Var.a(z, z2);
        }
    }

    @Override
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.j0.w0.setVisibility(i);
    }
}
