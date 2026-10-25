package ng;

import a8.ee;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.t;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.wa0;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f18783a;
    public final Object f18784b;

    public b(Object obj, int i10) {
        this.f18783a = i10;
        this.f18784b = obj;
    }

    public void b() {
        switch (this.f18783a) {
            case 1:
                ch0 ch0Var = (ch0) this.f18784b;
                WindowManager.LayoutParams layoutParams = ch0Var.f27162c;
                int t10 = (int) (ch0Var.t() * ch0Var.J);
                layoutParams.width = t10;
                ch0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = ch0Var.f27162c;
                int r6 = (int) (ch0Var.r() * ch0Var.J);
                layoutParams2.height = r6;
                ch0Var.I = r6;
                try {
                    AndroidUtilities.updateViewLayout(ch0Var.f27160b, ch0Var.d, ch0Var.f27162c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                i1 i1Var = (i1) this.f18784b;
                WindowManager.LayoutParams layoutParams3 = i1Var.f33845c;
                int m10 = (int) (i1Var.m() * i1Var.P);
                layoutParams3.width = m10;
                i1Var.M = m10;
                WindowManager.LayoutParams layoutParams4 = i1Var.f33845c;
                int l4 = (int) (i1Var.l() * i1Var.P);
                layoutParams4.height = l4;
                i1Var.N = l4;
                AndroidUtilities.updateViewLayout(i1Var.f33844b, i1Var.d, i1Var.f33845c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        float dp;
        float dp2;
        switch (this.f18783a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                p pVar = ((c) this.f18784b).f18786b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = pVar.f18843a;
                ImageView imageView = pVar.f18844b;
                if (!pVar.F) {
                    float f7 = pVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!pVar.f18848r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    n.g(pVar.L, scaleFactor, n.a(pVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), n.b(pVar.L) * (t.y((imageView.getHeight() - pVar.f18852y) - i10, pVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    pVar.r(false);
                }
                return true;
            case 1:
                ch0 ch0Var = (ch0) this.f18784b;
                ch0Var.J = ee.a(scaleGestureDetector.getScaleFactor() * ch0Var.J, 0.75f, ch0Var.f27158a);
                ch0Var.H = (int) (ch0Var.t() * ch0Var.J);
                ch0Var.I = (int) (ch0Var.r() * ch0Var.J);
                AndroidUtilities.runOnUIThread(new wa0(this, 14));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp = (i11 - ch0Var.H) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.j jVar = ch0Var.M;
                if (!jVar.f18963f) {
                    jVar.f18961b = ch0Var.K;
                    jVar.f18962c = true;
                    jVar.f18969u.f18975i = dp;
                } else {
                    jVar.f18969u.f18975i = dp;
                }
                jVar.h();
                float a2 = ee.a(scaleGestureDetector.getFocusY() - (ch0Var.I / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ch0Var.I) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = ch0Var.N;
                if (!jVar2.f18963f) {
                    jVar2.f18961b = ch0Var.L;
                    jVar2.f18962c = true;
                    jVar2.f18969u.f18975i = a2;
                } else {
                    jVar2.f18969u.f18975i = a2;
                }
                jVar2.h();
                return true;
            default:
                i1 i1Var = (i1) this.f18784b;
                i1Var.P = ee.a(scaleGestureDetector.getScaleFactor() * i1Var.P, 0.6f, i1Var.f33842a);
                i1Var.M = (int) (i1Var.m() * i1Var.P);
                i1Var.N = (int) (i1Var.l() * i1Var.P);
                AndroidUtilities.runOnUIThread(new k2.c(this, 18));
                o1.j jVar3 = i1Var.S;
                jVar3.f18961b = i1Var.Q;
                jVar3.f18962c = true;
                o1.k kVar = jVar3.f18969u;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX3 >= i12 / 2.0f) {
                    dp2 = (i12 - i1Var.M) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                kVar.f18975i = dp2;
                o1.j jVar4 = i1Var.S;
                if (!jVar4.f18963f) {
                    jVar4.h();
                }
                o1.j jVar5 = i1Var.T;
                jVar5.f18961b = i1Var.R;
                jVar5.f18962c = true;
                jVar5.f18969u.f18975i = ee.a(scaleGestureDetector.getFocusY() - (i1Var.N / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = i1Var.T;
                if (!jVar6.f18963f) {
                    jVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f18783a) {
            case 0:
                return true;
            case 1:
                ch0 ch0Var = (ch0) this.f18784b;
                if (ch0Var.f27177w) {
                    ch0Var.f27177w = false;
                    ch0Var.f27167f0 = false;
                    ch0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ch0Var.f27169h0);
                }
                ch0Var.f27178x = true;
                ch0Var.f27162c.width = (int) (ch0Var.t() * ch0Var.f27158a);
                ch0Var.f27162c.height = (int) (ch0Var.r() * ch0Var.f27158a);
                AndroidUtilities.updateViewLayout(ch0Var.f27160b, ch0Var.d, ch0Var.f27162c);
                return true;
            default:
                i1 i1Var = (i1) this.f18784b;
                if (i1Var.H) {
                    i1Var.H = false;
                }
                i1Var.I = true;
                i1Var.f33845c.width = (int) (i1Var.m() * i1Var.f33842a);
                i1Var.f33845c.height = (int) (i1Var.l() * i1Var.f33842a);
                AndroidUtilities.updateViewLayout(i1Var.f33844b, i1Var.d, i1Var.f33845c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f18783a) {
            case 0:
                return;
            case 1:
                ch0 ch0Var = (ch0) this.f18784b;
                if (!ch0Var.M.f18963f && !ch0Var.N.f18963f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                di.i1 i1Var = new di.i1(this, arrayList, 1);
                o1.j jVar = ch0Var.M;
                if (!jVar.f18963f) {
                    arrayList.add(jVar);
                } else {
                    jVar.a(i1Var);
                }
                o1.j jVar2 = ch0Var.N;
                if (!jVar2.f18963f) {
                    arrayList.add(jVar2);
                    return;
                } else {
                    jVar2.a(i1Var);
                    return;
                }
            default:
                i1 i1Var2 = (i1) this.f18784b;
                if (!i1Var2.S.f18963f && !i1Var2.T.f18963f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                di.i1 i1Var3 = new di.i1(this, arrayList2, 2);
                o1.j jVar3 = i1Var2.S;
                if (!jVar3.f18963f) {
                    arrayList2.add(jVar3);
                } else {
                    jVar3.a(i1Var3);
                }
                o1.j jVar4 = i1Var2.T;
                if (!jVar4.f18963f) {
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
