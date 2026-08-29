package lh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.jr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wn;
public final class x2 extends ImageReceiver {
    public final int f16391a;
    public final Object f16392b;

    public x2(View view, View view2, int i10) {
        super(view2);
        this.f16391a = i10;
        this.f16392b = view;
    }

    @Override
    public void invalidate() {
        switch (this.f16391a) {
            case 2:
                View view = ((wn) this.f16392b).f44330b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.p5) this.f16392b).k();
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
        int i12 = this.f16391a;
        Object obj = this.f16392b;
        switch (i12) {
            case 0:
                d4 d4Var = (d4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = d4Var.f15478e1) != null) {
                    runnable.run();
                    d4Var.f15478e1 = null;
                }
                return imageBitmapByKey;
            case 1:
            case 2:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 3:
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) obj;
                p5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (p5Var.f31595m && hasImageLoaded()) {
                    p5Var.f31595m = false;
                    AndroidUtilities.runOnUIThread(new ig(p5Var, 4));
                }
                return imageBitmapByKey2;
            case 4:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).l2();
                return imageBitmapByKey3;
            case 5:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new d5(this, 21));
                duration.start();
                return imageBitmapByKey4;
            case 6:
                if (drawable != null && i10 != 1) {
                    org.telegram.ui.b.q(((sf.v0) ((y3) obj).D).f47974n.animate().alpha(1.0f).translationY(0.0f), jr.f29804k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        }
    }

    @Override
    public void setRoundRadius(int[] iArr) {
        switch (this.f16391a) {
            case 1:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f16392b;
                int[] iArr2 = s1Var.N0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                bh.j jVar = s1Var.X5;
                if (jVar != null) {
                    jVar.f2672b.setRoundRadius(s1Var.N0);
                    return;
                }
                return;
            default:
                super.setRoundRadius(iArr);
                return;
        }
    }

    public x2(Object obj, int i10) {
        this.f16391a = i10;
        this.f16392b = obj;
    }
}
