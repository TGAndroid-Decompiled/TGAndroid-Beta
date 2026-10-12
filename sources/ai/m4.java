package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.am;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.tg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ho;
public final class m4 extends ImageReceiver {
    public final int f1388a;
    public final Object f1389b;

    public m4(View view, View view2, int i10) {
        super(view2);
        this.f1388a = i10;
        this.f1389b = view;
    }

    @Override
    public void invalidate() {
        switch (this.f1388a) {
            case 3:
                View view = ((ho) this.f1389b).f38474b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.s5) this.f1389b).k();
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
        int i12 = this.f1388a;
        Object obj = this.f1389b;
        switch (i12) {
            case 0:
                f6 f6Var = (f6) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = f6Var.f973i1) != null) {
                    runnable.run();
                    f6Var.f973i1 = null;
                }
                return imageBitmapByKey;
            case 1:
                if (drawable != null && i10 != 1) {
                    am.t(((hg.e1) ((z5) obj).H).f11208n.animate().alpha(1.0f).translationY(0.0f), js.f27631k, 250L);
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
                if (s5Var.f30408m && hasImageLoaded()) {
                    s5Var.f30408m = false;
                    AndroidUtilities.runOnUIThread(new tg(s5Var, 4));
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
        switch (this.f1388a) {
            case 2:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1389b;
                int[] iArr2 = u1Var.R0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                qh.g gVar = u1Var.f22901b6;
                if (gVar != null) {
                    gVar.f46618b.setRoundRadius(u1Var.R0);
                    return;
                }
                return;
            default:
                super.setRoundRadius(iArr);
                return;
        }
    }

    public m4(Object obj, int i10) {
        this.f1388a = i10;
        this.f1389b = obj;
    }
}
