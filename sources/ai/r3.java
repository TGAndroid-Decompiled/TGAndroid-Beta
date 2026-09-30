package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sr;
public final class r3 extends o1 {
    public final jc f1459h0;
    public final e6 f1460i0;

    public r3(e6 e6Var, Context context, jc jcVar, yb ybVar, View view, FrameLayout frameLayout, jc jcVar2) {
        super(context, jcVar, ybVar, view, frameLayout);
        this.f1460i0 = e6Var;
        this.f1459h0 = jcVar2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        d2 d2Var = this.f1459h0.A0;
        if (d2Var != null) {
            return d2Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        w2 w2Var = this.f1460i0.Y1;
        if (w2Var != null) {
            ArrayList arrayList = w2Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((v2) arrayList.get(i10)).f1597a == j3) {
                    ((v2) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j3) {
        boolean z10;
        w2 w2Var = this.f1460i0.Y1;
        if (w2Var == null) {
            return;
        }
        int i12 = w2Var.f1642a;
        ArrayList arrayList = w2Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new v2(w2Var, w2Var, i12, j3, i11, z10));
        w2Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        e6 e6Var = this.f1460i0;
        e6Var.Z1.setCount((int) getStarsCount());
        x2 x2Var = e6Var.Z1;
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x2Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f7;
        if (!z11 || this.f1336f0 != z10) {
            this.f1336f0 = z10;
            ValueAnimator valueAnimator = this.f1334e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f1334e0 = null;
            }
            w0 w0Var = this.f1331c;
            w0Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = w0Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f1334e0 = ofFloat;
                ofFloat.addUpdateListener(new a(this, 3));
                this.f1334e0.addListener(new n(1, this, z10));
                this.f1334e0.setDuration(420L);
                this.f1334e0.setInterpolator(sr.h);
                this.f1334e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f1327a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
            }
            invalidate();
        }
        c cVar = this.f1460i0.X1;
        if (cVar != null) {
            cVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f1460i0.M0.setVisibility(i10);
    }
}
