package ih;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
public final class h2 extends w0 {
    public final m9 f11495d0;
    public final i4 f11496e0;

    public h2(i4 i4Var, Context context, m9 m9Var, b9 b9Var, View view, FrameLayout frameLayout, m9 m9Var2) {
        super(context, m9Var, b9Var, view, frameLayout);
        this.f11496e0 = i4Var;
        this.f11495d0 = m9Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        f1 f1Var = this.f11495d0.f11831w0;
        if (f1Var != null) {
            return f1Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        s1 s1Var = this.f11496e0.U1;
        if (s1Var != null) {
            ArrayList arrayList = s1Var.h;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (((r1) arrayList.get(i9)).f12056a == j10) {
                    ((r1) arrayList.get(i9)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i9, int i10, long j10) {
        boolean z10;
        s1 s1Var = this.f11496e0.U1;
        if (s1Var == null) {
            return;
        }
        int i11 = s1Var.f12100a;
        ArrayList arrayList = s1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new r1(s1Var, s1Var, i11, j10, i10, z10));
        s1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        i4 i4Var = this.f11496e0;
        i4Var.V1.setCount((int) getStarsCount());
        t1 t1Var = i4Var.V1;
        if (this.S != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f10;
        if (!z11 || this.f12275b0 != z10) {
            this.f12275b0 = z10;
            ValueAnimator valueAnimator = this.f12273a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f12273a0 = null;
            }
            gh.f1 f1Var = this.f12276c;
            f1Var.invalidate();
            float f11 = 1.0f;
            if (z11) {
                float alpha = f1Var.getAlpha();
                if (z10) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                this.f12273a0 = ofFloat;
                ofFloat.addUpdateListener(new bg.b(this, 13));
                this.f12273a0.addListener(new hg.b0(2, this, z10));
                this.f12273a0.setDuration(420L);
                this.f12273a0.setInterpolator(gr.h);
                this.f12273a0.start();
            } else {
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.5f;
                }
                this.f12272a.setAlpha(f10);
                if (z10) {
                    f11 = 0.0f;
                }
                f1Var.setAlpha(f11);
            }
            invalidate();
        }
        a aVar = this.f11496e0.T1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        this.f11496e0.I0.setVisibility(i9);
    }
}
