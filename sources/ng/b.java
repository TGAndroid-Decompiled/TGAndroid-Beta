package ng;

import a8.ee;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.t;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.xa0;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f18782a;
    public final Object f18783b;

    public b(Object obj, int i10) {
        this.f18782a = i10;
        this.f18783b = obj;
    }

    public void b() {
        switch (this.f18782a) {
            case 1:
                dh0 dh0Var = (dh0) this.f18783b;
                WindowManager.LayoutParams layoutParams = dh0Var.f27449c;
                int t10 = (int) (dh0Var.t() * dh0Var.J);
                layoutParams.width = t10;
                dh0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = dh0Var.f27449c;
                int r6 = (int) (dh0Var.r() * dh0Var.J);
                layoutParams2.height = r6;
                dh0Var.I = r6;
                try {
                    AndroidUtilities.updateViewLayout(dh0Var.f27447b, dh0Var.d, dh0Var.f27449c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                i1 i1Var = (i1) this.f18783b;
                WindowManager.LayoutParams layoutParams3 = i1Var.f33953c;
                int m10 = (int) (i1Var.m() * i1Var.P);
                layoutParams3.width = m10;
                i1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = i1Var.f33953c;
                int l4 = (int) (i1Var.l() * i1Var.P);
                layoutParams4.height = l4;
                i1Var.N = l4;
                AndroidUtilities.updateViewLayout(i1Var.f33952b, i1Var.d, i1Var.f33953c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f18782a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f18783b).f18785b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f18842a;
                ImageView imageView = pVar.f18843b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f18847r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (t.y((imageView.getHeight() - pVar.f18851y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                dh0 dh0Var = (dh0) this.f18783b;
                dh0Var.J = ee.a(scaleGestureDetector.getScaleFactor() * dh0Var.J, 0.75f, dh0Var.f27445a);
                dh0Var.H = (int) (dh0Var.t() * dh0Var.J);
                dh0Var.I = (int) (dh0Var.r() * dh0Var.J);
                AndroidUtilities.runOnUIThread(new xa0(this, 14));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - dh0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.j jVar = dh0Var.M;
                if (!jVar.f18962f) {
                    jVar.f18960b = dh0Var.K;
                    jVar.f18961c = true;
                    jVar.f18968u.f18974i = dp;
                } else {
                    jVar.f18968u.f18974i = dp;
                }
                jVar.h();
                float a2 = ee.a(scaleGestureDetector.getFocusY() - (dh0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = dh0Var.N;
                if (!jVar2.f18962f) {
                    jVar2.f18960b = dh0Var.L;
                    jVar2.f18961c = true;
                    jVar2.f18968u.f18974i = a2;
                } else {
                    jVar2.f18968u.f18974i = a2;
                }
                jVar2.h();
                return true;
            default:
                i1 i1Var = (i1) this.f18783b;
                i1Var.P = ee.a(scaleGestureDetector.getScaleFactor() * i1Var.P, 0.6f, i1Var.f33950a);
                i1Var.M = (int) (i1Var.m() * i1Var.P);
                i1Var.N = (int) (i1Var.l() * i1Var.P);
                AndroidUtilities.runOnUIThread(new k2.c(this, 18));
                o1.j jVar3 = i1Var.S;
                jVar3.f18960b = i1Var.Q;
                jVar3.f18961c = true;
                o1.k kVar = jVar3.f18968u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - i1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                kVar.f18974i = dp2;
                o1.j jVar4 = i1Var.S;
                if (!jVar4.f18962f) {
                    jVar4.h();
                }
                o1.j jVar5 = i1Var.T;
                jVar5.f18960b = i1Var.R;
                jVar5.f18961c = true;
                jVar5.f18968u.f18974i = ee.a(scaleGestureDetector.getFocusY() - (i1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = i1Var.T;
                if (!jVar6.f18962f) {
                    jVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f18782a) {
            case 0:
                return true;
            case 1:
                dh0 dh0Var = (dh0) this.f18783b;
                if (dh0Var.f27464w) {
                    dh0Var.f27464w = false;
                    dh0Var.f27454f0 = false;
                    dh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(dh0Var.f27456h0);
                }
                dh0Var.f27465x = true;
                dh0Var.f27449c.width = (int) (dh0Var.t() * dh0Var.f27445a);
                dh0Var.f27449c.height = (int) (dh0Var.r() * dh0Var.f27445a);
                AndroidUtilities.updateViewLayout(dh0Var.f27447b, dh0Var.d, dh0Var.f27449c);
                return true;
            default:
                i1 i1Var = (i1) this.f18783b;
                if (i1Var.H) {
                    i1Var.H = false;
                }
                i1Var.I = true;
                i1Var.f33953c.width = (int) (i1Var.m() * i1Var.f33950a);
                i1Var.f33953c.height = (int) (i1Var.l() * i1Var.f33950a);
                AndroidUtilities.updateViewLayout(i1Var.f33952b, i1Var.d, i1Var.f33953c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f18782a) {
            case 0:
                return;
            case 1:
                dh0 dh0Var = (dh0) this.f18783b;
                if (!dh0Var.M.f18962f && !dh0Var.N.f18962f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                di.i1 i1Var = new di.i1(this, arrayList, 1);
                o1.j jVar = dh0Var.M;
                if (!jVar.f18962f) {
                    arrayList.add(jVar);
                } else {
                    jVar.a(i1Var);
                }
                o1.j jVar2 = dh0Var.N;
                if (!jVar2.f18962f) {
                    arrayList.add(jVar2);
                    return;
                } else {
                    jVar2.a(i1Var);
                    return;
                }
            default:
                i1 i1Var2 = (i1) this.f18783b;
                if (!i1Var2.S.f18962f && !i1Var2.T.f18962f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                di.i1 i1Var3 = new di.i1(this, arrayList2, 2);
                o1.j jVar3 = i1Var2.S;
                if (!jVar3.f18962f) {
                    arrayList2.add(jVar3);
                } else {
                    jVar3.a(i1Var3);
                }
                o1.j jVar4 = i1Var2.T;
                if (!jVar4.f18962f) {
                    arrayList2.add(jVar4);
                    return;
                } else {
                    jVar4.a(i1Var3);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
