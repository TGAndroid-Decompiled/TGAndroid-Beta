package nh;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        j1 j1Var = j1.W;
        WindowManager.LayoutParams layoutParams = j1Var.f15484c;
        int n10 = (int) (j1Var.n() * j1Var.J);
        layoutParams.width = n10;
        j1Var.G = n10;
        WindowManager.LayoutParams layoutParams2 = j1Var.f15484c;
        int m9 = (int) (j1Var.m() * j1Var.J);
        layoutParams2.height = m9;
        j1Var.H = m9;
        AndroidUtilities.updateViewLayout(j1Var.f15483b, j1Var.d, j1Var.f15484c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        j1 j1Var = j1.W;
        j1Var.J = k7.n.a(scaleGestureDetector.getScaleFactor() * j1Var.J, 0.6f, j1Var.f15482a);
        j1Var.G = (int) (j1Var.n() * j1Var.J);
        j1Var.H = (int) (j1Var.m() * j1Var.J);
        AndroidUtilities.runOnUIThread(new cg.n0(this, 16));
        o1.j jVar = j1Var.M;
        jVar.f16170b = j1Var.K;
        jVar.f16171c = true;
        o1.k kVar = jVar.f16178u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - j1Var.G) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f16184i = dp;
        o1.j jVar2 = j1Var.M;
        if (!jVar2.f16172f) {
            jVar2.f();
        }
        o1.j jVar3 = j1Var.N;
        jVar3.f16170b = j1Var.L;
        jVar3.f16171c = true;
        jVar3.f16178u.f16184i = k7.n.a(scaleGestureDetector.getFocusY() - (j1Var.H / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
        o1.j jVar4 = j1Var.N;
        if (!jVar4.f16172f) {
            jVar4.f();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        j1 j1Var = j1.W;
        if (j1Var.B) {
            j1Var.B = false;
        }
        j1Var.C = true;
        j1Var.f15484c.width = (int) (j1Var.n() * j1Var.f15482a);
        j1Var.f15484c.height = (int) (j1Var.m() * j1Var.f15482a);
        AndroidUtilities.updateViewLayout(j1Var.f15483b, j1Var.d, j1Var.f15484c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        j1 j1Var = j1.W;
        if (!j1Var.M.f16172f && !j1Var.N.f16172f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        f1 f1Var = new f1(this, arrayList, 0);
        o1.j jVar = j1Var.M;
        if (!jVar.f16172f) {
            arrayList.add(jVar);
        } else {
            jVar.a(f1Var);
        }
        o1.j jVar2 = j1Var.N;
        if (!jVar2.f16172f) {
            arrayList.add(jVar2);
        } else {
            jVar2.a(f1Var);
        }
    }
}
