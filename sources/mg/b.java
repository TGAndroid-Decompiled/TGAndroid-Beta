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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.wb0;
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
                ch0 ch0Var = (ch0) this.f16921b;
                WindowManager.LayoutParams layoutParams = ch0Var.f25318c;
                int t10 = (int) (ch0Var.t() * ch0Var.J);
                layoutParams.width = t10;
                ch0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = ch0Var.f25318c;
                int r10 = (int) (ch0Var.r() * ch0Var.J);
                layoutParams2.height = r10;
                ch0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(ch0Var.f25316b, ch0Var.d, ch0Var.f25318c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                h1 h1Var = (h1) this.f16921b;
                WindowManager.LayoutParams layoutParams3 = h1Var.f31600c;
                int m10 = (int) (h1Var.m() * h1Var.P);
                layoutParams3.width = m10;
                h1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.f31600c;
                int l4 = (int) (h1Var.l() * h1Var.P);
                layoutParams4.height = l4;
                h1Var.N = l4;
                AndroidUtilities.updateViewLayout(h1Var.f31599b, h1Var.d, h1Var.f31600c);
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
                ch0 ch0Var = (ch0) this.f16921b;
                ch0Var.J = r.a(scaleGestureDetector.getScaleFactor() * ch0Var.J, 0.75f, ch0Var.f25314a);
                ch0Var.H = (int) (ch0Var.t() * ch0Var.J);
                ch0Var.I = (int) (ch0Var.r() * ch0Var.J);
                AndroidUtilities.runOnUIThread(new wb0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - ch0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = ch0Var.M;
                if (!kVar.f17615f) {
                    kVar.f17613b = ch0Var.K;
                    kVar.f17614c = true;
                    kVar.f17622u.f17628i = dp;
                } else {
                    kVar.f17622u.f17628i = dp;
                }
                kVar.h();
                float a2 = r.a(scaleGestureDetector.getFocusY() - (ch0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ch0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = ch0Var.N;
                if (!kVar2.f17615f) {
                    kVar2.f17613b = ch0Var.L;
                    kVar2.f17614c = true;
                    kVar2.f17622u.f17628i = a2;
                } else {
                    kVar2.f17622u.f17628i = a2;
                }
                kVar2.h();
                return true;
            default:
                h1 h1Var = (h1) this.f16921b;
                h1Var.P = r.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.f31597a);
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
                ch0 ch0Var = (ch0) this.f16921b;
                if (ch0Var.f25333w) {
                    ch0Var.f25333w = false;
                    ch0Var.f25323f0 = false;
                    ch0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ch0Var.f25325h0);
                }
                ch0Var.f25334x = true;
                ch0Var.f25318c.width = (int) (ch0Var.t() * ch0Var.f25314a);
                ch0Var.f25318c.height = (int) (ch0Var.r() * ch0Var.f25314a);
                AndroidUtilities.updateViewLayout(ch0Var.f25316b, ch0Var.d, ch0Var.f25318c);
                return true;
            default:
                h1 h1Var = (h1) this.f16921b;
                if (h1Var.H) {
                    h1Var.H = false;
                }
                h1Var.I = true;
                h1Var.f31600c.width = (int) (h1Var.m() * h1Var.f31597a);
                h1Var.f31600c.height = (int) (h1Var.l() * h1Var.f31597a);
                AndroidUtilities.updateViewLayout(h1Var.f31599b, h1Var.d, h1Var.f31600c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f16920a) {
            case 0:
                return;
            case 1:
                ch0 ch0Var = (ch0) this.f16921b;
                if (!ch0Var.M.f17615f && !ch0Var.N.f17615f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                i1 i1Var = new i1(this, arrayList, 1);
                o1.k kVar = ch0Var.M;
                if (!kVar.f17615f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(i1Var);
                }
                o1.k kVar2 = ch0Var.N;
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
