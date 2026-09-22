package ai;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class h2 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        m2 m2Var = m2.Z;
        WindowManager.LayoutParams layoutParams = m2Var.f1231c;
        int n10 = (int) (m2Var.n() * m2Var.M);
        layoutParams.width = n10;
        m2Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = m2Var.f1231c;
        int m10 = (int) (m2Var.m() * m2Var.M);
        layoutParams2.height = m10;
        m2Var.K = m10;
        AndroidUtilities.updateViewLayout(m2Var.f1230b, m2Var.d, m2Var.f1231c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        m2 m2Var = m2.Z;
        m2Var.M = w7.q.a(scaleGestureDetector.getScaleFactor() * m2Var.M, 0.6f, m2Var.f1229a);
        m2Var.J = (int) (m2Var.n() * m2Var.M);
        m2Var.K = (int) (m2Var.m() * m2Var.M);
        AndroidUtilities.runOnUIThread(new f(this, 3));
        o1.k kVar = m2Var.P;
        kVar.f15528b = m2Var.N;
        kVar.f15529c = true;
        o1.l lVar = kVar.f15537u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - m2Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f15543i = dp;
        o1.k kVar2 = m2Var.P;
        if (!kVar2.f15530f) {
            kVar2.f();
        }
        o1.k kVar3 = m2Var.Q;
        kVar3.f15528b = m2Var.O;
        kVar3.f15529c = true;
        kVar3.f15537u.f15543i = w7.q.a(scaleGestureDetector.getFocusY() - (m2Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = m2Var.Q;
        if (!kVar4.f15530f) {
            kVar4.f();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        m2 m2Var = m2.Z;
        if (m2Var.E) {
            m2Var.E = false;
        }
        m2Var.F = true;
        m2Var.f1231c.width = (int) (m2Var.n() * m2Var.f1229a);
        m2Var.f1231c.height = (int) (m2Var.m() * m2Var.f1229a);
        AndroidUtilities.updateViewLayout(m2Var.f1230b, m2Var.d, m2Var.f1231c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        m2 m2Var = m2.Z;
        if (!m2Var.P.f15530f && !m2Var.Q.f15530f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        g2 g2Var = new g2(this, arrayList, 0);
        o1.k kVar = m2Var.P;
        if (!kVar.f15530f) {
            arrayList.add(kVar);
        } else {
            kVar.a(g2Var);
        }
        o1.k kVar2 = m2Var.Q;
        if (!kVar2.f15530f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(g2Var);
        }
    }
}
