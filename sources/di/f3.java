package di;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.pg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zn;
public final class f3 extends ImageReceiver {
    public final int f8549a;
    public final Object f8550b;

    public f3(Object obj, int i10) {
        this.f8549a = i10;
        this.f8550b = obj;
    }

    @Override
    public void invalidate() {
        int i10 = this.f8549a;
        Object obj = this.f8550b;
        switch (i10) {
            case 3:
                View view = ((zn) obj).f46315b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.t5) obj).k();
                super.invalidate();
                return;
            case 5:
            default:
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                org.telegram.ui.Wallet.t7 t7Var = ((org.telegram.ui.Wallet.s7) obj).f37254d0;
                int i11 = org.telegram.ui.Wallet.t7.G1;
                t7Var.f0();
                return;
        }
    }

    @Override
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        Runnable runnable;
        int i12 = this.f8549a;
        Object obj = this.f8550b;
        switch (i12) {
            case 0:
                q4 q4Var = (q4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = q4Var.X0) != null) {
                    runnable.run();
                    q4Var.X0 = null;
                }
                return imageBitmapByKey;
            case 1:
                if (drawable != null && i10 != 1) {
                    wh.q(((jg.d1) ((k4) obj).H).h.animate().alpha(1.0f).translationY(0.0f), ds.f27534k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 2:
            case 3:
            case 6:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 4:
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) obj;
                t5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (t5Var.f32862m && hasImageLoaded()) {
                    t5Var.f32862m = false;
                    AndroidUtilities.runOnUIThread(new pg(t5Var, 5));
                }
                return imageBitmapByKey2;
            case 5:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).p2();
                return imageBitmapByKey3;
            case 7:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new fi.e4(this, 16));
                duration.start();
                return imageBitmapByKey4;
        }
    }

    @Override
    public void setRoundRadius(int[] iArr) {
        switch (this.f8549a) {
            case 2:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f8550b;
                int[] iArr2 = s1Var.R0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                sh.g gVar = s1Var.f25035b6;
                if (gVar != null) {
                    gVar.f48670b.setRoundRadius(s1Var.R0);
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
        this.f8549a = i10;
        this.f8550b = obj;
    }
}
