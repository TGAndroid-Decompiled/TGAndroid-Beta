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
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.voip.k1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f15508a;
    public final Object f15509b;

    public b(Object obj, int i10) {
        this.f15508a = i10;
        this.f15509b = obj;
    }

    public void b() {
        switch (this.f15508a) {
            case 1:
                ih0 ih0Var = (ih0) this.f15509b;
                WindowManager.LayoutParams layoutParams = ih0Var.f27330c;
                int t10 = (int) (ih0Var.t() * ih0Var.J);
                layoutParams.width = t10;
                ih0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = ih0Var.f27330c;
                int r10 = (int) (ih0Var.r() * ih0Var.J);
                layoutParams2.height = r10;
                ih0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(ih0Var.f27328b, ih0Var.d, ih0Var.f27330c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                k1 k1Var = (k1) this.f15509b;
                WindowManager.LayoutParams layoutParams3 = k1Var.f32060c;
                int m10 = (int) (k1Var.m() * k1Var.P);
                layoutParams3.width = m10;
                k1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = k1Var.f32060c;
                int l4 = (int) (k1Var.l() * k1Var.P);
                layoutParams4.height = l4;
                k1Var.N = l4;
                AndroidUtilities.updateViewLayout(k1Var.f32059b, k1Var.d, k1Var.f32060c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f15508a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f15509b).f15511b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f15575a;
                ImageView imageView = pVar.f15576b;
                if (!pVar.F) {
                    float f7 = pVar.L.f15568e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f15581r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (q.x((imageView.getHeight() - pVar.f15585y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                ih0 ih0Var = (ih0) this.f15509b;
                ih0Var.J = w7.o.a(scaleGestureDetector.getScaleFactor() * ih0Var.J, 0.75f, ih0Var.f27326a);
                ih0Var.H = (int) (ih0Var.t() * ih0Var.J);
                ih0Var.I = (int) (ih0Var.r() * ih0Var.J);
                AndroidUtilities.runOnUIThread(new cd0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - ih0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = ih0Var.M;
                if (!kVar.f16981f) {
                    kVar.f16978b = ih0Var.K;
                    kVar.f16979c = true;
                    kVar.f16988u.f16995i = dp;
                } else {
                    kVar.f16988u.f16995i = dp;
                }
                kVar.h();
                float a2 = w7.o.a(scaleGestureDetector.getFocusY() - (ih0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ih0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = ih0Var.N;
                if (!kVar2.f16981f) {
                    kVar2.f16978b = ih0Var.L;
                    kVar2.f16979c = true;
                    kVar2.f16988u.f16995i = a2;
                } else {
                    kVar2.f16988u.f16995i = a2;
                }
                kVar2.h();
                return true;
            default:
                k1 k1Var = (k1) this.f15509b;
                k1Var.P = w7.o.a(scaleGestureDetector.getScaleFactor() * k1Var.P, 0.6f, k1Var.f32057a);
                k1Var.M = (int) (k1Var.m() * k1Var.P);
                k1Var.N = (int) (k1Var.l() * k1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 20));
                o1.k kVar3 = k1Var.S;
                kVar3.f16978b = k1Var.Q;
                kVar3.f16979c = true;
                o1.l lVar = kVar3.f16988u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - k1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f16995i = dp2;
                o1.k kVar4 = k1Var.S;
                if (!kVar4.f16981f) {
                    kVar4.h();
                }
                o1.k kVar5 = k1Var.T;
                kVar5.f16978b = k1Var.R;
                kVar5.f16979c = true;
                kVar5.f16988u.f16995i = w7.o.a(scaleGestureDetector.getFocusY() - (k1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = k1Var.T;
                if (!kVar6.f16981f) {
                    kVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15508a) {
            case 0:
                return true;
            case 1:
                ih0 ih0Var = (ih0) this.f15509b;
                if (ih0Var.f27346w) {
                    ih0Var.f27346w = false;
                    ih0Var.f27336f0 = false;
                    ih0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ih0Var.f27338h0);
                }
                ih0Var.f27347x = true;
                ih0Var.f27330c.width = (int) (ih0Var.t() * ih0Var.f27326a);
                ih0Var.f27330c.height = (int) (ih0Var.r() * ih0Var.f27326a);
                AndroidUtilities.updateViewLayout(ih0Var.f27328b, ih0Var.d, ih0Var.f27330c);
                return true;
            default:
                k1 k1Var = (k1) this.f15509b;
                if (k1Var.H) {
                    k1Var.H = false;
                }
                k1Var.I = true;
                k1Var.f32060c.width = (int) (k1Var.m() * k1Var.f32057a);
                k1Var.f32060c.height = (int) (k1Var.l() * k1Var.f32057a);
                AndroidUtilities.updateViewLayout(k1Var.f32059b, k1Var.d, k1Var.f32060c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15508a) {
            case 0:
                return;
            case 1:
                ih0 ih0Var = (ih0) this.f15509b;
                if (!ih0Var.M.f16981f && !ih0Var.N.f16981f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = ih0Var.M;
                if (!kVar.f16981f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = ih0Var.N;
                if (!kVar2.f16981f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                k1 k1Var = (k1) this.f15509b;
                if (!k1Var.S.f16981f && !k1Var.T.f16981f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = k1Var.S;
                if (!kVar3.f16981f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = k1Var.T;
                if (!kVar4.f16981f) {
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
