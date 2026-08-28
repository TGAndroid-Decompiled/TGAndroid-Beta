package ih;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class h1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        k1 k1Var = k1.V;
        WindowManager.LayoutParams layoutParams = k1Var.f11658c;
        int n10 = (int) (k1Var.n() * k1Var.I);
        layoutParams.width = n10;
        k1Var.F = n10;
        WindowManager.LayoutParams layoutParams2 = k1Var.f11658c;
        int m10 = (int) (k1Var.m() * k1Var.I);
        layoutParams2.height = m10;
        k1Var.G = m10;
        AndroidUtilities.updateViewLayout(k1Var.f11657b, k1Var.d, k1Var.f11658c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        k1 k1Var = k1.V;
        k1Var.I = g7.n.a(scaleGestureDetector.getScaleFactor() * k1Var.I, 0.6f, k1Var.f11656a);
        k1Var.F = (int) (k1Var.n() * k1Var.I);
        k1Var.G = (int) (k1Var.m() * k1Var.I);
        AndroidUtilities.runOnUIThread(new bg.d2(this, 11));
        o1.j jVar = k1Var.L;
        jVar.f18791b = k1Var.J;
        jVar.f18792c = true;
        o1.k kVar = jVar.f18800u;
        float focusX = scaleGestureDetector.getFocusX();
        int i9 = AndroidUtilities.displaySize.x;
        if (focusX >= i9 / 2.0f) {
            dp = (i9 - k1Var.F) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f18807i = dp;
        o1.j jVar2 = k1Var.L;
        if (!jVar2.f18794f) {
            jVar2.f();
        }
        o1.j jVar3 = k1Var.M;
        jVar3.f18791b = k1Var.K;
        jVar3.f18792c = true;
        jVar3.f18800u.f18807i = g7.n.a(scaleGestureDetector.getFocusY() - (k1Var.G / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.G) - AndroidUtilities.dp(16.0f));
        o1.j jVar4 = k1Var.M;
        if (!jVar4.f18794f) {
            jVar4.f();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        k1 k1Var = k1.V;
        if (k1Var.A) {
            k1Var.A = false;
        }
        k1Var.B = true;
        k1Var.f11658c.width = (int) (k1Var.n() * k1Var.f11656a);
        k1Var.f11658c.height = (int) (k1Var.m() * k1Var.f11656a);
        AndroidUtilities.updateViewLayout(k1Var.f11657b, k1Var.d, k1Var.f11658c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        k1 k1Var = k1.V;
        if (!k1Var.L.f18794f && !k1Var.M.f18794f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        g1 g1Var = new g1(this, arrayList, 0);
        o1.j jVar = k1Var.L;
        if (!jVar.f18794f) {
            arrayList.add(jVar);
        } else {
            jVar.a(g1Var);
        }
        o1.j jVar2 = k1Var.M;
        if (!jVar2.f18794f) {
            arrayList.add(jVar2);
        } else {
            jVar2.a(g1Var);
        }
    }
}
