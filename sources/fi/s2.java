package fi;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.lr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.en;
public final class s2 extends ImageReceiver {
    public final int K1;
    public final Object L1;

    public s2(Object obj, int i7) {
        super(null);
        this.K1 = i7;
        this.L1 = obj;
    }

    @Override
    public void L0(int[] iArr) {
        sh.f fVar;
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
                org.telegram.ui.Cells.w1 w1Var = q1Var.f31583x2;
                if (w1Var != null && (fVar = w1Var.f32241m) != null) {
                    fVar.f57437b.L0(iArr2);
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
                View view = ((en) obj).f47304b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.o5) obj).j();
                super.invalidate();
                return;
            case 5:
            default:
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                org.telegram.ui.Wallet.r8 r8Var = ((org.telegram.ui.Wallet.q8) obj).f44832d0;
                int i10 = org.telegram.ui.Wallet.r8.J1;
                r8Var.f0();
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
                z3 z3Var = (z3) obj;
                boolean x02 = super.x0(drawable, str, i7, z10, i10);
                if (i7 == 1 && (runnable = z3Var.S0) != null) {
                    runnable.run();
                    z3Var.S0 = null;
                }
                return x02;
            case 1:
                if (drawable != null && i7 != 1) {
                    n10.o(((kg.d1) ((t3) obj).I).h.animate().alpha(1.0f).translationY(0.0f), lr.f37212k, 250L);
                }
                return super.x0(drawable, str, i7, z10, i10);
            case 2:
            case 3:
            case 6:
            default:
                return super.x0(drawable, str, i7, z10, i10);
            case 4:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj;
                o5Var.j();
                boolean x03 = super.x0(drawable, str, i7, z10, i10);
                if (o5Var.f37978m && J()) {
                    o5Var.f37978m = false;
                    org.telegram.messenger.g0.g3(new lg(o5Var, 4));
                }
                return x03;
            case 5:
                boolean x04 = super.x0(drawable, str, i7, z10, i10);
                ((PhotoViewer) obj).k2();
                return x04;
            case 7:
                boolean x05 = super.x0(drawable, str, i7, z10, i10);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new hi.k3(this, 22));
                duration.start();
                return x05;
        }
    }

    public s2(Object obj, View view, int i7) {
        super(view);
        this.K1 = i7;
        this.L1 = obj;
    }
}
