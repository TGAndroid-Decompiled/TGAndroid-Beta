package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ai;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.rg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;
public final class m4 extends ImageReceiver {
    public final int f1390a;
    public final Object f1391b;

    public m4(View view, View view2, int i10) {
        super(view2);
        this.f1390a = i10;
        this.f1391b = view;
    }

    @Override
    public void invalidate() {
        switch (this.f1390a) {
            case 3:
                View view = ((co) this.f1391b).f36824b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.s5) this.f1391b).k();
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        Runnable runnable;
        int i12 = this.f1390a;
        Object obj = this.f1391b;
        switch (i12) {
            case 0:
                f6 f6Var = (f6) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = f6Var.f975i1) != null) {
                    runnable.run();
                    f6Var.f975i1 = null;
                }
                return imageBitmapByKey;
            case 1:
                if (drawable != null && i10 != 1) {
                    ai.t(((hg.e1) ((z5) obj).H).f11209n.animate().alpha(1.0f).translationY(0.0f), is.f27504k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 2:
            case 3:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 4:
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) obj;
                s5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (s5Var.f30741m && hasImageLoaded()) {
                    s5Var.f30741m = false;
                    AndroidUtilities.runOnUIThread(new rg(s5Var, 4));
                }
                return imageBitmapByKey2;
            case 5:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).m2();
                return imageBitmapByKey3;
            case 6:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 5));
                duration.start();
                return imageBitmapByKey4;
        }
    }

    @Override
    public void setRoundRadius(int[] iArr) {
        switch (this.f1390a) {
            case 2:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1391b;
                int[] iArr2 = u1Var.R0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                qh.g gVar = u1Var.f23157b6;
                if (gVar != null) {
                    gVar.f46790b.setRoundRadius(u1Var.R0);
                    return;
                }
                return;
            default:
                super.setRoundRadius(iArr);
                return;
        }
    }

    public m4(Object obj, int i10) {
        this.f1390a = i10;
        this.f1391b = obj;
    }
}
