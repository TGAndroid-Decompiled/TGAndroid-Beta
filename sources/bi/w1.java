package bi;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class w1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        a2 a2Var = a2.Z;
        WindowManager.LayoutParams layoutParams = a2Var.f2766c;
        int n10 = (int) (a2Var.n() * a2Var.M);
        layoutParams.width = n10;
        a2Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = a2Var.f2766c;
        int m10 = (int) (a2Var.m() * a2Var.M);
        layoutParams2.height = m10;
        a2Var.K = m10;
        AndroidUtilities.updateViewLayout(a2Var.f2765b, a2Var.d, a2Var.f2766c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        a2 a2Var = a2.Z;
        a2Var.M = w7.p.a(scaleGestureDetector.getScaleFactor() * a2Var.M, 0.6f, a2Var.f2764a);
        a2Var.J = (int) (a2Var.n() * a2Var.M);
        a2Var.K = (int) (a2Var.m() * a2Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 4));
        o1.k kVar = a2Var.P;
        kVar.f16842b = a2Var.N;
        kVar.f16843c = true;
        o1.l lVar = kVar.f16852u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - a2Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f16859i = dp;
        o1.k kVar2 = a2Var.P;
        if (!kVar2.f16845f) {
            kVar2.f();
        }
        o1.k kVar3 = a2Var.Q;
        kVar3.f16842b = a2Var.O;
        kVar3.f16843c = true;
        kVar3.f16852u.f16859i = w7.p.a(scaleGestureDetector.getFocusY() - (a2Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - a2Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = a2Var.Q;
        if (!kVar4.f16845f) {
            kVar4.f();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        a2 a2Var = a2.Z;
        if (a2Var.E) {
            a2Var.E = false;
        }
        a2Var.F = true;
        a2Var.f2766c.width = (int) (a2Var.n() * a2Var.f2764a);
        a2Var.f2766c.height = (int) (a2Var.m() * a2Var.f2764a);
        AndroidUtilities.updateViewLayout(a2Var.f2765b, a2Var.d, a2Var.f2766c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        a2 a2Var = a2.Z;
        if (!a2Var.P.f16845f && !a2Var.Q.f16845f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        v1 v1Var = new v1(this, arrayList, 0);
        o1.k kVar = a2Var.P;
        if (!kVar.f16845f) {
            arrayList.add(kVar);
        } else {
            kVar.a(v1Var);
        }
        o1.k kVar2 = a2Var.Q;
        if (!kVar2.f16845f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(v1Var);
        }
    }
}
