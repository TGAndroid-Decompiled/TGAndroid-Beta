package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.is;
public final class s3 extends o1 {
    public final kc f1698h0;
    public final f6 f1699i0;

    public s3(f6 f6Var, Context context, kc kcVar, zb zbVar, View view, FrameLayout frameLayout, kc kcVar2) {
        super(context, kcVar, zbVar, view, frameLayout);
        this.f1699i0 = f6Var;
        this.f1698h0 = kcVar2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        d2 d2Var = this.f1698h0.A0;
        if (d2Var != null) {
            return d2Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        x2 x2Var = this.f1699i0.Y1;
        if (x2Var != null) {
            ArrayList arrayList = x2Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((w2) arrayList.get(i10)).f1843a == j3) {
                    ((w2) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j3) {
        boolean z10;
        x2 x2Var = this.f1699i0.Y1;
        if (x2Var == null) {
            return;
        }
        int i12 = x2Var.f1895a;
        ArrayList arrayList = x2Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new w2(x2Var, x2Var, i12, j3, i11, z10));
        x2Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        f6 f6Var = this.f1699i0;
        f6Var.Z1.setCount((int) getStarsCount());
        y2 y2Var = f6Var.Z1;
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y2Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f7;
        if (!z11 || this.f1515f0 != z10) {
            this.f1515f0 = z10;
            ValueAnimator valueAnimator = this.f1513e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f1513e0 = null;
            }
            w0 w0Var = this.f1509c;
            w0Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = w0Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f1513e0 = ofFloat;
                ofFloat.addUpdateListener(new a(this, 3));
                this.f1513e0.addListener(new n(1, this, z10));
                this.f1513e0.setDuration(420L);
                this.f1513e0.setInterpolator(is.h);
                this.f1513e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f1505a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
            }
            invalidate();
        }
        c cVar = this.f1699i0.X1;
        if (cVar != null) {
            cVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f1699i0.M0.setVisibility(i10);
    }
}
