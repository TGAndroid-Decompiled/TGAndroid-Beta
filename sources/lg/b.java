package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.g0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.l0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.voip.j1;
import w7.q;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14232a;
    public final Object f14233b;

    public b(Object obj, int i10) {
        this.f14232a = i10;
        this.f14233b = obj;
    }

    public void b() {
        switch (this.f14232a) {
            case 1:
                og0 og0Var = (og0) this.f14233b;
                WindowManager.LayoutParams layoutParams = og0Var.f26917c;
                int t10 = (int) (og0Var.t() * og0Var.J);
                layoutParams.width = t10;
                og0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = og0Var.f26917c;
                int r10 = (int) (og0Var.r() * og0Var.J);
                layoutParams2.height = r10;
                og0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(og0Var.f26915b, og0Var.d, og0Var.f26917c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14233b;
                WindowManager.LayoutParams layoutParams3 = j1Var.f29412c;
                int m10 = (int) (j1Var.m() * j1Var.P);
                layoutParams3.width = m10;
                j1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = j1Var.f29412c;
                int l4 = (int) (j1Var.l() * j1Var.P);
                layoutParams4.height = l4;
                j1Var.N = l4;
                AndroidUtilities.updateViewLayout(j1Var.f29411b, j1Var.d, j1Var.f29412c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14232a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14233b).f14235b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14292a;
                ImageView imageView = pVar.f14293b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14297r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (l0.x((imageView.getHeight() - pVar.f14301y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                og0 og0Var = (og0) this.f14233b;
                og0Var.J = q.a(scaleGestureDetector.getScaleFactor() * og0Var.J, 0.75f, og0Var.f26913a);
                og0Var.H = (int) (og0Var.t() * og0Var.J);
                og0Var.I = (int) (og0Var.r() * og0Var.J);
                AndroidUtilities.runOnUIThread(new jc0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - og0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = og0Var.M;
                if (!kVar.f15515f) {
                    kVar.f15513b = og0Var.K;
                    kVar.f15514c = true;
                    kVar.f15522u.f15528i = dp;
                } else {
                    kVar.f15522u.f15528i = dp;
                }
                kVar.f();
                float a2 = q.a(scaleGestureDetector.getFocusY() - (og0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = og0Var.N;
                if (!kVar2.f15515f) {
                    kVar2.f15513b = og0Var.L;
                    kVar2.f15514c = true;
                    kVar2.f15522u.f15528i = a2;
                } else {
                    kVar2.f15522u.f15528i = a2;
                }
                kVar2.f();
                return true;
            default:
                j1 j1Var = (j1) this.f14233b;
                j1Var.P = q.a(scaleGestureDetector.getScaleFactor() * j1Var.P, 0.6f, j1Var.f29409a);
                j1Var.M = (int) (j1Var.m() * j1Var.P);
                j1Var.N = (int) (j1Var.l() * j1Var.P);
                AndroidUtilities.runOnUIThread(new g0(this, 21));
                o1.k kVar3 = j1Var.S;
                kVar3.f15513b = j1Var.Q;
                kVar3.f15514c = true;
                o1.l lVar = kVar3.f15522u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - j1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15528i = dp2;
                o1.k kVar4 = j1Var.S;
                if (!kVar4.f15515f) {
                    kVar4.f();
                }
                o1.k kVar5 = j1Var.T;
                kVar5.f15513b = j1Var.R;
                kVar5.f15514c = true;
                kVar5.f15522u.f15528i = q.a(scaleGestureDetector.getFocusY() - (j1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = j1Var.T;
                if (!kVar6.f15515f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14232a) {
            case 0:
                return true;
            case 1:
                og0 og0Var = (og0) this.f14233b;
                if (og0Var.f26932w) {
                    og0Var.f26932w = false;
                    og0Var.f26922f0 = false;
                    og0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(og0Var.f26924h0);
                }
                og0Var.f26933x = true;
                og0Var.f26917c.width = (int) (og0Var.t() * og0Var.f26913a);
                og0Var.f26917c.height = (int) (og0Var.r() * og0Var.f26913a);
                AndroidUtilities.updateViewLayout(og0Var.f26915b, og0Var.d, og0Var.f26917c);
                return true;
            default:
                j1 j1Var = (j1) this.f14233b;
                if (j1Var.H) {
                    j1Var.H = false;
                }
                j1Var.I = true;
                j1Var.f29412c.width = (int) (j1Var.m() * j1Var.f29409a);
                j1Var.f29412c.height = (int) (j1Var.l() * j1Var.f29409a);
                AndroidUtilities.updateViewLayout(j1Var.f29411b, j1Var.d, j1Var.f29412c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14232a) {
            case 0:
                return;
            case 1:
                og0 og0Var = (og0) this.f14233b;
                if (!og0Var.M.f15515f && !og0Var.N.f15515f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = og0Var.M;
                if (!kVar.f15515f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = og0Var.N;
                if (!kVar2.f15515f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14233b;
                if (!j1Var.S.f15515f && !j1Var.T.f15515f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = j1Var.S;
                if (!kVar3.f15515f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = j1Var.T;
                if (!kVar4.f15515f) {
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
