package ci;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class k1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        o1 o1Var = o1.Z;
        WindowManager.LayoutParams layoutParams = o1Var.f5615c;
        int n10 = (int) (o1Var.n() * o1Var.M);
        layoutParams.width = n10;
        o1Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = o1Var.f5615c;
        int m10 = (int) (o1Var.m() * o1Var.M);
        layoutParams2.height = m10;
        o1Var.K = m10;
        AndroidUtilities.updateViewLayout(o1Var.f5614b, o1Var.d, o1Var.f5615c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        o1 o1Var = o1.Z;
        o1Var.M = w7.r.a(scaleGestureDetector.getScaleFactor() * o1Var.M, 0.6f, o1Var.f5613a);
        o1Var.J = (int) (o1Var.n() * o1Var.M);
        o1Var.K = (int) (o1Var.m() * o1Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 7));
        o1.k kVar = o1Var.P;
        kVar.f17549b = o1Var.N;
        kVar.f17550c = true;
        o1.l lVar = kVar.f17558u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - o1Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f17564i = dp;
        o1.k kVar2 = o1Var.P;
        if (!kVar2.f17551f) {
            kVar2.h();
        }
        o1.k kVar3 = o1Var.Q;
        kVar3.f17549b = o1Var.O;
        kVar3.f17550c = true;
        kVar3.f17558u.f17564i = w7.r.a(scaleGestureDetector.getFocusY() - (o1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = o1Var.Q;
        if (!kVar4.f17551f) {
            kVar4.h();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        o1 o1Var = o1.Z;
        if (o1Var.E) {
            o1Var.E = false;
        }
        o1Var.F = true;
        o1Var.f5615c.width = (int) (o1Var.n() * o1Var.f5613a);
        o1Var.f5615c.height = (int) (o1Var.m() * o1Var.f5613a);
        AndroidUtilities.updateViewLayout(o1Var.f5614b, o1Var.d, o1Var.f5615c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        o1 o1Var = o1.Z;
        if (!o1Var.P.f17551f && !o1Var.Q.f17551f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        j1 j1Var = new j1(this, arrayList, 0);
        o1.k kVar = o1Var.P;
        if (!kVar.f17551f) {
            arrayList.add(kVar);
        } else {
            kVar.a(j1Var);
        }
        o1.k kVar2 = o1Var.Q;
        if (!kVar2.f17551f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(j1Var);
        }
    }
}
