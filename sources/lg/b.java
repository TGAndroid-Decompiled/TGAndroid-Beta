package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.f0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.voip.k1;
import w7.q;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14279a;
    public final Object f14280b;

    public b(Object obj, int i10) {
        this.f14279a = i10;
        this.f14280b = obj;
    }

    public void b() {
        switch (this.f14279a) {
            case 1:
                rg0 rg0Var = (rg0) this.f14280b;
                WindowManager.LayoutParams layoutParams = rg0Var.f27992c;
                int t10 = (int) (rg0Var.t() * rg0Var.J);
                layoutParams.width = t10;
                rg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = rg0Var.f27992c;
                int r10 = (int) (rg0Var.r() * rg0Var.J);
                layoutParams2.height = r10;
                rg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.f27990b, rg0Var.d, rg0Var.f27992c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                k1 k1Var = (k1) this.f14280b;
                WindowManager.LayoutParams layoutParams3 = k1Var.f29342c;
                int m10 = (int) (k1Var.m() * k1Var.P);
                layoutParams3.width = m10;
                k1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = k1Var.f29342c;
                int l4 = (int) (k1Var.l() * k1Var.P);
                layoutParams4.height = l4;
                k1Var.N = l4;
                AndroidUtilities.updateViewLayout(k1Var.f29341b, k1Var.d, k1Var.f29342c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14279a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14280b).f14282b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14339a;
                ImageView imageView = pVar.f14340b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14344r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (f0.x((imageView.getHeight() - pVar.f14348y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                rg0 rg0Var = (rg0) this.f14280b;
                rg0Var.J = q.a(scaleGestureDetector.getScaleFactor() * rg0Var.J, 0.75f, rg0Var.f27988a);
                rg0Var.H = (int) (rg0Var.t() * rg0Var.J);
                rg0Var.I = (int) (rg0Var.r() * rg0Var.J);
                AndroidUtilities.runOnUIThread(new lc0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - rg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = rg0Var.M;
                if (!kVar.f15542f) {
                    kVar.f15540b = rg0Var.K;
                    kVar.f15541c = true;
                    kVar.f15549u.f15555i = dp;
                } else {
                    kVar.f15549u.f15555i = dp;
                }
                kVar.f();
                float a2 = q.a(scaleGestureDetector.getFocusY() - (rg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = rg0Var.N;
                if (!kVar2.f15542f) {
                    kVar2.f15540b = rg0Var.L;
                    kVar2.f15541c = true;
                    kVar2.f15549u.f15555i = a2;
                } else {
                    kVar2.f15549u.f15555i = a2;
                }
                kVar2.f();
                return true;
            default:
                k1 k1Var = (k1) this.f14280b;
                k1Var.P = q.a(scaleGestureDetector.getScaleFactor() * k1Var.P, 0.6f, k1Var.f29339a);
                k1Var.M = (int) (k1Var.m() * k1Var.P);
                k1Var.N = (int) (k1Var.l() * k1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 21));
                o1.k kVar3 = k1Var.S;
                kVar3.f15540b = k1Var.Q;
                kVar3.f15541c = true;
                o1.l lVar = kVar3.f15549u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - k1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15555i = dp2;
                o1.k kVar4 = k1Var.S;
                if (!kVar4.f15542f) {
                    kVar4.f();
                }
                o1.k kVar5 = k1Var.T;
                kVar5.f15540b = k1Var.R;
                kVar5.f15541c = true;
                kVar5.f15549u.f15555i = q.a(scaleGestureDetector.getFocusY() - (k1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = k1Var.T;
                if (!kVar6.f15542f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14279a) {
            case 0:
                return true;
            case 1:
                rg0 rg0Var = (rg0) this.f14280b;
                if (rg0Var.f28007w) {
                    rg0Var.f28007w = false;
                    rg0Var.f27997f0 = false;
                    rg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(rg0Var.f27999h0);
                }
                rg0Var.f28008x = true;
                rg0Var.f27992c.width = (int) (rg0Var.t() * rg0Var.f27988a);
                rg0Var.f27992c.height = (int) (rg0Var.r() * rg0Var.f27988a);
                AndroidUtilities.updateViewLayout(rg0Var.f27990b, rg0Var.d, rg0Var.f27992c);
                return true;
            default:
                k1 k1Var = (k1) this.f14280b;
                if (k1Var.H) {
                    k1Var.H = false;
                }
                k1Var.I = true;
                k1Var.f29342c.width = (int) (k1Var.m() * k1Var.f29339a);
                k1Var.f29342c.height = (int) (k1Var.l() * k1Var.f29339a);
                AndroidUtilities.updateViewLayout(k1Var.f29341b, k1Var.d, k1Var.f29342c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14279a) {
            case 0:
                return;
            case 1:
                rg0 rg0Var = (rg0) this.f14280b;
                if (!rg0Var.M.f15542f && !rg0Var.N.f15542f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = rg0Var.M;
                if (!kVar.f15542f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = rg0Var.N;
                if (!kVar2.f15542f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                k1 k1Var = (k1) this.f14280b;
                if (!k1Var.S.f15542f && !k1Var.T.f15542f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = k1Var.S;
                if (!kVar3.f15542f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = k1Var.T;
                if (!kVar4.f15542f) {
                    arrayList2.add(kVar4);
                    return;
                } else {
                    kVar4.a(g2Var2);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
