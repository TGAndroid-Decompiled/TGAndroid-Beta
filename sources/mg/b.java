package mg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import bi.v1;
import ig.t0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.w1;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.voip.h1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f16234a;
    public final Object f16235b;

    public b(Object obj, int i10) {
        this.f16234a = i10;
        this.f16235b = obj;
    }

    public void b() {
        switch (this.f16234a) {
            case 1:
                eg0 eg0Var = (eg0) this.f16235b;
                WindowManager.LayoutParams layoutParams = eg0Var.f25680c;
                int t10 = (int) (eg0Var.t() * eg0Var.J);
                layoutParams.width = t10;
                eg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = eg0Var.f25680c;
                int r10 = (int) (eg0Var.r() * eg0Var.J);
                layoutParams2.height = r10;
                eg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var.f25678b, eg0Var.d, eg0Var.f25680c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16235b;
                WindowManager.LayoutParams layoutParams3 = h1Var.f31520c;
                int m10 = (int) (h1Var.m() * h1Var.P);
                layoutParams3.width = m10;
                h1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.f31520c;
                int l4 = (int) (h1Var.l() * h1Var.P);
                layoutParams4.height = l4;
                h1Var.N = l4;
                AndroidUtilities.updateViewLayout(h1Var.f31519b, h1Var.d, h1Var.f31520c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f16234a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                q qVar = ((c) this.f16235b).f16237b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = qVar.f16303a;
                ImageView imageView = qVar.f16304b;
                if (!qVar.F) {
                    float f7 = qVar.L.f16296e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!qVar.f16309r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    o.g(qVar.L, scaleFactor, o.a(qVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), o.b(qVar.L) * (w1.y((imageView.getHeight() - qVar.f16313y) - i10, qVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    qVar.r(false);
                }
                return true;
            case 1:
                eg0 eg0Var = (eg0) this.f16235b;
                eg0Var.J = w7.p.a(scaleGestureDetector.getScaleFactor() * eg0Var.J, 0.75f, eg0Var.f25676a);
                eg0Var.H = (int) (eg0Var.t() * eg0Var.J);
                eg0Var.I = (int) (eg0Var.r() * eg0Var.J);
                AndroidUtilities.runOnUIThread(new cc0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - eg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = eg0Var.M;
                if (!kVar.f16818f) {
                    kVar.f16815b = eg0Var.K;
                    kVar.f16816c = true;
                    kVar.f16825u.f16832i = dp;
                } else {
                    kVar.f16825u.f16832i = dp;
                }
                kVar.f();
                float a2 = w7.p.a(scaleGestureDetector.getFocusY() - (eg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - eg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = eg0Var.N;
                if (!kVar2.f16818f) {
                    kVar2.f16815b = eg0Var.L;
                    kVar2.f16816c = true;
                    kVar2.f16825u.f16832i = a2;
                } else {
                    kVar2.f16825u.f16832i = a2;
                }
                kVar2.f();
                return true;
            default:
                h1 h1Var = (h1) this.f16235b;
                h1Var.P = w7.p.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.f31517a);
                h1Var.M = (int) (h1Var.m() * h1Var.P);
                h1Var.N = (int) (h1Var.l() * h1Var.P);
                AndroidUtilities.runOnUIThread(new t0(this, 23));
                o1.k kVar3 = h1Var.S;
                kVar3.f16815b = h1Var.Q;
                kVar3.f16816c = true;
                o1.l lVar = kVar3.f16825u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - h1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f16832i = dp2;
                o1.k kVar4 = h1Var.S;
                if (!kVar4.f16818f) {
                    kVar4.f();
                }
                o1.k kVar5 = h1Var.T;
                kVar5.f16815b = h1Var.R;
                kVar5.f16816c = true;
                kVar5.f16825u.f16832i = w7.p.a(scaleGestureDetector.getFocusY() - (h1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.T;
                if (!kVar6.f16818f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16234a) {
            case 0:
                return true;
            case 1:
                eg0 eg0Var = (eg0) this.f16235b;
                if (eg0Var.f25696w) {
                    eg0Var.f25696w = false;
                    eg0Var.f25686f0 = false;
                    eg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(eg0Var.f25688h0);
                }
                eg0Var.f25697x = true;
                eg0Var.f25680c.width = (int) (eg0Var.t() * eg0Var.f25676a);
                eg0Var.f25680c.height = (int) (eg0Var.r() * eg0Var.f25676a);
                AndroidUtilities.updateViewLayout(eg0Var.f25678b, eg0Var.d, eg0Var.f25680c);
                return true;
            default:
                h1 h1Var = (h1) this.f16235b;
                if (h1Var.H) {
                    h1Var.H = false;
                }
                h1Var.I = true;
                h1Var.f31520c.width = (int) (h1Var.m() * h1Var.f31517a);
                h1Var.f31520c.height = (int) (h1Var.l() * h1Var.f31517a);
                AndroidUtilities.updateViewLayout(h1Var.f31519b, h1Var.d, h1Var.f31520c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16234a) {
            case 0:
                return;
            case 1:
                eg0 eg0Var = (eg0) this.f16235b;
                if (!eg0Var.M.f16818f && !eg0Var.N.f16818f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                v1 v1Var = new v1(this, arrayList, 1);
                o1.k kVar = eg0Var.M;
                if (!kVar.f16818f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(v1Var);
                }
                o1.k kVar2 = eg0Var.N;
                if (!kVar2.f16818f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(v1Var);
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16235b;
                if (!h1Var.S.f16818f && !h1Var.T.f16818f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                v1 v1Var2 = new v1(this, arrayList2, 2);
                o1.k kVar3 = h1Var.S;
                if (!kVar3.f16818f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(v1Var2);
                }
                o1.k kVar4 = h1Var.T;
                if (!kVar4.f16818f) {
                    arrayList2.add(kVar4);
                    return;
                } else {
                    kVar4.a(v1Var2);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
