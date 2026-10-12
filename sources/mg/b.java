package mg;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import bi.v1;
import ig.t0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.q;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.yc0;
import w7.s;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f15764a;
    public final Object f15765b;

    public b(Object obj, int i10) {
        this.f15764a = i10;
        this.f15765b = obj;
    }

    public void b() {
        switch (this.f15764a) {
            case 1:
                fh0 fh0Var = (fh0) this.f15765b;
                WindowManager.LayoutParams layoutParams = fh0Var.f25040c;
                int t10 = (int) (fh0Var.t() * fh0Var.J);
                layoutParams.width = t10;
                fh0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = fh0Var.f25040c;
                int r10 = (int) (fh0Var.r() * fh0Var.J);
                layoutParams2.height = r10;
                fh0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(fh0Var.f25038b, fh0Var.d, fh0Var.f25040c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                h1 h1Var = (h1) this.f15765b;
                WindowManager.LayoutParams layoutParams3 = h1Var.f30213c;
                int m10 = (int) (h1Var.m() * h1Var.P);
                layoutParams3.width = m10;
                h1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.f30213c;
                int l4 = (int) (h1Var.l() * h1Var.P);
                layoutParams4.height = l4;
                h1Var.N = l4;
                AndroidUtilities.updateViewLayout(h1Var.f30212b, h1Var.d, h1Var.f30213c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f15764a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f15765b).f15767b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f15824a;
                ImageView imageView = pVar.f15825b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f15829r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (q.y((imageView.getHeight() - pVar.f15833y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                fh0 fh0Var = (fh0) this.f15765b;
                fh0Var.J = s.a(scaleGestureDetector.getScaleFactor() * fh0Var.J, 0.75f, fh0Var.f25036a);
                fh0Var.H = (int) (fh0Var.t() * fh0Var.J);
                fh0Var.I = (int) (fh0Var.r() * fh0Var.J);
                AndroidUtilities.runOnUIThread(new yc0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - fh0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = fh0Var.M;
                if (!kVar.f16461f) {
                    kVar.f16459b = fh0Var.K;
                    kVar.f16460c = true;
                    kVar.f16468u.f16474i = dp;
                } else {
                    kVar.f16468u.f16474i = dp;
                }
                kVar.h();
                float a2 = s.a(scaleGestureDetector.getFocusY() - (fh0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fh0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = fh0Var.N;
                if (!kVar2.f16461f) {
                    kVar2.f16459b = fh0Var.L;
                    kVar2.f16460c = true;
                    kVar2.f16468u.f16474i = a2;
                } else {
                    kVar2.f16468u.f16474i = a2;
                }
                kVar2.h();
                return true;
            default:
                h1 h1Var = (h1) this.f15765b;
                h1Var.P = s.a(scaleGestureDetector.getScaleFactor() * h1Var.P, 0.6f, h1Var.f30210a);
                h1Var.M = (int) (h1Var.m() * h1Var.P);
                h1Var.N = (int) (h1Var.l() * h1Var.P);
                AndroidUtilities.runOnUIThread(new t0(this, 26));
                o1.k kVar3 = h1Var.S;
                kVar3.f16459b = h1Var.Q;
                kVar3.f16460c = true;
                o1.l lVar = kVar3.f16468u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - h1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f16474i = dp2;
                o1.k kVar4 = h1Var.S;
                if (!kVar4.f16461f) {
                    kVar4.h();
                }
                o1.k kVar5 = h1Var.T;
                kVar5.f16459b = h1Var.R;
                kVar5.f16460c = true;
                kVar5.f16468u.f16474i = s.a(scaleGestureDetector.getFocusY() - (h1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.T;
                if (!kVar6.f16461f) {
                    kVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15764a) {
            case 0:
                return true;
            case 1:
                fh0 fh0Var = (fh0) this.f15765b;
                if (fh0Var.f25055w) {
                    fh0Var.f25055w = false;
                    fh0Var.f25045f0 = false;
                    fh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fh0Var.f25047h0);
                }
                fh0Var.f25056x = true;
                fh0Var.f25040c.width = (int) (fh0Var.t() * fh0Var.f25036a);
                fh0Var.f25040c.height = (int) (fh0Var.r() * fh0Var.f25036a);
                AndroidUtilities.updateViewLayout(fh0Var.f25038b, fh0Var.d, fh0Var.f25040c);
                return true;
            default:
                h1 h1Var = (h1) this.f15765b;
                if (h1Var.H) {
                    h1Var.H = false;
                }
                h1Var.I = true;
                h1Var.f30213c.width = (int) (h1Var.m() * h1Var.f30210a);
                h1Var.f30213c.height = (int) (h1Var.l() * h1Var.f30210a);
                AndroidUtilities.updateViewLayout(h1Var.f30212b, h1Var.d, h1Var.f30213c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15764a) {
            case 0:
                return;
            case 1:
                fh0 fh0Var = (fh0) this.f15765b;
                if (!fh0Var.M.f16461f && !fh0Var.N.f16461f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                v1 v1Var = new v1(this, arrayList, 1);
                o1.k kVar = fh0Var.M;
                if (!kVar.f16461f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(v1Var);
                }
                o1.k kVar2 = fh0Var.N;
                if (!kVar2.f16461f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(v1Var);
                    return;
                }
            default:
                h1 h1Var = (h1) this.f15765b;
                if (!h1Var.S.f16461f && !h1Var.T.f16461f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                v1 v1Var2 = new v1(this, arrayList2, 2);
                o1.k kVar3 = h1Var.S;
                if (!kVar3.f16461f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(v1Var2);
                }
                o1.k kVar4 = h1Var.T;
                if (!kVar4.f16461f) {
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
