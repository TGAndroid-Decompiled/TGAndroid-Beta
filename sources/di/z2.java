package di;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dn;
public final class z2 extends ImageReceiver {
    public final int J1;
    public final Object K1;

    public z2(Object obj, int i7) {
        super(null);
        this.J1 = i7;
        this.K1 = obj;
    }

    @Override
    public void L0(int[] iArr) {
        sh.e eVar;
        switch (this.J1) {
            case 2:
                super.L0(iArr);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.K1;
                int[] iArr2 = q1Var.S0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int L = org.telegram.messenger.g0.L(6.0f);
                iArr2[3] = L;
                iArr2[2] = L;
                org.telegram.ui.Cells.w1 w1Var = q1Var.f30046w2;
                if (w1Var != null && (eVar = w1Var.f30705m) != null) {
                    eVar.f55181b.L0(iArr2);
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
        int i7 = this.J1;
        Object obj = this.K1;
        switch (i7) {
            case 3:
                View view = ((dn) obj).f45087b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.i5) obj).j();
                super.invalidate();
                return;
            case 5:
            default:
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                org.telegram.ui.Wallet.c8 c8Var = ((org.telegram.ui.Wallet.b8) obj).f42133d0;
                int i10 = org.telegram.ui.Wallet.c8.G1;
                c8Var.f0();
                return;
        }
    }

    @Override
    public boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        Runnable runnable;
        int i11 = this.J1;
        Object obj = this.K1;
        switch (i11) {
            case 0:
                i4 i4Var = (i4) obj;
                boolean x02 = super.x0(drawable, str, i7, z9, i10);
                if (i7 == 1 && (runnable = i4Var.R0) != null) {
                    runnable.run();
                    i4Var.R0 = null;
                }
                return x02;
            case 1:
                if (drawable != null && i7 != 1) {
                    org.telegram.messenger.camera.q.l(((kg.a1) ((c4) obj).H).h.animate().alpha(1.0f).translationY(0.0f), xq.f40314k, 250L);
                }
                return super.x0(drawable, str, i7, z9, i10);
            case 2:
            case 3:
            case 6:
            default:
                return super.x0(drawable, str, i7, z9, i10);
            case 4:
                org.telegram.ui.Components.i5 i5Var = (org.telegram.ui.Components.i5) obj;
                i5Var.j();
                boolean x03 = super.x0(drawable, str, i7, z9, i10);
                if (i5Var.f34507m && J()) {
                    i5Var.f34507m = false;
                    org.telegram.messenger.g0.h3(new xf(i5Var, 4));
                }
                return x03;
            case 5:
                boolean x04 = super.x0(drawable, str, i7, z9, i10);
                ((PhotoViewer) obj).j2();
                return x04;
            case 7:
                boolean x05 = super.x0(drawable, str, i7, z9, i10);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new fi.v3(this, 21));
                duration.start();
                return x05;
        }
    }

    public z2(Object obj, View view, int i7) {
        super(view);
        this.J1 = i7;
        this.K1 = obj;
    }
}
