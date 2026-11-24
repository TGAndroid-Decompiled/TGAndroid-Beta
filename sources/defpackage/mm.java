package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
public final class mm extends ImageReceiver {
    public final byte K1;
    public final Object L1;

    public mm(Object obj, byte b) {
        super(null);
        this.K1 = b;
        this.L1 = obj;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        Runnable runnable;
        byte b = this.K1;
        Object obj = this.L1;
        switch (b) {
            case 0:
                vm vmVar = (vm) obj;
                vmVar.j();
                boolean h0 = super.h0(drawable, str, i, z, i2);
                if (vmVar.m && C()) {
                    vmVar.m = false;
                    gm.c3(new b1(vmVar, (byte) 15));
                }
                return h0;
            case 1:
                boolean h02 = super.h0(drawable, str, i, z, i2);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new f0(this, (byte) 20));
                duration.start();
                return h02;
            case 2:
            case 3:
            default:
                return super.h0(drawable, str, i, z, i2);
            case 4:
                if (drawable != null && i != 1) {
                    wi8.t(((oc6) ((kc0) obj).I).h.animate().alpha(1.0f).translationY(0.0f), d53.k, 250L);
                }
                return super.h0(drawable, str, i, z, i2);
            case 5:
                a58 a58Var = (a58) obj;
                boolean h03 = super.h0(drawable, str, i, z, i2);
                if (i == 1 && (runnable = a58Var.Y0) != null) {
                    runnable.run();
                    a58Var.Y0 = null;
                }
                return h03;
            case 6:
                boolean h04 = super.h0(drawable, str, i, z, i2);
                ((PhotoViewer) obj).u1();
                return h04;
        }
    }

    @Override
    public final void invalidate() {
        byte b = this.K1;
        Object obj = this.L1;
        switch (b) {
            case 0:
                ((vm) obj).j();
                super.invalidate();
                return;
            case 2:
                View view = ((a92) obj).b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                super.invalidate();
                mqc mqcVar = ((lqc) obj).d0;
                int i = mqc.J1;
                mqcVar.f0();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void s0(int[] iArr) {
        ag8 ag8Var;
        switch (this.K1) {
            case 3:
                super.s0(iArr);
                rc2 rc2Var = (rc2) this.L1;
                int[] iArr2 = rc2Var.T0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int L = gm.L(6.0f);
                iArr2[3] = L;
                iArr2[2] = L;
                xc2 xc2Var = rc2Var.x2;
                if (xc2Var != null && (ag8Var = xc2Var.m) != null) {
                    ag8Var.b.s0(iArr2);
                    return;
                }
                return;
            default:
                super.s0(iArr);
                return;
        }
    }

    public mm(Object obj, View view, byte b) {
        super(view);
        this.K1 = b;
        this.L1 = obj;
    }
}
