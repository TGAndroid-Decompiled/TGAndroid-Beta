package ih;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.tn;
public final class z2 extends ImageReceiver {
    public final int f12365a;
    public final Object f12366b;

    public z2(View view, View view2, int i9) {
        super(view2);
        this.f12365a = i9;
        this.f12366b = view;
    }

    @Override
    public void invalidate() {
        switch (this.f12365a) {
            case 2:
                View view = ((tn) this.f12366b).f43035b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.k5) this.f12366b).k();
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        Runnable runnable;
        int i11 = this.f12365a;
        Object obj = this.f12366b;
        switch (i11) {
            case 0:
                i4 i4Var = (i4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                if (i9 == 1 && (runnable = i4Var.f11542e1) != null) {
                    runnable.run();
                    i4Var.f11542e1 = null;
                }
                return imageBitmapByKey;
            case 1:
            case 2:
            default:
                return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
            case 3:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) obj;
                k5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                if (k5Var.f29953m && hasImageLoaded()) {
                    k5Var.f29953m = false;
                    AndroidUtilities.runOnUIThread(new fg(k5Var, 4));
                }
                return imageBitmapByKey2;
            case 4:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                ((PhotoViewer) obj).l2();
                return imageBitmapByKey3;
            case 5:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new kh.g4(this, 12));
                duration.start();
                return imageBitmapByKey4;
            case 6:
                if (drawable != null && i9 != 1) {
                    ll.r(((pf.w0) ((d4) obj).D).f45807n.animate().alpha(1.0f).translationY(0.0f), gr.f28848k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
        }
    }

    @Override
    public void setRoundRadius(int[] iArr) {
        switch (this.f12365a) {
            case 1:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f12366b;
                int[] iArr2 = t1Var.N0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                yg.g gVar = t1Var.X5;
                if (gVar != null) {
                    gVar.f50226b.setRoundRadius(t1Var.N0);
                    return;
                }
                return;
            default:
                super.setRoundRadius(iArr);
                return;
        }
    }

    public z2(Object obj, int i9) {
        this.f12365a = i9;
        this.f12366b = obj;
    }
}
