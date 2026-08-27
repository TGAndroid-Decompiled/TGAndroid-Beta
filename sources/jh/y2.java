package jh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.er;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.un;

public final class y2 extends ImageReceiver {

    public final int f14150a;

    public final Object f14151b;

    public y2(View view, View view2, int i10) {
        super(view2);
        this.f14150a = i10;
        this.f14151b = view;
    }

    @Override
    public void invalidate() {
        switch (this.f14150a) {
            case 2:
                View view = ((un) this.f14151b).f43255b;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 3:
                ((org.telegram.ui.Components.k5) this.f14151b).k();
                super.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        Runnable runnable;
        int i12 = this.f14150a;
        Object obj = this.f14151b;
        switch (i12) {
            case 0:
                e4 e4Var = (e4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = e4Var.f13229e1) != null) {
                    runnable.run();
                    e4Var.f13229e1 = null;
                }
                return imageBitmapByKey;
            case 1:
            case 2:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 3:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) obj;
                k5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (k5Var.f29963m && hasImageLoaded()) {
                    k5Var.f29963m = false;
                    AndroidUtilities.runOnUIThread(new bg(k5Var, 4));
                }
                return imageBitmapByKey2;
            case 4:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).l2();
                return imageBitmapByKey3;
            case 5:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new lh.m2(this, 15));
                duration.start();
                return imageBitmapByKey4;
            case 6:
                if (drawable != null && i10 != 1) {
                    rl.o(((qf.w0) ((z3) obj).D).f46475n.animate().alpha(1.0f).translationY(0.0f), er.f28126k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        }
    }

    @Override
    public void setRoundRadius(int[] iArr) {
        switch (this.f14150a) {
            case 1:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f14151b;
                int[] iArr2 = s1Var.N0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int iDp = AndroidUtilities.dp(6.0f);
                iArr2[3] = iDp;
                iArr2[2] = iDp;
                zg.g gVar = s1Var.X5;
                if (gVar != null) {
                    gVar.f50822b.setRoundRadius(s1Var.N0);
                }
                break;
            default:
                super.setRoundRadius(iArr);
                break;
        }
    }

    public y2(Object obj, int i10) {
        this.f14150a = i10;
        this.f14151b = obj;
    }
}
