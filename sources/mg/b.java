package mg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import ci.j1;
import java.util.ArrayList;
import ki.u;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.zg0;
import w7.r;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f16858a;
    public final Object f16859b;

    public b(Object obj, int i10) {
        this.f16858a = i10;
        this.f16859b = obj;
    }

    public void b() {
        switch (this.f16858a) {
            case 1:
                zg0 zg0Var = (zg0) this.f16859b;
                WindowManager.LayoutParams layoutParams = zg0Var.f32917c;
                int t10 = (int) (zg0Var.t() * zg0Var.J);
                layoutParams.width = t10;
                zg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = zg0Var.f32917c;
                int r10 = (int) (zg0Var.r() * zg0Var.J);
                layoutParams2.height = r10;
                zg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(zg0Var.f32915b, zg0Var.d, zg0Var.f32917c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16859b;
                WindowManager.LayoutParams layoutParams3 = h1Var.f31491c;
                int m10 = (int) (h1Var.m() * h1Var.P);
                layoutParams3.width = m10;
                h1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.f31491c;
                int l4 = (int) (h1Var.l() * h1Var.P);
                layoutParams4.height = l4;
                h1Var.N = l4;
                AndroidUtilities.updateViewLayout(h1Var.f31490b, h1Var.d, h1Var.f31491c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f16858a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f16859b).f16861b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f16918a;
                ImageView imageView = pVar.f16919b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f16923r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (g0.x((imageView.getHeight() - pVar.f16927y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                zg0 zg0Var = (zg0) this.f16859b;
                zg0Var.J = r.a(scaleGestureDetector.getScaleFactor() * zg0Var.J, 0.75f, zg0Var.f32913a);
                zg0Var.H = (int) (zg0Var.t() * zg0Var.J);
                zg0Var.I = (int) (zg0Var.r() * zg0Var.J);
                AndroidUtilities.runOnUIThread(new rc0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - zg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = zg0Var.M;
                if (!kVar.f17555f) {
                    kVar.f17553b = zg0Var.K;
                    kVar.f17554c = true;
                    kVar.f17562u.f17568i = dp;
                } else {
                    kVar.f17562u.f17568i = dp;
                }
                kVar.h();
                float a2 = r.a(scaleGestureDetector.getFocusY() - (zg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - zg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = zg0Var.N;
                if (!kVar2.f17555f) {
                    kVar2.f17553b = zg0Var.L;
                    kVar2.f17554c = true;
                    kVar2.f17562u.f17568i = a2;
                } else {
                    kVar2.f17562u.f17568i = a2;
                }
                kVar2.h();
                return true;
            default:
                h1 h1Var = (h1) this.f16859b;
                h1Var.P = r.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.f31488a);
                h1Var.M = (int) (h1Var.m() * h1Var.P);
                h1Var.N = (int) (h1Var.l() * h1Var.P);
                AndroidUtilities.runOnUIThread(new u(this, 15));
                o1.k kVar3 = h1Var.S;
                kVar3.f17553b = h1Var.Q;
                kVar3.f17554c = true;
                o1.l lVar = kVar3.f17562u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - h1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f17568i = dp2;
                o1.k kVar4 = h1Var.S;
                if (!kVar4.f17555f) {
                    kVar4.h();
                }
                o1.k kVar5 = h1Var.T;
                kVar5.f17553b = h1Var.R;
                kVar5.f17554c = true;
                kVar5.f17562u.f17568i = r.a(scaleGestureDetector.getFocusY() - (h1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.T;
                if (!kVar6.f17555f) {
                    kVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16858a) {
            case 0:
                return true;
            case 1:
                zg0 zg0Var = (zg0) this.f16859b;
                if (zg0Var.f32932w) {
                    zg0Var.f32932w = false;
                    zg0Var.f32922f0 = false;
                    zg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(zg0Var.f32924h0);
                }
                zg0Var.f32933x = true;
                zg0Var.f32917c.width = (int) (zg0Var.t() * zg0Var.f32913a);
                zg0Var.f32917c.height = (int) (zg0Var.r() * zg0Var.f32913a);
                AndroidUtilities.updateViewLayout(zg0Var.f32915b, zg0Var.d, zg0Var.f32917c);
                return true;
            default:
                h1 h1Var = (h1) this.f16859b;
                if (h1Var.H) {
                    h1Var.H = false;
                }
                h1Var.I = true;
                h1Var.f31491c.width = (int) (h1Var.m() * h1Var.f31488a);
                h1Var.f31491c.height = (int) (h1Var.l() * h1Var.f31488a);
                AndroidUtilities.updateViewLayout(h1Var.f31490b, h1Var.d, h1Var.f31491c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16858a) {
            case 0:
                return;
            case 1:
                zg0 zg0Var = (zg0) this.f16859b;
                if (!zg0Var.M.f17555f && !zg0Var.N.f17555f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                j1 j1Var = new j1(this, arrayList, 1);
                o1.k kVar = zg0Var.M;
                if (!kVar.f17555f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(j1Var);
                }
                o1.k kVar2 = zg0Var.N;
                if (!kVar2.f17555f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(j1Var);
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16859b;
                if (!h1Var.S.f17555f && !h1Var.T.f17555f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                j1 j1Var2 = new j1(this, arrayList2, 2);
                o1.k kVar3 = h1Var.S;
                if (!kVar3.f17555f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(j1Var2);
                }
                o1.k kVar4 = h1Var.T;
                if (!kVar4.f17555f) {
                    arrayList2.add(kVar4);
                    return;
                } else {
                    kVar4.a(j1Var2);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
