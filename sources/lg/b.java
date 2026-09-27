package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.l0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.voip.k1;
import w7.q;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14265a;
    public final Object f14266b;

    public b(Object obj, int i10) {
        this.f14265a = i10;
        this.f14266b = obj;
    }

    public void b() {
        switch (this.f14265a) {
            case 1:
                rg0 rg0Var = (rg0) this.f14266b;
                WindowManager.LayoutParams layoutParams = rg0Var.f27982c;
                int t10 = (int) (rg0Var.t() * rg0Var.J);
                layoutParams.width = t10;
                rg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = rg0Var.f27982c;
                int r10 = (int) (rg0Var.r() * rg0Var.J);
                layoutParams2.height = r10;
                rg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.f27980b, rg0Var.d, rg0Var.f27982c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                k1 k1Var = (k1) this.f14266b;
                WindowManager.LayoutParams layoutParams3 = k1Var.f29367c;
                int m10 = (int) (k1Var.m() * k1Var.P);
                layoutParams3.width = m10;
                k1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = k1Var.f29367c;
                int l4 = (int) (k1Var.l() * k1Var.P);
                layoutParams4.height = l4;
                k1Var.N = l4;
                AndroidUtilities.updateViewLayout(k1Var.f29366b, k1Var.d, k1Var.f29367c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14265a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14266b).f14268b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14325a;
                ImageView imageView = pVar.f14326b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14330r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (l0.x((imageView.getHeight() - pVar.f14334y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                rg0 rg0Var = (rg0) this.f14266b;
                rg0Var.J = q.a(scaleGestureDetector.getScaleFactor() * rg0Var.J, 0.75f, rg0Var.f27978a);
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
                if (!kVar.f15565f) {
                    kVar.f15563b = rg0Var.K;
                    kVar.f15564c = true;
                    kVar.f15572u.f15578i = dp;
                } else {
                    kVar.f15572u.f15578i = dp;
                }
                kVar.f();
                float a2 = q.a(scaleGestureDetector.getFocusY() - (rg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = rg0Var.N;
                if (!kVar2.f15565f) {
                    kVar2.f15563b = rg0Var.L;
                    kVar2.f15564c = true;
                    kVar2.f15572u.f15578i = a2;
                } else {
                    kVar2.f15572u.f15578i = a2;
                }
                kVar2.f();
                return true;
            default:
                k1 k1Var = (k1) this.f14266b;
                k1Var.P = q.a(scaleGestureDetector.getScaleFactor() * k1Var.P, 0.6f, k1Var.f29364a);
                k1Var.M = (int) (k1Var.m() * k1Var.P);
                k1Var.N = (int) (k1Var.l() * k1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 20));
                o1.k kVar3 = k1Var.S;
                kVar3.f15563b = k1Var.Q;
                kVar3.f15564c = true;
                o1.l lVar = kVar3.f15572u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - k1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15578i = dp2;
                o1.k kVar4 = k1Var.S;
                if (!kVar4.f15565f) {
                    kVar4.f();
                }
                o1.k kVar5 = k1Var.T;
                kVar5.f15563b = k1Var.R;
                kVar5.f15564c = true;
                kVar5.f15572u.f15578i = q.a(scaleGestureDetector.getFocusY() - (k1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = k1Var.T;
                if (!kVar6.f15565f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14265a) {
            case 0:
                return true;
            case 1:
                rg0 rg0Var = (rg0) this.f14266b;
                if (rg0Var.f27997w) {
                    rg0Var.f27997w = false;
                    rg0Var.f27987f0 = false;
                    rg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(rg0Var.f27989h0);
                }
                rg0Var.f27998x = true;
                rg0Var.f27982c.width = (int) (rg0Var.t() * rg0Var.f27978a);
                rg0Var.f27982c.height = (int) (rg0Var.r() * rg0Var.f27978a);
                AndroidUtilities.updateViewLayout(rg0Var.f27980b, rg0Var.d, rg0Var.f27982c);
                return true;
            default:
                k1 k1Var = (k1) this.f14266b;
                if (k1Var.H) {
                    k1Var.H = false;
                }
                k1Var.I = true;
                k1Var.f29367c.width = (int) (k1Var.m() * k1Var.f29364a);
                k1Var.f29367c.height = (int) (k1Var.l() * k1Var.f29364a);
                AndroidUtilities.updateViewLayout(k1Var.f29366b, k1Var.d, k1Var.f29367c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14265a) {
            case 0:
                return;
            case 1:
                rg0 rg0Var = (rg0) this.f14266b;
                if (!rg0Var.M.f15565f && !rg0Var.N.f15565f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = rg0Var.M;
                if (!kVar.f15565f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = rg0Var.N;
                if (!kVar2.f15565f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                k1 k1Var = (k1) this.f14266b;
                if (!k1Var.S.f15565f && !k1Var.T.f15565f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = k1Var.S;
                if (!kVar3.f15565f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = k1Var.T;
                if (!kVar4.f15565f) {
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
