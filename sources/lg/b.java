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
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.voip.k1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f15509a;
    public final Object f15510b;

    public b(Object obj, int i10) {
        this.f15509a = i10;
        this.f15510b = obj;
    }

    public void b() {
        switch (this.f15509a) {
            case 1:
                rg0 rg0Var = (rg0) this.f15510b;
                WindowManager.LayoutParams layoutParams = rg0Var.f30471c;
                int t10 = (int) (rg0Var.t() * rg0Var.J);
                layoutParams.width = t10;
                rg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = rg0Var.f30471c;
                int r10 = (int) (rg0Var.r() * rg0Var.J);
                layoutParams2.height = r10;
                rg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.f30469b, rg0Var.d, rg0Var.f30471c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                k1 k1Var = (k1) this.f15510b;
                WindowManager.LayoutParams layoutParams3 = k1Var.f32008c;
                int m10 = (int) (k1Var.m() * k1Var.P);
                layoutParams3.width = m10;
                k1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = k1Var.f32008c;
                int l4 = (int) (k1Var.l() * k1Var.P);
                layoutParams4.height = l4;
                k1Var.N = l4;
                AndroidUtilities.updateViewLayout(k1Var.f32007b, k1Var.d, k1Var.f32008c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f15509a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f15510b).f15512b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f15576a;
                ImageView imageView = pVar.f15577b;
                if (!pVar.F) {
                    float f7 = pVar.L.f15569e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f15582r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (q.x((imageView.getHeight() - pVar.f15586y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                rg0 rg0Var = (rg0) this.f15510b;
                rg0Var.J = w7.q.a(scaleGestureDetector.getScaleFactor() * rg0Var.J, 0.75f, rg0Var.f30467a);
                rg0Var.H = (int) (rg0Var.t() * rg0Var.J);
                rg0Var.I = (int) (rg0Var.r() * rg0Var.J);
                AndroidUtilities.runOnUIThread(new lc0(this, 13));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - rg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = rg0Var.M;
                if (!kVar.f16986f) {
                    kVar.f16983b = rg0Var.K;
                    kVar.f16984c = true;
                    kVar.f16993u.f17000i = dp;
                } else {
                    kVar.f16993u.f17000i = dp;
                }
                kVar.f();
                float a2 = w7.q.a(scaleGestureDetector.getFocusY() - (rg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = rg0Var.N;
                if (!kVar2.f16986f) {
                    kVar2.f16983b = rg0Var.L;
                    kVar2.f16984c = true;
                    kVar2.f16993u.f17000i = a2;
                } else {
                    kVar2.f16993u.f17000i = a2;
                }
                kVar2.f();
                return true;
            default:
                k1 k1Var = (k1) this.f15510b;
                k1Var.P = w7.q.a(scaleGestureDetector.getScaleFactor() * k1Var.P, 0.6f, k1Var.f32005a);
                k1Var.M = (int) (k1Var.m() * k1Var.P);
                k1Var.N = (int) (k1Var.l() * k1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 20));
                o1.k kVar3 = k1Var.S;
                kVar3.f16983b = k1Var.Q;
                kVar3.f16984c = true;
                o1.l lVar = kVar3.f16993u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - k1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f17000i = dp2;
                o1.k kVar4 = k1Var.S;
                if (!kVar4.f16986f) {
                    kVar4.f();
                }
                o1.k kVar5 = k1Var.T;
                kVar5.f16983b = k1Var.R;
                kVar5.f16984c = true;
                kVar5.f16993u.f17000i = w7.q.a(scaleGestureDetector.getFocusY() - (k1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = k1Var.T;
                if (!kVar6.f16986f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15509a) {
            case 0:
                return true;
            case 1:
                rg0 rg0Var = (rg0) this.f15510b;
                if (rg0Var.f30487w) {
                    rg0Var.f30487w = false;
                    rg0Var.f30477f0 = false;
                    rg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(rg0Var.f30479h0);
                }
                rg0Var.f30488x = true;
                rg0Var.f30471c.width = (int) (rg0Var.t() * rg0Var.f30467a);
                rg0Var.f30471c.height = (int) (rg0Var.r() * rg0Var.f30467a);
                AndroidUtilities.updateViewLayout(rg0Var.f30469b, rg0Var.d, rg0Var.f30471c);
                return true;
            default:
                k1 k1Var = (k1) this.f15510b;
                if (k1Var.H) {
                    k1Var.H = false;
                }
                k1Var.I = true;
                k1Var.f32008c.width = (int) (k1Var.m() * k1Var.f32005a);
                k1Var.f32008c.height = (int) (k1Var.l() * k1Var.f32005a);
                AndroidUtilities.updateViewLayout(k1Var.f32007b, k1Var.d, k1Var.f32008c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f15509a) {
            case 0:
                return;
            case 1:
                rg0 rg0Var = (rg0) this.f15510b;
                if (!rg0Var.M.f16986f && !rg0Var.N.f16986f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = rg0Var.M;
                if (!kVar.f16986f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = rg0Var.N;
                if (!kVar2.f16986f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                k1 k1Var = (k1) this.f15510b;
                if (!k1Var.S.f16986f && !k1Var.T.f16986f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = k1Var.S;
                if (!kVar3.f16986f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = k1Var.T;
                if (!kVar4.f16986f) {
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
