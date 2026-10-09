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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.voip.j1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f15505a;
    public final Object f15506b;

    public b(Object obj, int i10) {
        this.f15505a = i10;
        this.f15506b = obj;
    }

    public void b() {
        switch (this.f15505a) {
            case 1:
                gh0 gh0Var = (gh0) this.f15506b;
                WindowManager.LayoutParams layoutParams = gh0Var.f26705c;
                int t10 = (int) (gh0Var.t() * gh0Var.J);
                layoutParams.width = t10;
                gh0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = gh0Var.f26705c;
                int r10 = (int) (gh0Var.r() * gh0Var.J);
                layoutParams2.height = r10;
                gh0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(gh0Var.f26703b, gh0Var.d, gh0Var.f26705c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                j1 j1Var = (j1) this.f15506b;
                WindowManager.LayoutParams layoutParams3 = j1Var.f32001c;
                int m10 = (int) (j1Var.m() * j1Var.P);
                layoutParams3.width = m10;
                j1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = j1Var.f32001c;
                int l4 = (int) (j1Var.l() * j1Var.P);
                layoutParams4.height = l4;
                j1Var.N = l4;
                AndroidUtilities.updateViewLayout(j1Var.f32000b, j1Var.d, j1Var.f32001c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f15505a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f15506b).f15508b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f15572a;
                ImageView imageView = pVar.f15573b;
                if (!pVar.F) {
                    float f7 = pVar.L.f15565e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f15578r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (q.x((imageView.getHeight() - pVar.f15582y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                gh0 gh0Var = (gh0) this.f15506b;
                gh0Var.J = w7.o.a(scaleGestureDetector.getScaleFactor() * gh0Var.J, 0.75f, gh0Var.f26701a);
                gh0Var.H = (int) (gh0Var.t() * gh0Var.J);
                gh0Var.I = (int) (gh0Var.r() * gh0Var.J);
                AndroidUtilities.runOnUIThread(new bd0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - gh0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = gh0Var.M;
                if (!kVar.f16931f) {
                    kVar.f16928b = gh0Var.K;
                    kVar.f16929c = true;
                    kVar.f16938u.f16945i = dp;
                } else {
                    kVar.f16938u.f16945i = dp;
                }
                kVar.h();
                float a2 = w7.o.a(scaleGestureDetector.getFocusY() - (gh0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - gh0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = gh0Var.N;
                if (!kVar2.f16931f) {
                    kVar2.f16928b = gh0Var.L;
                    kVar2.f16929c = true;
                    kVar2.f16938u.f16945i = a2;
                } else {
                    kVar2.f16938u.f16945i = a2;
                }
                kVar2.h();
                return true;
            default:
                j1 j1Var = (j1) this.f15506b;
                j1Var.P = w7.o.a(scaleGestureDetector.getScaleFactor() * j1Var.P, 0.6f, j1Var.f31998a);
                j1Var.M = (int) (j1Var.m() * j1Var.P);
                j1Var.N = (int) (j1Var.l() * j1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 21));
                o1.k kVar3 = j1Var.S;
                kVar3.f16928b = j1Var.Q;
                kVar3.f16929c = true;
                o1.l lVar = kVar3.f16938u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - j1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f16945i = dp2;
                o1.k kVar4 = j1Var.S;
                if (!kVar4.f16931f) {
                    kVar4.h();
                }
                o1.k kVar5 = j1Var.T;
                kVar5.f16928b = j1Var.R;
                kVar5.f16929c = true;
                kVar5.f16938u.f16945i = w7.o.a(scaleGestureDetector.getFocusY() - (j1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = j1Var.T;
                if (!kVar6.f16931f) {
                    kVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15505a) {
            case 0:
                return true;
            case 1:
                gh0 gh0Var = (gh0) this.f15506b;
                if (gh0Var.f26721w) {
                    gh0Var.f26721w = false;
                    gh0Var.f26711f0 = false;
                    gh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(gh0Var.f26713h0);
                }
                gh0Var.f26722x = true;
                gh0Var.f26705c.width = (int) (gh0Var.t() * gh0Var.f26701a);
                gh0Var.f26705c.height = (int) (gh0Var.r() * gh0Var.f26701a);
                AndroidUtilities.updateViewLayout(gh0Var.f26703b, gh0Var.d, gh0Var.f26705c);
                return true;
            default:
                j1 j1Var = (j1) this.f15506b;
                if (j1Var.H) {
                    j1Var.H = false;
                }
                j1Var.I = true;
                j1Var.f32001c.width = (int) (j1Var.m() * j1Var.f31998a);
                j1Var.f32001c.height = (int) (j1Var.l() * j1Var.f31998a);
                AndroidUtilities.updateViewLayout(j1Var.f32000b, j1Var.d, j1Var.f32001c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15505a) {
            case 0:
                return;
            case 1:
                gh0 gh0Var = (gh0) this.f15506b;
                if (!gh0Var.M.f16931f && !gh0Var.N.f16931f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = gh0Var.M;
                if (!kVar.f16931f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = gh0Var.N;
                if (!kVar2.f16931f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                j1 j1Var = (j1) this.f15506b;
                if (!j1Var.S.f16931f && !j1Var.T.f16931f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = j1Var.S;
                if (!kVar3.f16931f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = j1Var.T;
                if (!kVar4.f16931f) {
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
