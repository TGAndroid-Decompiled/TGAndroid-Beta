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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.voip.h1;
import w7.r;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f16857a;
    public final Object f16858b;

    public b(Object obj, int i10) {
        this.f16857a = i10;
        this.f16858b = obj;
    }

    public void b() {
        switch (this.f16857a) {
            case 1:
                ah0 ah0Var = (ah0) this.f16858b;
                WindowManager.LayoutParams layoutParams = ah0Var.f24606c;
                int t10 = (int) (ah0Var.t() * ah0Var.J);
                layoutParams.width = t10;
                ah0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = ah0Var.f24606c;
                int r10 = (int) (ah0Var.r() * ah0Var.J);
                layoutParams2.height = r10;
                ah0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(ah0Var.f24604b, ah0Var.d, ah0Var.f24606c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16858b;
                WindowManager.LayoutParams layoutParams3 = h1Var.f31448c;
                int m10 = (int) (h1Var.m() * h1Var.P);
                layoutParams3.width = m10;
                h1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.f31448c;
                int l4 = (int) (h1Var.l() * h1Var.P);
                layoutParams4.height = l4;
                h1Var.N = l4;
                AndroidUtilities.updateViewLayout(h1Var.f31447b, h1Var.d, h1Var.f31448c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f16857a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f16858b).f16860b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f16917a;
                ImageView imageView = pVar.f16918b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f16922r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (g0.x((imageView.getHeight() - pVar.f16926y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                ah0 ah0Var = (ah0) this.f16858b;
                ah0Var.J = r.a(scaleGestureDetector.getScaleFactor() * ah0Var.J, 0.75f, ah0Var.f24602a);
                ah0Var.H = (int) (ah0Var.t() * ah0Var.J);
                ah0Var.I = (int) (ah0Var.r() * ah0Var.J);
                AndroidUtilities.runOnUIThread(new rc0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - ah0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = ah0Var.M;
                if (!kVar.f17552f) {
                    kVar.f17550b = ah0Var.K;
                    kVar.f17551c = true;
                    kVar.f17559u.f17565i = dp;
                } else {
                    kVar.f17559u.f17565i = dp;
                }
                kVar.h();
                float a2 = r.a(scaleGestureDetector.getFocusY() - (ah0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ah0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = ah0Var.N;
                if (!kVar2.f17552f) {
                    kVar2.f17550b = ah0Var.L;
                    kVar2.f17551c = true;
                    kVar2.f17559u.f17565i = a2;
                } else {
                    kVar2.f17559u.f17565i = a2;
                }
                kVar2.h();
                return true;
            default:
                h1 h1Var = (h1) this.f16858b;
                h1Var.P = r.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.f31445a);
                h1Var.M = (int) (h1Var.m() * h1Var.P);
                h1Var.N = (int) (h1Var.l() * h1Var.P);
                AndroidUtilities.runOnUIThread(new u(this, 15));
                o1.k kVar3 = h1Var.S;
                kVar3.f17550b = h1Var.Q;
                kVar3.f17551c = true;
                o1.l lVar = kVar3.f17559u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - h1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f17565i = dp2;
                o1.k kVar4 = h1Var.S;
                if (!kVar4.f17552f) {
                    kVar4.h();
                }
                o1.k kVar5 = h1Var.T;
                kVar5.f17550b = h1Var.R;
                kVar5.f17551c = true;
                kVar5.f17559u.f17565i = r.a(scaleGestureDetector.getFocusY() - (h1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.T;
                if (!kVar6.f17552f) {
                    kVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16857a) {
            case 0:
                return true;
            case 1:
                ah0 ah0Var = (ah0) this.f16858b;
                if (ah0Var.f24621w) {
                    ah0Var.f24621w = false;
                    ah0Var.f24611f0 = false;
                    ah0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ah0Var.f24613h0);
                }
                ah0Var.f24622x = true;
                ah0Var.f24606c.width = (int) (ah0Var.t() * ah0Var.f24602a);
                ah0Var.f24606c.height = (int) (ah0Var.r() * ah0Var.f24602a);
                AndroidUtilities.updateViewLayout(ah0Var.f24604b, ah0Var.d, ah0Var.f24606c);
                return true;
            default:
                h1 h1Var = (h1) this.f16858b;
                if (h1Var.H) {
                    h1Var.H = false;
                }
                h1Var.I = true;
                h1Var.f31448c.width = (int) (h1Var.m() * h1Var.f31445a);
                h1Var.f31448c.height = (int) (h1Var.l() * h1Var.f31445a);
                AndroidUtilities.updateViewLayout(h1Var.f31447b, h1Var.d, h1Var.f31448c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16857a) {
            case 0:
                return;
            case 1:
                ah0 ah0Var = (ah0) this.f16858b;
                if (!ah0Var.M.f17552f && !ah0Var.N.f17552f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                j1 j1Var = new j1(this, arrayList, 1);
                o1.k kVar = ah0Var.M;
                if (!kVar.f17552f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(j1Var);
                }
                o1.k kVar2 = ah0Var.N;
                if (!kVar2.f17552f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(j1Var);
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16858b;
                if (!h1Var.S.f17552f && !h1Var.T.f17552f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                j1 j1Var2 = new j1(this, arrayList2, 2);
                o1.k kVar3 = h1Var.S;
                if (!kVar3.f17552f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(j1Var2);
                }
                o1.k kVar4 = h1Var.T;
                if (!kVar4.f17552f) {
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
