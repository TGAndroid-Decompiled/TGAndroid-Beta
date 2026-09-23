package lg;

import ai.g2;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import i2.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.z0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.voip.j1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f14028a;
    public final Object f14029b;

    public b(Object obj, int i10) {
        this.f14028a = i10;
        this.f14029b = obj;
    }

    public void b() {
        switch (this.f14028a) {
            case 1:
                eg0 eg0Var = (eg0) this.f14029b;
                WindowManager.LayoutParams layoutParams = eg0Var.f23666c;
                int t10 = (int) (eg0Var.t() * eg0Var.J);
                layoutParams.width = t10;
                eg0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = eg0Var.f23666c;
                int r10 = (int) (eg0Var.r() * eg0Var.J);
                layoutParams2.height = r10;
                eg0Var.I = r10;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var.f23664b, eg0Var.d, eg0Var.f23666c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14029b;
                WindowManager.LayoutParams layoutParams3 = j1Var.f28980c;
                int m10 = (int) (j1Var.m() * j1Var.P);
                layoutParams3.width = m10;
                j1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = j1Var.f28980c;
                int l4 = (int) (j1Var.l() * j1Var.P);
                layoutParams4.height = l4;
                j1Var.N = l4;
                AndroidUtilities.updateViewLayout(j1Var.f28979b, j1Var.d, j1Var.f28980c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f14028a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f14029b).f14031b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f14088a;
                ImageView imageView = pVar.f14089b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f14093r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (z0.y((imageView.getHeight() - pVar.f14097y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                eg0 eg0Var = (eg0) this.f14029b;
                eg0Var.J = w7.p.a(scaleGestureDetector.getScaleFactor() * eg0Var.J, 0.75f, eg0Var.f23662a);
                eg0Var.H = (int) (eg0Var.t() * eg0Var.J);
                eg0Var.I = (int) (eg0Var.r() * eg0Var.J);
                AndroidUtilities.runOnUIThread(new ac0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - eg0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = eg0Var.M;
                if (!kVar.f15319f) {
                    kVar.f15317b = eg0Var.K;
                    kVar.f15318c = true;
                    kVar.f15326u.f15332i = dp;
                } else {
                    kVar.f15326u.f15332i = dp;
                }
                kVar.f();
                float a2 = w7.p.a(scaleGestureDetector.getFocusY() - (eg0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - eg0Var.I) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = eg0Var.N;
                if (!kVar2.f15319f) {
                    kVar2.f15317b = eg0Var.L;
                    kVar2.f15318c = true;
                    kVar2.f15326u.f15332i = a2;
                } else {
                    kVar2.f15326u.f15332i = a2;
                }
                kVar2.f();
                return true;
            default:
                j1 j1Var = (j1) this.f14029b;
                j1Var.P = w7.p.a(scaleGestureDetector.getScaleFactor() * j1Var.P, 0.6f, j1Var.f28977a);
                j1Var.M = (int) (j1Var.m() * j1Var.P);
                j1Var.N = (int) (j1Var.l() * j1Var.P);
                AndroidUtilities.runOnUIThread(new h0(this, 20));
                o1.k kVar3 = j1Var.S;
                kVar3.f15317b = j1Var.Q;
                kVar3.f15318c = true;
                o1.l lVar = kVar3.f15326u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - j1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f15332i = dp2;
                o1.k kVar4 = j1Var.S;
                if (!kVar4.f15319f) {
                    kVar4.f();
                }
                o1.k kVar5 = j1Var.T;
                kVar5.f15317b = j1Var.R;
                kVar5.f15318c = true;
                kVar5.f15326u.f15332i = w7.p.a(scaleGestureDetector.getFocusY() - (j1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = j1Var.T;
                if (!kVar6.f15319f) {
                    kVar6.f();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14028a) {
            case 0:
                return true;
            case 1:
                eg0 eg0Var = (eg0) this.f14029b;
                if (eg0Var.f23681w) {
                    eg0Var.f23681w = false;
                    eg0Var.f23671f0 = false;
                    eg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(eg0Var.f23673h0);
                }
                eg0Var.f23682x = true;
                eg0Var.f23666c.width = (int) (eg0Var.t() * eg0Var.f23662a);
                eg0Var.f23666c.height = (int) (eg0Var.r() * eg0Var.f23662a);
                AndroidUtilities.updateViewLayout(eg0Var.f23664b, eg0Var.d, eg0Var.f23666c);
                return true;
            default:
                j1 j1Var = (j1) this.f14029b;
                if (j1Var.H) {
                    j1Var.H = false;
                }
                j1Var.I = true;
                j1Var.f28980c.width = (int) (j1Var.m() * j1Var.f28977a);
                j1Var.f28980c.height = (int) (j1Var.l() * j1Var.f28977a);
                AndroidUtilities.updateViewLayout(j1Var.f28979b, j1Var.d, j1Var.f28980c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14028a) {
            case 0:
                return;
            case 1:
                eg0 eg0Var = (eg0) this.f14029b;
                if (!eg0Var.M.f15319f && !eg0Var.N.f15319f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                g2 g2Var = new g2(this, arrayList, 1);
                o1.k kVar = eg0Var.M;
                if (!kVar.f15319f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(g2Var);
                }
                o1.k kVar2 = eg0Var.N;
                if (!kVar2.f15319f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(g2Var);
                    return;
                }
            default:
                j1 j1Var = (j1) this.f14029b;
                if (!j1Var.S.f15319f && !j1Var.T.f15319f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2Var2 = new g2(this, arrayList2, 2);
                o1.k kVar3 = j1Var.S;
                if (!kVar3.f15319f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(g2Var2);
                }
                o1.k kVar4 = j1Var.T;
                if (!kVar4.f15319f) {
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
