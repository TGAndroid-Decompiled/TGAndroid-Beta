package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.q;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.voip.j1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f15509a;
    public final Object f15510b;

    public b(Object obj, int i10) {
        this.f15509a = i10;
        this.f15510b = obj;
    }

    public void b() {
        switch (this.f15509a) {
            case 1:
                hh0 hh0Var = (hh0) this.f15510b;
                WindowManager.LayoutParams layoutParams = hh0Var.f27016c;
                int t10 = (int) (hh0Var.t() * hh0Var.J);
                layoutParams.width = t10;
                hh0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = hh0Var.f27016c;
                int r10 = (int) (hh0Var.r() * hh0Var.J);
                layoutParams2.height = r10;
                hh0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(hh0Var.f27014b, hh0Var.d, hh0Var.f27016c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                j1 j1Var = (j1) this.f15510b;
                WindowManager.LayoutParams layoutParams3 = j1Var.f32066c;
                int m10 = (int) (j1Var.m() * j1Var.P);
                layoutParams3.width = m10;
                j1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = j1Var.f32066c;
                int l4 = (int) (j1Var.l() * j1Var.P);
                layoutParams4.height = l4;
                j1Var.N = l4;
                AndroidUtilities.updateViewLayout(j1Var.f32065b, j1Var.d, j1Var.f32066c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f15509a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f15510b).f15512b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f15576a;
                ImageView imageView = pVar.f15577b;
                if (!pVar.F) {
                    float f7 = pVar.L.f15569e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f15582r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (q.x((imageView.getHeight() - pVar.f15586y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                hh0 hh0Var = (hh0) this.f15510b;
                hh0Var.J = w7.o.a(scaleGestureDetector.getScaleFactor() * hh0Var.J, 0.75f, hh0Var.f27012a);
                hh0Var.H = (int) (hh0Var.t() * hh0Var.J);
                hh0Var.I = (int) (hh0Var.r() * hh0Var.J);
                AndroidUtilities.runOnUIThread(new cd0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - hh0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = hh0Var.M;
                if (!kVar.f16935f) {
                    kVar.f16932b = hh0Var.K;
                    kVar.f16933c = true;
                    kVar.f16942u.f16949i = dp;
                } else {
                    kVar.f16942u.f16949i = dp;
                }
                kVar.h();
                float a2 = w7.o.a(scaleGestureDetector.getFocusY() - (hh0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - hh0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = hh0Var.N;
                if (!kVar2.f16935f) {
                    kVar2.f16932b = hh0Var.L;
                    kVar2.f16933c = true;
                    kVar2.f16942u.f16949i = a2;
                } else {
                    kVar2.f16942u.f16949i = a2;
                }
                kVar2.h();
                return true;
            default:
                j1 j1Var = (j1) this.f15510b;
                j1Var.P = w7.o.a(scaleGestureDetector.getScaleFactor() * j1Var.P, 0.6f, j1Var.f32063a);
                j1Var.M = (int) (j1Var.m() * j1Var.P);
                j1Var.N = (int) (j1Var.l() * j1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 21));
                o1.k kVar3 = j1Var.S;
                kVar3.f16932b = j1Var.Q;
                kVar3.f16933c = true;
                o1.l lVar = kVar3.f16942u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - j1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f16949i = dp2;
                o1.k kVar4 = j1Var.S;
                if (!kVar4.f16935f) {
                    kVar4.h();
                }
                o1.k kVar5 = j1Var.T;
                kVar5.f16932b = j1Var.R;
                kVar5.f16933c = true;
                kVar5.f16942u.f16949i = w7.o.a(scaleGestureDetector.getFocusY() - (j1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = j1Var.T;
                if (!kVar6.f16935f) {
                    kVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15509a) {
            case 0:
                return true;
            case 1:
                hh0 hh0Var = (hh0) this.f15510b;
                if (hh0Var.f27032w) {
                    hh0Var.f27032w = false;
                    hh0Var.f27022f0 = false;
                    hh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(hh0Var.f27024h0);
                }
                hh0Var.f27033x = true;
                hh0Var.f27016c.width = (int) (hh0Var.t() * hh0Var.f27012a);
                hh0Var.f27016c.height = (int) (hh0Var.r() * hh0Var.f27012a);
                AndroidUtilities.updateViewLayout(hh0Var.f27014b, hh0Var.d, hh0Var.f27016c);
                return true;
            default:
                j1 j1Var = (j1) this.f15510b;
                if (j1Var.H) {
                    j1Var.H = false;
                }
                j1Var.I = true;
                j1Var.f32066c.width = (int) (j1Var.m() * j1Var.f32063a);
                j1Var.f32066c.height = (int) (j1Var.l() * j1Var.f32063a);
                AndroidUtilities.updateViewLayout(j1Var.f32065b, j1Var.d, j1Var.f32066c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15509a) {
            case 0:
                return;
            case 1:
                hh0 hh0Var = (hh0) this.f15510b;
                if (!hh0Var.M.f16935f && !hh0Var.N.f16935f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = hh0Var.M;
                if (!kVar.f16935f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = hh0Var.N;
                if (!kVar2.f16935f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                j1 j1Var = (j1) this.f15510b;
                if (!j1Var.S.f16935f && !j1Var.T.f16935f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = j1Var.S;
                if (!kVar3.f16935f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = j1Var.T;
                if (!kVar4.f16935f) {
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
