package fi;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.er;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dn;
public final class u2 extends ImageReceiver {
    public final int K1;
    public final Object L1;

    public u2(Object obj, int i7) {
        super(null);
        this.K1 = i7;
        this.L1 = obj;
    }

    @Override
    public void L0(int[] iArr) {
        sh.e eVar;
        switch (this.K1) {
            case 2:
                super.L0(iArr);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.L1;
                int[] iArr2 = q1Var.T0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int L = org.telegram.messenger.g0.L(6.0f);
                iArr2[3] = L;
                iArr2[2] = L;
                org.telegram.ui.Cells.w1 w1Var = q1Var.f31211x2;
                if (w1Var != null && (eVar = w1Var.f31861m) != null) {
                    eVar.f56861b.L0(iArr2);
                    return;
                }
                return;
            default:
                super.L0(iArr);
                return;
        }
    }

    @Override
    public void invalidate() {
        int i7 = this.K1;
        Object obj = this.L1;
        switch (i7) {
            case 3:
                View view = ((dn) obj).f46436b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.g5) obj).j();
                super.invalidate();
                return;
            case 5:
            default:
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                org.telegram.ui.Wallet.c8 c8Var = ((org.telegram.ui.Wallet.b8) obj).f43517d0;
                int i10 = org.telegram.ui.Wallet.c8.H1;
                c8Var.f0();
                return;
        }
    }

    @Override
    public boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        Runnable runnable;
        int i11 = this.K1;
        Object obj = this.L1;
        switch (i11) {
            case 0:
                b4 b4Var = (b4) obj;
                boolean x02 = super.x0(drawable, str, i7, z10, i10);
                if (i7 == 1 && (runnable = b4Var.S0) != null) {
                    runnable.run();
                    b4Var.S0 = null;
                }
                return x02;
            case 1:
                if (drawable != null && i7 != 1) {
                    i20.n(((kg.a1) ((v3) obj).I).h.animate().alpha(1.0f).translationY(0.0f), er.f34424k, 250L);
                }
                return super.x0(drawable, str, i7, z10, i10);
            case 2:
            case 3:
            case 6:
            default:
                return super.x0(drawable, str, i7, z10, i10);
            case 4:
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) obj;
                g5Var.j();
                boolean x03 = super.x0(drawable, str, i7, z10, i10);
                if (g5Var.f34811m && J()) {
                    g5Var.f34811m = false;
                    org.telegram.messenger.g0.h3(new dg(g5Var, 4));
                }
                return x03;
            case 5:
                boolean x04 = super.x0(drawable, str, i7, z10, i10);
                ((PhotoViewer) obj).k2();
                return x04;
            case 7:
                boolean x05 = super.x0(drawable, str, i7, z10, i10);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new hi.j3(this, 22));
                duration.start();
                return x05;
        }
    }

    public u2(Object obj, View view, int i7) {
        super(view);
        this.K1 = i7;
        this.L1 = obj;
    }
}
