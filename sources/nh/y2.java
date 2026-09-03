package nh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.mr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;
public final class y2 extends ImageReceiver {
    public final int f16052a;
    public final Object f16053b;

    public y2(View view, View view2, int i10) {
        super(view2);
        this.f16052a = i10;
        this.f16053b = view;
    }

    @Override
    public void invalidate() {
        switch (this.f16052a) {
            case 2:
                View view = ((co) this.f16053b).f33197b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.l5) this.f16053b).k();
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        Runnable runnable;
        int i12 = this.f16052a;
        Object obj = this.f16053b;
        switch (i12) {
            case 0:
                d4 d4Var = (d4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (i10 == 1 && (runnable = d4Var.f15176f1) != null) {
                    runnable.run();
                    d4Var.f15176f1 = null;
                }
                return imageBitmapByKey;
            case 1:
            case 2:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
            case 3:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) obj;
                l5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (l5Var.f26589m && hasImageLoaded()) {
                    l5Var.f26589m = false;
                    AndroidUtilities.runOnUIThread(new fg(l5Var, 4));
                }
                return imageBitmapByKey2;
            case 4:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                ((PhotoViewer) obj).l2();
                return imageBitmapByKey3;
            case 5:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new e5(this, 9));
                duration.start();
                return imageBitmapByKey4;
            case 6:
                if (drawable != null && i10 != 1) {
                    org.telegram.ui.b.p(((uf.v0) ((y3) obj).E).f45527n.animate().alpha(1.0f).translationY(0.0f), mr.f27126k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
        }
    }

    @Override
    public void setRoundRadius(int[] iArr) {
        switch (this.f16052a) {
            case 1:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f16053b;
                int[] iArr2 = s1Var.O0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                dh.j jVar = s1Var.Y5;
                if (jVar != null) {
                    jVar.f4914b.setRoundRadius(s1Var.O0);
                    return;
                }
                return;
            default:
                super.setRoundRadius(iArr);
                return;
        }
    }

    public y2(Object obj, int i10) {
        this.f16052a = i10;
        this.f16053b = obj;
    }
}
