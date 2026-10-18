package ci;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lk;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.pg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vn;
public final class f3 extends ImageReceiver {
    public final int f5316a;
    public final Object f5317b;

    public f3(Object obj, int i10) {
        this.f5316a = i10;
        this.f5317b = obj;
    }

    @Override
    public void invalidate() {
        int i10 = this.f5316a;
        Object obj = this.f5317b;
        switch (i10) {
            case 3:
                View view = ((vn) obj).f42228b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.r5) obj).k();
                super.invalidate();
                return;
            case 5:
            default:
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                org.telegram.ui.Wallet.t7 t7Var = ((org.telegram.ui.Wallet.s7) obj).f34844d0;
                int i11 = org.telegram.ui.Wallet.t7.G1;
                t7Var.f0();
                return;
        }
    }

    @Override
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        Runnable runnable;
        int i12 = this.f5316a;
        Object obj = this.f5317b;
        switch (i12) {
            case 0:
                p4 p4Var = (p4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = p4Var.f5672i1) != null) {
                    runnable.run();
                    p4Var.f5672i1 = null;
                }
                return imageBitmapByKey;
            case 1:
                if (drawable != null && i10 != 1) {
                    lk.t(((ig.d1) ((j4) obj).H).f12856n.animate().alpha(1.0f).translationY(0.0f), bs.f25034k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 2:
            case 3:
            case 6:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 4:
                org.telegram.ui.Components.r5 r5Var = (org.telegram.ui.Components.r5) obj;
                r5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (r5Var.f29844m && hasImageLoaded()) {
                    r5Var.f29844m = false;
                    AndroidUtilities.runOnUIThread(new pg(r5Var, 4));
                }
                return imageBitmapByKey2;
            case 5:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).m2();
                return imageBitmapByKey3;
            case 7:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new ei.i6(this, 13));
                duration.start();
                return imageBitmapByKey4;
        }
    }

    @Override
    public void setRoundRadius(int[] iArr) {
        switch (this.f5316a) {
            case 2:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f5317b;
                int[] iArr2 = u1Var.R0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                rh.g gVar = u1Var.f23233b6;
                if (gVar != null) {
                    gVar.f45749b.setRoundRadius(u1Var.R0);
                    return;
                }
                return;
            default:
                super.setRoundRadius(iArr);
                return;
        }
    }

    public f3(Object obj, View view, int i10) {
        super(view);
        this.f5316a = i10;
        this.f5317b = obj;
    }
}
