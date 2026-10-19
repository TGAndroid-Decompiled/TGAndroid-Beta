package ci;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class k1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        p1 p1Var = p1.Z;
        WindowManager.LayoutParams layoutParams = p1Var.f5713c;
        int n10 = (int) (p1Var.n() * p1Var.M);
        layoutParams.width = n10;
        p1Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = p1Var.f5713c;
        int m10 = (int) (p1Var.m() * p1Var.M);
        layoutParams2.height = m10;
        p1Var.K = m10;
        AndroidUtilities.updateViewLayout(p1Var.f5712b, p1Var.d, p1Var.f5713c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        p1 p1Var = p1.Z;
        p1Var.M = w7.r.a(scaleGestureDetector.getScaleFactor() * p1Var.M, 0.6f, p1Var.f5711a);
        p1Var.J = (int) (p1Var.n() * p1Var.M);
        p1Var.K = (int) (p1Var.m() * p1Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 8));
        o1.k kVar = p1Var.P;
        kVar.f17550b = p1Var.N;
        kVar.f17551c = true;
        o1.l lVar = kVar.f17559u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - p1Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f17565i = dp;
        o1.k kVar2 = p1Var.P;
        if (!kVar2.f17552f) {
            kVar2.h();
        }
        o1.k kVar3 = p1Var.Q;
        kVar3.f17550b = p1Var.O;
        kVar3.f17551c = true;
        kVar3.f17559u.f17565i = w7.r.a(scaleGestureDetector.getFocusY() - (p1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - p1Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = p1Var.Q;
        if (!kVar4.f17552f) {
            kVar4.h();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        p1 p1Var = p1.Z;
        if (p1Var.E) {
            p1Var.E = false;
        }
        p1Var.F = true;
        p1Var.f5713c.width = (int) (p1Var.n() * p1Var.f5711a);
        p1Var.f5713c.height = (int) (p1Var.m() * p1Var.f5711a);
        AndroidUtilities.updateViewLayout(p1Var.f5712b, p1Var.d, p1Var.f5713c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        p1 p1Var = p1.Z;
        if (!p1Var.P.f17552f && !p1Var.Q.f17552f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        j1 j1Var = new j1(this, arrayList, 0);
        o1.k kVar = p1Var.P;
        if (!kVar.f17552f) {
            arrayList.add(kVar);
        } else {
            kVar.a(j1Var);
        }
        o1.k kVar2 = p1Var.Q;
        if (!kVar2.f17552f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(j1Var);
        }
    }
}
