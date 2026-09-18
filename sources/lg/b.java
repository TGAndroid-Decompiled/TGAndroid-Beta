package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.g0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.w1;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.voip.j1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14050a;
    public final Object f14051b;

    public b(Object obj, int i10) {
        this.f14050a = i10;
        this.f14051b = obj;
    }

    public void b() {
        switch (this.f14050a) {
            case 1:
                fg0 fg0Var = (fg0) this.f14051b;
                WindowManager.LayoutParams layoutParams = fg0Var.f23919c;
                int t10 = (int) (fg0Var.t() * fg0Var.J);
                layoutParams.width = t10;
                fg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = fg0Var.f23919c;
                int r10 = (int) (fg0Var.r() * fg0Var.J);
                layoutParams2.height = r10;
                fg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(fg0Var.f23917b, fg0Var.d, fg0Var.f23919c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14051b;
                WindowManager.LayoutParams layoutParams3 = j1Var.f28989c;
                int m10 = (int) (j1Var.m() * j1Var.P);
                layoutParams3.width = m10;
                j1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = j1Var.f28989c;
                int l4 = (int) (j1Var.l() * j1Var.P);
                layoutParams4.height = l4;
                j1Var.N = l4;
                AndroidUtilities.updateViewLayout(j1Var.f28988b, j1Var.d, j1Var.f28989c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14050a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14051b).f14053b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14110a;
                ImageView imageView = pVar.f14111b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14115r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (w1.y((imageView.getHeight() - pVar.f14119y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                fg0 fg0Var = (fg0) this.f14051b;
                fg0Var.J = w7.p.a(scaleGestureDetector.getScaleFactor() * fg0Var.J, 0.75f, fg0Var.f23915a);
                fg0Var.H = (int) (fg0Var.t() * fg0Var.J);
                fg0Var.I = (int) (fg0Var.r() * fg0Var.J);
                AndroidUtilities.runOnUIThread(new bc0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - fg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = fg0Var.M;
                if (!kVar.f15354f) {
                    kVar.f15352b = fg0Var.K;
                    kVar.f15353c = true;
                    kVar.f15361u.f15367i = dp;
                } else {
                    kVar.f15361u.f15367i = dp;
                }
                kVar.f();
                float a2 = w7.p.a(scaleGestureDetector.getFocusY() - (fg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = fg0Var.N;
                if (!kVar2.f15354f) {
                    kVar2.f15352b = fg0Var.L;
                    kVar2.f15353c = true;
                    kVar2.f15361u.f15367i = a2;
                } else {
                    kVar2.f15361u.f15367i = a2;
                }
                kVar2.f();
                return true;
            default:
                j1 j1Var = (j1) this.f14051b;
                j1Var.P = w7.p.a(scaleGestureDetector.getScaleFactor() * j1Var.P, 0.6f, j1Var.f28986a);
                j1Var.M = (int) (j1Var.m() * j1Var.P);
                j1Var.N = (int) (j1Var.l() * j1Var.P);
                AndroidUtilities.runOnUIThread(new g0(this, 20));
                o1.k kVar3 = j1Var.S;
                kVar3.f15352b = j1Var.Q;
                kVar3.f15353c = true;
                o1.l lVar = kVar3.f15361u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - j1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15367i = dp2;
                o1.k kVar4 = j1Var.S;
                if (!kVar4.f15354f) {
                    kVar4.f();
                }
                o1.k kVar5 = j1Var.T;
                kVar5.f15352b = j1Var.R;
                kVar5.f15353c = true;
                kVar5.f15361u.f15367i = w7.p.a(scaleGestureDetector.getFocusY() - (j1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = j1Var.T;
                if (!kVar6.f15354f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14050a) {
            case 0:
                return true;
            case 1:
                fg0 fg0Var = (fg0) this.f14051b;
                if (fg0Var.f23934w) {
                    fg0Var.f23934w = false;
                    fg0Var.f23924f0 = false;
                    fg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fg0Var.f23926h0);
                }
                fg0Var.f23935x = true;
                fg0Var.f23919c.width = (int) (fg0Var.t() * fg0Var.f23915a);
                fg0Var.f23919c.height = (int) (fg0Var.r() * fg0Var.f23915a);
                AndroidUtilities.updateViewLayout(fg0Var.f23917b, fg0Var.d, fg0Var.f23919c);
                return true;
            default:
                j1 j1Var = (j1) this.f14051b;
                if (j1Var.H) {
                    j1Var.H = false;
                }
                j1Var.I = true;
                j1Var.f28989c.width = (int) (j1Var.m() * j1Var.f28986a);
                j1Var.f28989c.height = (int) (j1Var.l() * j1Var.f28986a);
                AndroidUtilities.updateViewLayout(j1Var.f28988b, j1Var.d, j1Var.f28989c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14050a) {
            case 0:
                return;
            case 1:
                fg0 fg0Var = (fg0) this.f14051b;
                if (!fg0Var.M.f15354f && !fg0Var.N.f15354f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = fg0Var.M;
                if (!kVar.f15354f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = fg0Var.N;
                if (!kVar2.f15354f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14051b;
                if (!j1Var.S.f15354f && !j1Var.T.f15354f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = j1Var.S;
                if (!kVar3.f15354f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = j1Var.T;
                if (!kVar4.f15354f) {
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
