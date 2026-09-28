package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.f0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.voip.k1;
import w7.q;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14264a;
    public final Object f14265b;

    public b(Object obj, int i10) {
        this.f14264a = i10;
        this.f14265b = obj;
    }

    public void b() {
        switch (this.f14264a) {
            case 1:
                qg0 qg0Var = (qg0) this.f14265b;
                WindowManager.LayoutParams layoutParams = qg0Var.f27696c;
                int t10 = (int) (qg0Var.t() * qg0Var.J);
                layoutParams.width = t10;
                qg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = qg0Var.f27696c;
                int r10 = (int) (qg0Var.r() * qg0Var.J);
                layoutParams2.height = r10;
                qg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(qg0Var.f27694b, qg0Var.d, qg0Var.f27696c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                k1 k1Var = (k1) this.f14265b;
                WindowManager.LayoutParams layoutParams3 = k1Var.f29346c;
                int m10 = (int) (k1Var.m() * k1Var.P);
                layoutParams3.width = m10;
                k1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = k1Var.f29346c;
                int l4 = (int) (k1Var.l() * k1Var.P);
                layoutParams4.height = l4;
                k1Var.N = l4;
                AndroidUtilities.updateViewLayout(k1Var.f29345b, k1Var.d, k1Var.f29346c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14264a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14265b).f14267b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14324a;
                ImageView imageView = pVar.f14325b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14329r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (f0.x((imageView.getHeight() - pVar.f14333y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                qg0 qg0Var = (qg0) this.f14265b;
                qg0Var.J = q.a(scaleGestureDetector.getScaleFactor() * qg0Var.J, 0.75f, qg0Var.f27692a);
                qg0Var.H = (int) (qg0Var.t() * qg0Var.J);
                qg0Var.I = (int) (qg0Var.r() * qg0Var.J);
                AndroidUtilities.runOnUIThread(new kc0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - qg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = qg0Var.M;
                if (!kVar.f15527f) {
                    kVar.f15525b = qg0Var.K;
                    kVar.f15526c = true;
                    kVar.f15534u.f15540i = dp;
                } else {
                    kVar.f15534u.f15540i = dp;
                }
                kVar.f();
                float a2 = q.a(scaleGestureDetector.getFocusY() - (qg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - qg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = qg0Var.N;
                if (!kVar2.f15527f) {
                    kVar2.f15525b = qg0Var.L;
                    kVar2.f15526c = true;
                    kVar2.f15534u.f15540i = a2;
                } else {
                    kVar2.f15534u.f15540i = a2;
                }
                kVar2.f();
                return true;
            default:
                k1 k1Var = (k1) this.f14265b;
                k1Var.P = q.a(scaleGestureDetector.getScaleFactor() * k1Var.P, 0.6f, k1Var.f29343a);
                k1Var.M = (int) (k1Var.m() * k1Var.P);
                k1Var.N = (int) (k1Var.l() * k1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 21));
                o1.k kVar3 = k1Var.S;
                kVar3.f15525b = k1Var.Q;
                kVar3.f15526c = true;
                o1.l lVar = kVar3.f15534u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - k1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15540i = dp2;
                o1.k kVar4 = k1Var.S;
                if (!kVar4.f15527f) {
                    kVar4.f();
                }
                o1.k kVar5 = k1Var.T;
                kVar5.f15525b = k1Var.R;
                kVar5.f15526c = true;
                kVar5.f15534u.f15540i = q.a(scaleGestureDetector.getFocusY() - (k1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = k1Var.T;
                if (!kVar6.f15527f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14264a) {
            case 0:
                return true;
            case 1:
                qg0 qg0Var = (qg0) this.f14265b;
                if (qg0Var.f27711w) {
                    qg0Var.f27711w = false;
                    qg0Var.f27701f0 = false;
                    qg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(qg0Var.f27703h0);
                }
                qg0Var.f27712x = true;
                qg0Var.f27696c.width = (int) (qg0Var.t() * qg0Var.f27692a);
                qg0Var.f27696c.height = (int) (qg0Var.r() * qg0Var.f27692a);
                AndroidUtilities.updateViewLayout(qg0Var.f27694b, qg0Var.d, qg0Var.f27696c);
                return true;
            default:
                k1 k1Var = (k1) this.f14265b;
                if (k1Var.H) {
                    k1Var.H = false;
                }
                k1Var.I = true;
                k1Var.f29346c.width = (int) (k1Var.m() * k1Var.f29343a);
                k1Var.f29346c.height = (int) (k1Var.l() * k1Var.f29343a);
                AndroidUtilities.updateViewLayout(k1Var.f29345b, k1Var.d, k1Var.f29346c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14264a) {
            case 0:
                return;
            case 1:
                qg0 qg0Var = (qg0) this.f14265b;
                if (!qg0Var.M.f15527f && !qg0Var.N.f15527f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = qg0Var.M;
                if (!kVar.f15527f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = qg0Var.N;
                if (!kVar2.f15527f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                k1 k1Var = (k1) this.f14265b;
                if (!k1Var.S.f15527f && !k1Var.T.f15527f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = k1Var.S;
                if (!kVar3.f15527f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = k1Var.T;
                if (!kVar4.f15527f) {
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
