package di;

import a8.ee;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class j1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        o1 o1Var = o1.Z;
        WindowManager.LayoutParams layoutParams = o1Var.f8858c;
        int n10 = (int) (o1Var.n() * o1Var.M);
        layoutParams.width = n10;
        o1Var.J = n10;
        WindowManager.LayoutParams layoutParams2 = o1Var.f8858c;
        int m10 = (int) (o1Var.m() * o1Var.M);
        layoutParams2.height = m10;
        o1Var.K = m10;
        AndroidUtilities.updateViewLayout(o1Var.f8857b, o1Var.d, o1Var.f8858c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        o1 o1Var = o1.Z;
        o1Var.M = ee.a(scaleGestureDetector.getScaleFactor() * o1Var.M, 0.6f, o1Var.f8856a);
        o1Var.J = (int) (o1Var.n() * o1Var.M);
        o1Var.K = (int) (o1Var.m() * o1Var.M);
        AndroidUtilities.runOnUIThread(new ag.c(this, 10));
        o1.j jVar = o1Var.P;
        jVar.f18960b = o1Var.N;
        jVar.f18961c = true;
        o1.k kVar = jVar.f18968u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - o1Var.J) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f18974i = dp;
        o1.j jVar2 = o1Var.P;
        if (!jVar2.f18962f) {
            jVar2.h();
        }
        o1.j jVar3 = o1Var.Q;
        jVar3.f18960b = o1Var.O;
        jVar3.f18961c = true;
        jVar3.f18968u.f18974i = ee.a(scaleGestureDetector.getFocusY() - (o1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f));
        o1.j jVar4 = o1Var.Q;
        if (!jVar4.f18962f) {
            jVar4.h();
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
        o1Var.f8858c.width = (int) (o1Var.n() * o1Var.f8856a);
        o1Var.f8858c.height = (int) (o1Var.m() * o1Var.f8856a);
        AndroidUtilities.updateViewLayout(o1Var.f8857b, o1Var.d, o1Var.f8858c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        o1 o1Var = o1.Z;
        if (!o1Var.P.f18962f && !o1Var.Q.f18962f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        i1 i1Var = new i1(this, arrayList, 0);
        o1.j jVar = o1Var.P;
        if (!jVar.f18962f) {
            arrayList.add(jVar);
        } else {
            jVar.a(i1Var);
        }
        o1.j jVar2 = o1Var.Q;
        if (!jVar2.f18962f) {
            arrayList.add(jVar2);
        } else {
            jVar2.a(i1Var);
        }
    }
}
