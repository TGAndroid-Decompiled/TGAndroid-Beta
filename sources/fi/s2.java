package fi;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ng;
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
    public void M0(int[] iArr) {
        sh.e eVar;
        switch (this.K1) {
            case 2:
                super.M0(iArr);
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.L1;
                int[] iArr2 = r1Var.T0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int L = org.telegram.messenger.g0.L(6.0f);
                iArr2[3] = L;
                iArr2[2] = L;
                org.telegram.ui.Cells.x1 x1Var = r1Var.f31714x2;
                if (x1Var != null && (eVar = x1Var.f32393m) != null) {
                    eVar.f57556b.M0(iArr2);
                    return;
                }
                return;
            default:
                super.M0(iArr);
                return;
        }
    }

    @Override
    public void invalidate() {
        int i7 = this.K1;
        Object obj = this.L1;
        switch (i7) {
            case 3:
                View view = ((en) obj).f47587b;
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
                org.telegram.ui.Wallet.s8 s8Var = ((org.telegram.ui.Wallet.r8) obj).f45004d0;
                int i10 = org.telegram.ui.Wallet.s8.J1;
                s8Var.f0();
                return;
        }
    }

    @Override
    public boolean y0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        Runnable runnable;
        int i11 = this.K1;
        Object obj = this.L1;
        switch (i11) {
            case 0:
                z3 z3Var = (z3) obj;
                boolean y02 = super.y0(drawable, str, i7, z10, i10);
                if (i7 == 1 && (runnable = z3Var.S0) != null) {
                    runnable.run();
                    z3Var.S0 = null;
                }
                return y02;
            case 1:
                if (drawable != null && i7 != 1) {
                    m10.o(((kg.c1) ((t3) obj).I).h.animate().alpha(1.0f).translationY(0.0f), kr.f36862k, 250L);
                }
                return super.y0(drawable, str, i7, z10, i10);
            case 2:
            case 3:
            case 6:
            default:
                return super.y0(drawable, str, i7, z10, i10);
            case 4:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj;
                o5Var.j();
                boolean y03 = super.y0(drawable, str, i7, z10, i10);
                if (o5Var.f38030m && K()) {
                    o5Var.f38030m = false;
                    org.telegram.messenger.g0.g3(new ng(o5Var, 4));
                }
                return y03;
            case 5:
                boolean y04 = super.y0(drawable, str, i7, z10, i10);
                ((PhotoViewer) obj).l2();
                return y04;
            case 7:
                boolean y05 = super.y0(drawable, str, i7, z10, i10);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new hi.s3(this, 22));
                duration.start();
                return y05;
        }
    }

    public s2(Object obj, View view, int i7) {
        super(view);
        this.K1 = i7;
        this.L1 = obj;
    }
}
