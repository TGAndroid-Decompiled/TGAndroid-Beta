package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l18 extends k76 {
    public final m8b i0;
    public final y28 j0;

    public l18(y28 y28Var, Context context, m8b m8bVar, b8b b8bVar, View view, FrameLayout frameLayout, m8b m8bVar2) {
        super(context, m8bVar, b8bVar, view, frameLayout);
        this.j0 = y28Var;
        this.i0 = m8bVar2;
    }

    @Override
    public final void g(long j) {
        vr7 vr7Var = this.j0.O1;
        if (vr7Var != null) {
            ArrayList arrayList = vr7Var.h;
            for (int i = 0; i < arrayList.size(); i++) {
                if (((ur7) arrayList.get(i)).a == j) {
                    ((ur7) arrayList.get(i)).h = true;
                }
            }
        }
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        t76 t76Var = this.i0.B0;
        if (t76Var != null) {
            return t76Var.l();
        }
        return null;
    }

    @Override
    public final void h(int i, int i2, long j) {
        boolean z;
        vr7 vr7Var = this.j0.O1;
        if (vr7Var == null) {
            return;
        }
        int i3 = vr7Var.a;
        ArrayList arrayList = vr7Var.h;
        if (arrayList.size() < 5) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new ur7(vr7Var, vr7Var, i3, j, i2, z));
        vr7Var.invalidate();
    }

    @Override
    public final void i() {
        boolean z;
        y28 y28Var = this.j0;
        y28Var.P1.setCount((int) getStarsCount());
        wr7 wr7Var = y28Var.P1;
        if (this.a0 != null) {
            z = true;
        } else {
            z = false;
        }
        wr7Var.setFilled(z);
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
            fu fuVar = this.c;
            fuVar.invalidate();
            float f2 = 1.0f;
            if (z2) {
                float alpha = fuVar.getAlpha();
                if (z) {
                    f2 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f2);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new ni4(this, (byte) 19));
                this.f0.addListener(new id4((byte) 11, this, z));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(s33.h);
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
                fuVar.setAlpha(f2);
            }
            invalidate();
        }
        jm2 jm2Var = this.j0.N1;
        if (jm2Var != null) {
            jm2Var.a(z, z2);
        }
    }

    @Override
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.j0.C0.setVisibility(i);
    }
}
