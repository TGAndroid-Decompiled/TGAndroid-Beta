package bi;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class w1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        b2 b2Var = b2.Z;
        WindowManager.LayoutParams layoutParams = b2Var.f2855c;
        int n10 = (int) (b2Var.n() * b2Var.M);
        layoutParams.width = n10;
        b2Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = b2Var.f2855c;
        int m10 = (int) (b2Var.m() * b2Var.M);
        layoutParams2.height = m10;
        b2Var.K = m10;
        AndroidUtilities.updateViewLayout(b2Var.f2854b, b2Var.d, b2Var.f2855c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        b2 b2Var = b2.Z;
        b2Var.M = w7.s.a(scaleGestureDetector.getScaleFactor() * b2Var.M, 0.6f, b2Var.f2853a);
        b2Var.J = (int) (b2Var.n() * b2Var.M);
        b2Var.K = (int) (b2Var.m() * b2Var.M);
        AndroidUtilities.runOnUIThread(new ah.j(this, 4));
        o1.k kVar = b2Var.P;
        kVar.f16459b = b2Var.N;
        kVar.f16460c = true;
        o1.l lVar = kVar.f16468u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - b2Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f16474i = dp;
        o1.k kVar2 = b2Var.P;
        if (!kVar2.f16461f) {
            kVar2.h();
        }
        o1.k kVar3 = b2Var.Q;
        kVar3.f16459b = b2Var.O;
        kVar3.f16460c = true;
        kVar3.f16468u.f16474i = w7.s.a(scaleGestureDetector.getFocusY() - (b2Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - b2Var.K) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = b2Var.Q;
        if (!kVar4.f16461f) {
            kVar4.h();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        b2 b2Var = b2.Z;
        if (b2Var.E) {
            b2Var.E = false;
        }
        b2Var.F = true;
        b2Var.f2855c.width = (int) (b2Var.n() * b2Var.f2853a);
        b2Var.f2855c.height = (int) (b2Var.m() * b2Var.f2853a);
        AndroidUtilities.updateViewLayout(b2Var.f2854b, b2Var.d, b2Var.f2855c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        b2 b2Var = b2.Z;
        if (!b2Var.P.f16461f && !b2Var.Q.f16461f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        v1 v1Var = new v1(this, arrayList, 0);
        o1.k kVar = b2Var.P;
        if (!kVar.f16461f) {
            arrayList.add(kVar);
        } else {
            kVar.a(v1Var);
        }
        o1.k kVar2 = b2Var.Q;
        if (!kVar2.f16461f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(v1Var);
        }
    }
}
