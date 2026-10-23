package mg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import ci.i1;
import java.util.ArrayList;
import ki.u;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.v0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.yb0;
import w7.r;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f16920a;
    public final Object f16921b;

    public b(Object obj, int i10) {
        this.f16920a = i10;
        this.f16921b = obj;
    }

    public void b() {
        switch (this.f16920a) {
            case 1:
                dh0 dh0Var = (dh0) this.f16921b;
                WindowManager.LayoutParams layoutParams = dh0Var.f25636c;
                int t10 = (int) (dh0Var.t() * dh0Var.J);
                layoutParams.width = t10;
                dh0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = dh0Var.f25636c;
                int r10 = (int) (dh0Var.r() * dh0Var.J);
                layoutParams2.height = r10;
                dh0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(dh0Var.f25634b, dh0Var.d, dh0Var.f25636c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16921b;
                WindowManager.LayoutParams layoutParams3 = h1Var.f31630c;
                int m10 = (int) (h1Var.m() * h1Var.P);
                layoutParams3.width = m10;
                h1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.f31630c;
                int l4 = (int) (h1Var.l() * h1Var.P);
                layoutParams4.height = l4;
                h1Var.N = l4;
                AndroidUtilities.updateViewLayout(h1Var.f31629b, h1Var.d, h1Var.f31630c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f16920a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f16921b).f16923b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f16980a;
                ImageView imageView = pVar.f16981b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f16985r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (v0.y((imageView.getHeight() - pVar.f16989y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                dh0 dh0Var = (dh0) this.f16921b;
                dh0Var.J = r.a(scaleGestureDetector.getScaleFactor() * dh0Var.J, 0.75f, dh0Var.f25632a);
                dh0Var.H = (int) (dh0Var.t() * dh0Var.J);
                dh0Var.I = (int) (dh0Var.r() * dh0Var.J);
                AndroidUtilities.runOnUIThread(new yb0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - dh0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = dh0Var.M;
                if (!kVar.f17615f) {
                    kVar.f17613b = dh0Var.K;
                    kVar.f17614c = true;
                    kVar.f17622u.f17628i = dp;
                } else {
                    kVar.f17622u.f17628i = dp;
                }
                kVar.h();
                float a2 = r.a(scaleGestureDetector.getFocusY() - (dh0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = dh0Var.N;
                if (!kVar2.f17615f) {
                    kVar2.f17613b = dh0Var.L;
                    kVar2.f17614c = true;
                    kVar2.f17622u.f17628i = a2;
                } else {
                    kVar2.f17622u.f17628i = a2;
                }
                kVar2.h();
                return true;
            default:
                h1 h1Var = (h1) this.f16921b;
                h1Var.P = r.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.f31627a);
                h1Var.M = (int) (h1Var.m() * h1Var.P);
                h1Var.N = (int) (h1Var.l() * h1Var.P);
                AndroidUtilities.runOnUIThread(new u(this, 15));
                o1.k kVar3 = h1Var.S;
                kVar3.f17613b = h1Var.Q;
                kVar3.f17614c = true;
                o1.l lVar = kVar3.f17622u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - h1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f17628i = dp2;
                o1.k kVar4 = h1Var.S;
                if (!kVar4.f17615f) {
                    kVar4.h();
                }
                o1.k kVar5 = h1Var.T;
                kVar5.f17613b = h1Var.R;
                kVar5.f17614c = true;
                kVar5.f17622u.f17628i = r.a(scaleGestureDetector.getFocusY() - (h1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.T;
                if (!kVar6.f17615f) {
                    kVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16920a) {
            case 0:
                return true;
            case 1:
                dh0 dh0Var = (dh0) this.f16921b;
                if (dh0Var.f25651w) {
                    dh0Var.f25651w = false;
                    dh0Var.f25641f0 = false;
                    dh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(dh0Var.f25643h0);
                }
                dh0Var.f25652x = true;
                dh0Var.f25636c.width = (int) (dh0Var.t() * dh0Var.f25632a);
                dh0Var.f25636c.height = (int) (dh0Var.r() * dh0Var.f25632a);
                AndroidUtilities.updateViewLayout(dh0Var.f25634b, dh0Var.d, dh0Var.f25636c);
                return true;
            default:
                h1 h1Var = (h1) this.f16921b;
                if (h1Var.H) {
                    h1Var.H = false;
                }
                h1Var.I = true;
                h1Var.f31630c.width = (int) (h1Var.m() * h1Var.f31627a);
                h1Var.f31630c.height = (int) (h1Var.l() * h1Var.f31627a);
                AndroidUtilities.updateViewLayout(h1Var.f31629b, h1Var.d, h1Var.f31630c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16920a) {
            case 0:
                return;
            case 1:
                dh0 dh0Var = (dh0) this.f16921b;
                if (!dh0Var.M.f17615f && !dh0Var.N.f17615f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                i1 i1Var = new i1(this, arrayList, 1);
                o1.k kVar = dh0Var.M;
                if (!kVar.f17615f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(i1Var);
                }
                o1.k kVar2 = dh0Var.N;
                if (!kVar2.f17615f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(i1Var);
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16921b;
                if (!h1Var.S.f17615f && !h1Var.T.f17615f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                i1 i1Var2 = new i1(this, arrayList2, 2);
                o1.k kVar3 = h1Var.S;
                if (!kVar3.f17615f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(i1Var2);
                }
                o1.k kVar4 = h1Var.T;
                if (!kVar4.f17615f) {
                    arrayList2.add(kVar4);
                    return;
                } else {
                    kVar4.a(i1Var2);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
