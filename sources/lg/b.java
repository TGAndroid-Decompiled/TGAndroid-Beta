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
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.voip.k1;
import org.telegram.ui.Components.yc0;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f15544a;
    public final Object f15545b;

    public b(Object obj, int i10) {
        this.f15544a = i10;
        this.f15545b = obj;
    }

    public void b() {
        switch (this.f15544a) {
            case 1:
                hh0 hh0Var = (hh0) this.f15545b;
                WindowManager.LayoutParams layoutParams = hh0Var.f27106c;
                int t10 = (int) (hh0Var.t() * hh0Var.J);
                layoutParams.width = t10;
                hh0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = hh0Var.f27106c;
                int r10 = (int) (hh0Var.r() * hh0Var.J);
                layoutParams2.height = r10;
                hh0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(hh0Var.f27104b, hh0Var.d, hh0Var.f27106c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                k1 k1Var = (k1) this.f15545b;
                WindowManager.LayoutParams layoutParams3 = k1Var.f32124c;
                int m10 = (int) (k1Var.m() * k1Var.P);
                layoutParams3.width = m10;
                k1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = k1Var.f32124c;
                int l4 = (int) (k1Var.l() * k1Var.P);
                layoutParams4.height = l4;
                k1Var.N = l4;
                AndroidUtilities.updateViewLayout(k1Var.f32123b, k1Var.d, k1Var.f32124c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f15544a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f15545b).f15547b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f15611a;
                ImageView imageView = pVar.f15612b;
                if (!pVar.F) {
                    float f7 = pVar.L.f15604e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f15617r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (q.x((imageView.getHeight() - pVar.f15621y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                hh0 hh0Var = (hh0) this.f15545b;
                hh0Var.J = w7.o.a(scaleGestureDetector.getScaleFactor() * hh0Var.J, 0.75f, hh0Var.f27102a);
                hh0Var.H = (int) (hh0Var.t() * hh0Var.J);
                hh0Var.I = (int) (hh0Var.r() * hh0Var.J);
                AndroidUtilities.runOnUIThread(new yc0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - hh0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = hh0Var.M;
                if (!kVar.f17017f) {
                    kVar.f17014b = hh0Var.K;
                    kVar.f17015c = true;
                    kVar.f17024u.f17031i = dp;
                } else {
                    kVar.f17024u.f17031i = dp;
                }
                kVar.h();
                float a2 = w7.o.a(scaleGestureDetector.getFocusY() - (hh0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - hh0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = hh0Var.N;
                if (!kVar2.f17017f) {
                    kVar2.f17014b = hh0Var.L;
                    kVar2.f17015c = true;
                    kVar2.f17024u.f17031i = a2;
                } else {
                    kVar2.f17024u.f17031i = a2;
                }
                kVar2.h();
                return true;
            default:
                k1 k1Var = (k1) this.f15545b;
                k1Var.P = w7.o.a(scaleGestureDetector.getScaleFactor() * k1Var.P, 0.6f, k1Var.f32121a);
                k1Var.M = (int) (k1Var.m() * k1Var.P);
                k1Var.N = (int) (k1Var.l() * k1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 20));
                o1.k kVar3 = k1Var.S;
                kVar3.f17014b = k1Var.Q;
                kVar3.f17015c = true;
                o1.l lVar = kVar3.f17024u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - k1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f17031i = dp2;
                o1.k kVar4 = k1Var.S;
                if (!kVar4.f17017f) {
                    kVar4.h();
                }
                o1.k kVar5 = k1Var.T;
                kVar5.f17014b = k1Var.R;
                kVar5.f17015c = true;
                kVar5.f17024u.f17031i = w7.o.a(scaleGestureDetector.getFocusY() - (k1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = k1Var.T;
                if (!kVar6.f17017f) {
                    kVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15544a) {
            case 0:
                return true;
            case 1:
                hh0 hh0Var = (hh0) this.f15545b;
                if (hh0Var.f27122w) {
                    hh0Var.f27122w = false;
                    hh0Var.f27112f0 = false;
                    hh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(hh0Var.f27114h0);
                }
                hh0Var.f27123x = true;
                hh0Var.f27106c.width = (int) (hh0Var.t() * hh0Var.f27102a);
                hh0Var.f27106c.height = (int) (hh0Var.r() * hh0Var.f27102a);
                AndroidUtilities.updateViewLayout(hh0Var.f27104b, hh0Var.d, hh0Var.f27106c);
                return true;
            default:
                k1 k1Var = (k1) this.f15545b;
                if (k1Var.H) {
                    k1Var.H = false;
                }
                k1Var.I = true;
                k1Var.f32124c.width = (int) (k1Var.m() * k1Var.f32121a);
                k1Var.f32124c.height = (int) (k1Var.l() * k1Var.f32121a);
                AndroidUtilities.updateViewLayout(k1Var.f32123b, k1Var.d, k1Var.f32124c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15544a) {
            case 0:
                return;
            case 1:
                hh0 hh0Var = (hh0) this.f15545b;
                if (!hh0Var.M.f17017f && !hh0Var.N.f17017f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = hh0Var.M;
                if (!kVar.f17017f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = hh0Var.N;
                if (!kVar2.f17017f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                k1 k1Var = (k1) this.f15545b;
                if (!k1Var.S.f17017f && !k1Var.T.f17017f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = k1Var.S;
                if (!kVar3.f17017f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = k1Var.T;
                if (!kVar4.f17017f) {
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
