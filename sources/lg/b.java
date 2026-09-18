package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.g0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.q;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.voip.j1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14196a;
    public final Object f14197b;

    public b(Object obj, int i10) {
        this.f14196a = i10;
        this.f14197b = obj;
    }

    public void b() {
        switch (this.f14196a) {
            case 1:
                pg0 pg0Var = (pg0) this.f14197b;
                WindowManager.LayoutParams layoutParams = pg0Var.f27214c;
                int t10 = (int) (pg0Var.t() * pg0Var.J);
                layoutParams.width = t10;
                pg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = pg0Var.f27214c;
                int r10 = (int) (pg0Var.r() * pg0Var.J);
                layoutParams2.height = r10;
                pg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(pg0Var.f27212b, pg0Var.d, pg0Var.f27214c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14197b;
                WindowManager.LayoutParams layoutParams3 = j1Var.f29305c;
                int m10 = (int) (j1Var.m() * j1Var.P);
                layoutParams3.width = m10;
                j1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = j1Var.f29305c;
                int l4 = (int) (j1Var.l() * j1Var.P);
                layoutParams4.height = l4;
                j1Var.N = l4;
                AndroidUtilities.updateViewLayout(j1Var.f29304b, j1Var.d, j1Var.f29305c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14196a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14197b).f14199b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14256a;
                ImageView imageView = pVar.f14257b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14261r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (q.y((imageView.getHeight() - pVar.f14265y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                pg0 pg0Var = (pg0) this.f14197b;
                pg0Var.J = w7.q.a(scaleGestureDetector.getScaleFactor() * pg0Var.J, 0.75f, pg0Var.f27210a);
                pg0Var.H = (int) (pg0Var.t() * pg0Var.J);
                pg0Var.I = (int) (pg0Var.r() * pg0Var.J);
                AndroidUtilities.runOnUIThread(new kc0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - pg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = pg0Var.M;
                if (!kVar.f15483f) {
                    kVar.f15481b = pg0Var.K;
                    kVar.f15482c = true;
                    kVar.f15490u.f15496i = dp;
                } else {
                    kVar.f15490u.f15496i = dp;
                }
                kVar.f();
                float a2 = w7.q.a(scaleGestureDetector.getFocusY() - (pg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = pg0Var.N;
                if (!kVar2.f15483f) {
                    kVar2.f15481b = pg0Var.L;
                    kVar2.f15482c = true;
                    kVar2.f15490u.f15496i = a2;
                } else {
                    kVar2.f15490u.f15496i = a2;
                }
                kVar2.f();
                return true;
            default:
                j1 j1Var = (j1) this.f14197b;
                j1Var.P = w7.q.a(scaleGestureDetector.getScaleFactor() * j1Var.P, 0.6f, j1Var.f29302a);
                j1Var.M = (int) (j1Var.m() * j1Var.P);
                j1Var.N = (int) (j1Var.l() * j1Var.P);
                AndroidUtilities.runOnUIThread(new g0(this, 20));
                o1.k kVar3 = j1Var.S;
                kVar3.f15481b = j1Var.Q;
                kVar3.f15482c = true;
                o1.l lVar = kVar3.f15490u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - j1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15496i = dp2;
                o1.k kVar4 = j1Var.S;
                if (!kVar4.f15483f) {
                    kVar4.f();
                }
                o1.k kVar5 = j1Var.T;
                kVar5.f15481b = j1Var.R;
                kVar5.f15482c = true;
                kVar5.f15490u.f15496i = w7.q.a(scaleGestureDetector.getFocusY() - (j1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = j1Var.T;
                if (!kVar6.f15483f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14196a) {
            case 0:
                return true;
            case 1:
                pg0 pg0Var = (pg0) this.f14197b;
                if (pg0Var.f27229w) {
                    pg0Var.f27229w = false;
                    pg0Var.f27219f0 = false;
                    pg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(pg0Var.f27221h0);
                }
                pg0Var.f27230x = true;
                pg0Var.f27214c.width = (int) (pg0Var.t() * pg0Var.f27210a);
                pg0Var.f27214c.height = (int) (pg0Var.r() * pg0Var.f27210a);
                AndroidUtilities.updateViewLayout(pg0Var.f27212b, pg0Var.d, pg0Var.f27214c);
                return true;
            default:
                j1 j1Var = (j1) this.f14197b;
                if (j1Var.H) {
                    j1Var.H = false;
                }
                j1Var.I = true;
                j1Var.f29305c.width = (int) (j1Var.m() * j1Var.f29302a);
                j1Var.f29305c.height = (int) (j1Var.l() * j1Var.f29302a);
                AndroidUtilities.updateViewLayout(j1Var.f29304b, j1Var.d, j1Var.f29305c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14196a) {
            case 0:
                return;
            case 1:
                pg0 pg0Var = (pg0) this.f14197b;
                if (!pg0Var.M.f15483f && !pg0Var.N.f15483f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = pg0Var.M;
                if (!kVar.f15483f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = pg0Var.N;
                if (!kVar2.f15483f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14197b;
                if (!j1Var.S.f15483f && !j1Var.T.f15483f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = j1Var.S;
                if (!kVar3.f15483f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = j1Var.T;
                if (!kVar4.f15483f) {
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
