package ai;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class h2 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        n2 n2Var = n2.Z;
        WindowManager.LayoutParams layoutParams = n2Var.f1448c;
        int n10 = (int) (n2Var.n() * n2Var.M);
        layoutParams.width = n10;
        n2Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = n2Var.f1448c;
        int m10 = (int) (n2Var.m() * n2Var.M);
        layoutParams2.height = m10;
        n2Var.K = m10;
        AndroidUtilities.updateViewLayout(n2Var.f1447b, n2Var.d, n2Var.f1448c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        n2 n2Var = n2.Z;
        n2Var.M = w7.o.a(scaleGestureDetector.getScaleFactor() * n2Var.M, 0.6f, n2Var.f1446a);
        n2Var.J = (int) (n2Var.n() * n2Var.M);
        n2Var.K = (int) (n2Var.m() * n2Var.M);
        AndroidUtilities.runOnUIThread(new f(this, 3));
        o1.k kVar = n2Var.P;
        kVar.f16978b = n2Var.N;
        kVar.f16979c = true;
        o1.l lVar = kVar.f16988u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - n2Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f16995i = dp;
        o1.k kVar2 = n2Var.P;
        if (!kVar2.f16981f) {
            kVar2.h();
        }
        o1.k kVar3 = n2Var.Q;
        kVar3.f16978b = n2Var.O;
        kVar3.f16979c = true;
        kVar3.f16988u.f16995i = w7.o.a(scaleGestureDetector.getFocusY() - (n2Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - n2Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = n2Var.Q;
        if (!kVar4.f16981f) {
            kVar4.h();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        n2 n2Var = n2.Z;
        if (n2Var.E) {
            n2Var.E = false;
        }
        n2Var.F = true;
        n2Var.f1448c.width = (int) (n2Var.n() * n2Var.f1446a);
        n2Var.f1448c.height = (int) (n2Var.m() * n2Var.f1446a);
        AndroidUtilities.updateViewLayout(n2Var.f1447b, n2Var.d, n2Var.f1448c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        n2 n2Var = n2.Z;
        if (!n2Var.P.f16981f && !n2Var.Q.f16981f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        g2 g2Var = new g2(this, arrayList, 0);
        o1.k kVar = n2Var.P;
        if (!kVar.f16981f) {
            arrayList.add(kVar);
        } else {
            kVar.a(g2Var);
        }
        o1.k kVar2 = n2Var.Q;
        if (!kVar2.f16981f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(g2Var);
        }
    }
}
