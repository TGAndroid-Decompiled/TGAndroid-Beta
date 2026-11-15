package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
public final class c2 extends u0 {
    public final i9 f11588i0;
    public final b4 f11589j0;

    public c2(b4 b4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.f11589j0 = b4Var;
        this.f11588i0 = i9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        e1 e1Var = this.f11588i0.B0;
        if (e1Var != null) {
            return e1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        o1 o1Var = this.f11589j0.I1;
        if (o1Var != null) {
            ArrayList arrayList = o1Var.h;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((n1) arrayList.get(i7)).f12061a == j3) {
                    ((n1) arrayList.get(i7)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i7, int i10, long j3) {
        boolean z10;
        o1 o1Var = this.f11589j0.I1;
        if (o1Var == null) {
            return;
        }
        int i11 = o1Var.f12103a;
        ArrayList arrayList = o1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new n1(o1Var, o1Var, i11, j3, i10, z10));
        o1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        b4 b4Var = this.f11589j0;
        b4Var.J1.setCount((int) getStarsCount());
        p1 p1Var = b4Var.J1;
        if (this.f12376a0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f10;
        if (!z11 || this.f12386g0 != z10) {
            this.f12386g0 = z10;
            ValueAnimator valueAnimator = this.f12385f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f12385f0 = null;
            }
            di.c1 c1Var = this.f12379c;
            c1Var.invalidate();
            float f11 = 1.0f;
            if (z11) {
                float alpha = c1Var.getAlpha();
                if (z10) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                this.f12385f0 = ofFloat;
                ofFloat.addUpdateListener(new ah.h(this, 15));
                this.f12385f0.addListener(new bi.v4(3, this, z10));
                this.f12385f0.setDuration(420L);
                this.f12385f0.setInterpolator(er.h);
                this.f12385f0.start();
            } else {
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.5f;
                }
                this.f12375a.setAlpha(f10);
                if (z10) {
                    f11 = 0.0f;
                }
                c1Var.setAlpha(f11);
            }
            invalidate();
        }
        a aVar = this.f11589j0.H1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f11589j0.f11534w0.setVisibility(i7);
    }
}
