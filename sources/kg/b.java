package kg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.a2;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.x;
import w7.q;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f12435a;
    public final Object f12436b;

    public b(Object obj, int i10) {
        this.f12435a = i10;
        this.f12436b = obj;
    }

    public void b() {
        switch (this.f12435a) {
            case 1:
                og0 og0Var = (og0) this.f12436b;
                WindowManager.LayoutParams layoutParams = og0Var.f25786c;
                int t10 = (int) (og0Var.t() * og0Var.J);
                layoutParams.width = t10;
                og0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = og0Var.f25786c;
                int r10 = (int) (og0Var.r() * og0Var.J);
                layoutParams2.height = r10;
                og0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(og0Var.f25784b, og0Var.d, og0Var.f25786c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                i1 i1Var = (i1) this.f12436b;
                WindowManager.LayoutParams layoutParams3 = i1Var.f28173c;
                int m10 = (int) (i1Var.m() * i1Var.P);
                layoutParams3.width = m10;
                i1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = i1Var.f28173c;
                int l4 = (int) (i1Var.l() * i1Var.P);
                layoutParams4.height = l4;
                i1Var.N = l4;
                AndroidUtilities.updateViewLayout(i1Var.f28172b, i1Var.d, i1Var.f28173c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f12435a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f12436b).f12438b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f12495a;
                ImageView imageView = pVar.f12496b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f12500r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (a2.y((imageView.getHeight() - pVar.f12504y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                og0 og0Var = (og0) this.f12436b;
                og0Var.J = q.a(scaleGestureDetector.getScaleFactor() * og0Var.J, 0.75f, og0Var.f25782a);
                og0Var.H = (int) (og0Var.t() * og0Var.J);
                og0Var.I = (int) (og0Var.r() * og0Var.J);
                AndroidUtilities.runOnUIThread(new kc0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - og0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = og0Var.M;
                if (!kVar.f14127f) {
                    kVar.f14125b = og0Var.K;
                    kVar.f14126c = true;
                    kVar.f14134u.f14140i = dp;
                } else {
                    kVar.f14134u.f14140i = dp;
                }
                kVar.f();
                float a2 = q.a(scaleGestureDetector.getFocusY() - (og0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = og0Var.N;
                if (!kVar2.f14127f) {
                    kVar2.f14125b = og0Var.L;
                    kVar2.f14126c = true;
                    kVar2.f14134u.f14140i = a2;
                } else {
                    kVar2.f14134u.f14140i = a2;
                }
                kVar2.f();
                return true;
            default:
                i1 i1Var = (i1) this.f12436b;
                i1Var.P = q.a(scaleGestureDetector.getScaleFactor() * i1Var.P, 0.6f, i1Var.f28170a);
                i1Var.M = (int) (i1Var.m() * i1Var.P);
                i1Var.N = (int) (i1Var.l() * i1Var.P);
                AndroidUtilities.runOnUIThread(new x(this, 2));
                o1.k kVar3 = i1Var.S;
                kVar3.f14125b = i1Var.Q;
                kVar3.f14126c = true;
                o1.l lVar = kVar3.f14134u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - i1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f14140i = dp2;
                o1.k kVar4 = i1Var.S;
                if (!kVar4.f14127f) {
                    kVar4.f();
                }
                o1.k kVar5 = i1Var.T;
                kVar5.f14125b = i1Var.R;
                kVar5.f14126c = true;
                kVar5.f14134u.f14140i = q.a(scaleGestureDetector.getFocusY() - (i1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = i1Var.T;
                if (!kVar6.f14127f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f12435a) {
            case 0:
                return true;
            case 1:
                og0 og0Var = (og0) this.f12436b;
                if (og0Var.f25801w) {
                    og0Var.f25801w = false;
                    og0Var.f25791f0 = false;
                    og0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(og0Var.f25793h0);
                }
                og0Var.f25802x = true;
                og0Var.f25786c.width = (int) (og0Var.t() * og0Var.f25782a);
                og0Var.f25786c.height = (int) (og0Var.r() * og0Var.f25782a);
                AndroidUtilities.updateViewLayout(og0Var.f25784b, og0Var.d, og0Var.f25786c);
                return true;
            default:
                i1 i1Var = (i1) this.f12436b;
                if (i1Var.H) {
                    i1Var.H = false;
                }
                i1Var.I = true;
                i1Var.f28173c.width = (int) (i1Var.m() * i1Var.f28170a);
                i1Var.f28173c.height = (int) (i1Var.l() * i1Var.f28170a);
                AndroidUtilities.updateViewLayout(i1Var.f28172b, i1Var.d, i1Var.f28173c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f12435a) {
            case 0:
                return;
            case 1:
                og0 og0Var = (og0) this.f12436b;
                if (!og0Var.M.f14127f && !og0Var.N.f14127f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                lg0 lg0Var = new lg0(this, arrayList, 0);
                o1.k kVar = og0Var.M;
                if (!kVar.f14127f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(lg0Var);
                }
                o1.k kVar2 = og0Var.N;
                if (!kVar2.f14127f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(lg0Var);
                    return;
                }
            default:
                i1 i1Var = (i1) this.f12436b;
                if (!i1Var.S.f14127f && !i1Var.T.f14127f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                lg0 lg0Var2 = new lg0(this, arrayList2, 1);
                o1.k kVar3 = i1Var.S;
                if (!kVar3.f14127f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(lg0Var2);
                }
                o1.k kVar4 = i1Var.T;
                if (!kVar4.f14127f) {
                    arrayList2.add(kVar4);
                    return;
                } else {
                    kVar4.a(lg0Var2);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
