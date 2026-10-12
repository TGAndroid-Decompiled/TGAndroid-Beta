package bi;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.yh;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.qg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.io;
public final class b4 extends ImageReceiver {
    public final int f2866a;
    public final Object f2867b;

    public b4(View view, View view2, int i10) {
        super(view2);
        this.f2866a = i10;
        this.f2867b = view;
    }

    @Override
    public void invalidate() {
        switch (this.f2866a) {
            case 3:
                View view = ((io) this.f2867b).f37175b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.s5) this.f2867b).k();
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
        int i12 = this.f2866a;
        Object obj = this.f2867b;
        switch (i12) {
            case 0:
                q5 q5Var = (q5) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = q5Var.f3531i1) != null) {
                    runnable.run();
                    q5Var.f3531i1 = null;
                }
                return imageBitmapByKey;
            case 1:
                if (drawable != null && i10 != 1) {
                    yh.s(((ig.e1) ((k5) obj).H).f11483n.animate().alpha(1.0f).translationY(0.0f), es.f24775k, 250L);
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
                if (s5Var.f29033m && hasImageLoaded()) {
                    s5Var.f29033m = false;
                    AndroidUtilities.runOnUIThread(new qg(s5Var, 4));
                }
                return imageBitmapByKey2;
            case 5:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).m2();
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
        switch (this.f2866a) {
            case 2:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f2867b;
                int[] iArr2 = u1Var.R0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                rh.g gVar = u1Var.f22157b6;
                if (gVar != null) {
                    gVar.f44669b.setRoundRadius(u1Var.R0);
                    return;
                }
                return;
            default:
                super.setRoundRadius(iArr);
                return;
        }
    }

    public b4(Object obj, int i10) {
        this.f2866a = i10;
        this.f2867b = obj;
    }
}
