package ci;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class j1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        o1 o1Var = o1.Z;
        WindowManager.LayoutParams layoutParams = o1Var.f5619c;
        int n10 = (int) (o1Var.n() * o1Var.M);
        layoutParams.width = n10;
        o1Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = o1Var.f5619c;
        int m10 = (int) (o1Var.m() * o1Var.M);
        layoutParams2.height = m10;
        o1Var.K = m10;
        AndroidUtilities.updateViewLayout(o1Var.f5618b, o1Var.d, o1Var.f5619c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        o1 o1Var = o1.Z;
        o1Var.M = w7.r.a(scaleGestureDetector.getScaleFactor() * o1Var.M, 0.6f, o1Var.f5617a);
        o1Var.J = (int) (o1Var.n() * o1Var.M);
        o1Var.K = (int) (o1Var.m() * o1Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 8));
        o1.k kVar = o1Var.P;
        kVar.f17613b = o1Var.N;
        kVar.f17614c = true;
        o1.l lVar = kVar.f17622u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - o1Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f17628i = dp;
        o1.k kVar2 = o1Var.P;
        if (!kVar2.f17615f) {
            kVar2.h();
        }
        o1.k kVar3 = o1Var.Q;
        kVar3.f17613b = o1Var.O;
        kVar3.f17614c = true;
        kVar3.f17622u.f17628i = w7.r.a(scaleGestureDetector.getFocusY() - (o1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = o1Var.Q;
        if (!kVar4.f17615f) {
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
        o1Var.f5619c.width = (int) (o1Var.n() * o1Var.f5617a);
        o1Var.f5619c.height = (int) (o1Var.m() * o1Var.f5617a);
        AndroidUtilities.updateViewLayout(o1Var.f5618b, o1Var.d, o1Var.f5619c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        o1 o1Var = o1.Z;
        if (!o1Var.P.f17615f && !o1Var.Q.f17615f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1(this, arrayList, 0);
        o1.k kVar = o1Var.P;
        if (!kVar.f17615f) {
            arrayList.add(kVar);
        } else {
            kVar.a(i1Var);
        }
        o1.k kVar2 = o1Var.Q;
        if (!kVar2.f17615f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(i1Var);
        }
    }
}
