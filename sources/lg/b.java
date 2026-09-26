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
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.voip.k1;
import w7.q;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14263a;
    public final Object f14264b;

    public b(Object obj, int i10) {
        this.f14263a = i10;
        this.f14264b = obj;
    }

    public void b() {
        switch (this.f14263a) {
            case 1:
                og0 og0Var = (og0) this.f14264b;
                WindowManager.LayoutParams layoutParams = og0Var.f27051c;
                int t10 = (int) (og0Var.t() * og0Var.J);
                layoutParams.width = t10;
                og0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = og0Var.f27051c;
                int r10 = (int) (og0Var.r() * og0Var.J);
                layoutParams2.height = r10;
                og0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(og0Var.f27049b, og0Var.d, og0Var.f27051c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                k1 k1Var = (k1) this.f14264b;
                WindowManager.LayoutParams layoutParams3 = k1Var.f29424c;
                int m10 = (int) (k1Var.m() * k1Var.P);
                layoutParams3.width = m10;
                k1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = k1Var.f29424c;
                int l4 = (int) (k1Var.l() * k1Var.P);
                layoutParams4.height = l4;
                k1Var.N = l4;
                AndroidUtilities.updateViewLayout(k1Var.f29423b, k1Var.d, k1Var.f29424c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14263a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14264b).f14266b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14323a;
                ImageView imageView = pVar.f14324b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14328r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (f0.x((imageView.getHeight() - pVar.f14332y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                og0 og0Var = (og0) this.f14264b;
                og0Var.J = q.a(scaleGestureDetector.getScaleFactor() * og0Var.J, 0.75f, og0Var.f27047a);
                og0Var.H = (int) (og0Var.t() * og0Var.J);
                og0Var.I = (int) (og0Var.r() * og0Var.J);
                AndroidUtilities.runOnUIThread(new ic0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - og0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = og0Var.M;
                if (!kVar.f15526f) {
                    kVar.f15524b = og0Var.K;
                    kVar.f15525c = true;
                    kVar.f15533u.f15539i = dp;
                } else {
                    kVar.f15533u.f15539i = dp;
                }
                kVar.f();
                float a2 = q.a(scaleGestureDetector.getFocusY() - (og0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = og0Var.N;
                if (!kVar2.f15526f) {
                    kVar2.f15524b = og0Var.L;
                    kVar2.f15525c = true;
                    kVar2.f15533u.f15539i = a2;
                } else {
                    kVar2.f15533u.f15539i = a2;
                }
                kVar2.f();
                return true;
            default:
                k1 k1Var = (k1) this.f14264b;
                k1Var.P = q.a(scaleGestureDetector.getScaleFactor() * k1Var.P, 0.6f, k1Var.f29421a);
                k1Var.M = (int) (k1Var.m() * k1Var.P);
                k1Var.N = (int) (k1Var.l() * k1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 21));
                o1.k kVar3 = k1Var.S;
                kVar3.f15524b = k1Var.Q;
                kVar3.f15525c = true;
                o1.l lVar = kVar3.f15533u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - k1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15539i = dp2;
                o1.k kVar4 = k1Var.S;
                if (!kVar4.f15526f) {
                    kVar4.f();
                }
                o1.k kVar5 = k1Var.T;
                kVar5.f15524b = k1Var.R;
                kVar5.f15525c = true;
                kVar5.f15533u.f15539i = q.a(scaleGestureDetector.getFocusY() - (k1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = k1Var.T;
                if (!kVar6.f15526f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14263a) {
            case 0:
                return true;
            case 1:
                og0 og0Var = (og0) this.f14264b;
                if (og0Var.f27066w) {
                    og0Var.f27066w = false;
                    og0Var.f27056f0 = false;
                    og0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(og0Var.f27058h0);
                }
                og0Var.f27067x = true;
                og0Var.f27051c.width = (int) (og0Var.t() * og0Var.f27047a);
                og0Var.f27051c.height = (int) (og0Var.r() * og0Var.f27047a);
                AndroidUtilities.updateViewLayout(og0Var.f27049b, og0Var.d, og0Var.f27051c);
                return true;
            default:
                k1 k1Var = (k1) this.f14264b;
                if (k1Var.H) {
                    k1Var.H = false;
                }
                k1Var.I = true;
                k1Var.f29424c.width = (int) (k1Var.m() * k1Var.f29421a);
                k1Var.f29424c.height = (int) (k1Var.l() * k1Var.f29421a);
                AndroidUtilities.updateViewLayout(k1Var.f29423b, k1Var.d, k1Var.f29424c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14263a) {
            case 0:
                return;
            case 1:
                og0 og0Var = (og0) this.f14264b;
                if (!og0Var.M.f15526f && !og0Var.N.f15526f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = og0Var.M;
                if (!kVar.f15526f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = og0Var.N;
                if (!kVar2.f15526f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                k1 k1Var = (k1) this.f14264b;
                if (!k1Var.S.f15526f && !k1Var.T.f15526f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = k1Var.S;
                if (!kVar3.f15526f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = k1Var.T;
                if (!kVar4.f15526f) {
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
