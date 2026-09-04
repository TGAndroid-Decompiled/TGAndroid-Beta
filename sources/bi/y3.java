package bi;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.go;
public final class y3 extends ImageReceiver {
    public final int f4010a;
    public final Object f4011b;

    public y3(View view, View view2, int i10) {
        super(view2);
        this.f4010a = i10;
        this.f4011b = view;
    }

    @Override
    public void invalidate() {
        switch (this.f4010a) {
            case 3:
                View view = ((go) this.f4011b).f36725b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.q5) this.f4011b).k();
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
        int i12 = this.f4010a;
        Object obj = this.f4011b;
        switch (i12) {
            case 0:
                o5 o5Var = (o5) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = o5Var.f3429i1) != null) {
                    runnable.run();
                    o5Var.f3429i1 = null;
                }
                return imageBitmapByKey;
            case 1:
                if (drawable != null && i10 != 1) {
                    wl.q(((ig.e1) ((i5) obj).H).f12046n.animate().alpha(1.0f).translationY(0.0f), pr.f29470k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 2:
            case 3:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 4:
                org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) obj;
                q5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (q5Var.f29586m && hasImageLoaded()) {
                    q5Var.f29586m = false;
                    AndroidUtilities.runOnUIThread(new pg(q5Var, 4));
                }
                return imageBitmapByKey2;
            case 5:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).l2();
                return imageBitmapByKey3;
            case 6:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new ki.a(this, 6));
                duration.start();
                return imageBitmapByKey4;
        }
    }

    @Override
    public void setRoundRadius(int[] iArr) {
        switch (this.f4010a) {
            case 2:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f4011b;
                int[] iArr2 = t1Var.R0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                rh.g gVar = t1Var.f22876b6;
                if (gVar != null) {
                    gVar.f45621b.setRoundRadius(t1Var.R0);
                    return;
                }
                return;
            default:
                super.setRoundRadius(iArr);
                return;
        }
    }

    public y3(Object obj, int i10) {
        this.f4010a = i10;
        this.f4011b = obj;
    }
}
