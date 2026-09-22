package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.g0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.l0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.voip.j1;
import w7.q;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14247a;
    public final Object f14248b;

    public b(Object obj, int i10) {
        this.f14247a = i10;
        this.f14248b = obj;
    }

    public void b() {
        switch (this.f14247a) {
            case 1:
                rg0 rg0Var = (rg0) this.f14248b;
                WindowManager.LayoutParams layoutParams = rg0Var.f27965c;
                int t10 = (int) (rg0Var.t() * rg0Var.J);
                layoutParams.width = t10;
                rg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = rg0Var.f27965c;
                int r10 = (int) (rg0Var.r() * rg0Var.J);
                layoutParams2.height = r10;
                rg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.f27963b, rg0Var.d, rg0Var.f27965c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14248b;
                WindowManager.LayoutParams layoutParams3 = j1Var.f29374c;
                int m10 = (int) (j1Var.m() * j1Var.P);
                layoutParams3.width = m10;
                j1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = j1Var.f29374c;
                int l4 = (int) (j1Var.l() * j1Var.P);
                layoutParams4.height = l4;
                j1Var.N = l4;
                AndroidUtilities.updateViewLayout(j1Var.f29373b, j1Var.d, j1Var.f29374c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14247a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14248b).f14250b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14307a;
                ImageView imageView = pVar.f14308b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14312r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (l0.x((imageView.getHeight() - pVar.f14316y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                rg0 rg0Var = (rg0) this.f14248b;
                rg0Var.J = q.a(scaleGestureDetector.getScaleFactor() * rg0Var.J, 0.75f, rg0Var.f27961a);
                rg0Var.H = (int) (rg0Var.t() * rg0Var.J);
                rg0Var.I = (int) (rg0Var.r() * rg0Var.J);
                AndroidUtilities.runOnUIThread(new jc0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - rg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = rg0Var.M;
                if (!kVar.f15530f) {
                    kVar.f15528b = rg0Var.K;
                    kVar.f15529c = true;
                    kVar.f15537u.f15543i = dp;
                } else {
                    kVar.f15537u.f15543i = dp;
                }
                kVar.f();
                float a2 = q.a(scaleGestureDetector.getFocusY() - (rg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = rg0Var.N;
                if (!kVar2.f15530f) {
                    kVar2.f15528b = rg0Var.L;
                    kVar2.f15529c = true;
                    kVar2.f15537u.f15543i = a2;
                } else {
                    kVar2.f15537u.f15543i = a2;
                }
                kVar2.f();
                return true;
            default:
                j1 j1Var = (j1) this.f14248b;
                j1Var.P = q.a(scaleGestureDetector.getScaleFactor() * j1Var.P, 0.6f, j1Var.f29371a);
                j1Var.M = (int) (j1Var.m() * j1Var.P);
                j1Var.N = (int) (j1Var.l() * j1Var.P);
                AndroidUtilities.runOnUIThread(new g0(this, 21));
                o1.k kVar3 = j1Var.S;
                kVar3.f15528b = j1Var.Q;
                kVar3.f15529c = true;
                o1.l lVar = kVar3.f15537u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - j1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15543i = dp2;
                o1.k kVar4 = j1Var.S;
                if (!kVar4.f15530f) {
                    kVar4.f();
                }
                o1.k kVar5 = j1Var.T;
                kVar5.f15528b = j1Var.R;
                kVar5.f15529c = true;
                kVar5.f15537u.f15543i = q.a(scaleGestureDetector.getFocusY() - (j1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = j1Var.T;
                if (!kVar6.f15530f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14247a) {
            case 0:
                return true;
            case 1:
                rg0 rg0Var = (rg0) this.f14248b;
                if (rg0Var.f27980w) {
                    rg0Var.f27980w = false;
                    rg0Var.f27970f0 = false;
                    rg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(rg0Var.f27972h0);
                }
                rg0Var.f27981x = true;
                rg0Var.f27965c.width = (int) (rg0Var.t() * rg0Var.f27961a);
                rg0Var.f27965c.height = (int) (rg0Var.r() * rg0Var.f27961a);
                AndroidUtilities.updateViewLayout(rg0Var.f27963b, rg0Var.d, rg0Var.f27965c);
                return true;
            default:
                j1 j1Var = (j1) this.f14248b;
                if (j1Var.H) {
                    j1Var.H = false;
                }
                j1Var.I = true;
                j1Var.f29374c.width = (int) (j1Var.m() * j1Var.f29371a);
                j1Var.f29374c.height = (int) (j1Var.l() * j1Var.f29371a);
                AndroidUtilities.updateViewLayout(j1Var.f29373b, j1Var.d, j1Var.f29374c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14247a) {
            case 0:
                return;
            case 1:
                rg0 rg0Var = (rg0) this.f14248b;
                if (!rg0Var.M.f15530f && !rg0Var.N.f15530f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = rg0Var.M;
                if (!kVar.f15530f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = rg0Var.N;
                if (!kVar2.f15530f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14248b;
                if (!j1Var.S.f15530f && !j1Var.T.f15530f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = j1Var.S;
                if (!kVar3.f15530f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = j1Var.T;
                if (!kVar4.f15530f) {
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
