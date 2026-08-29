package lh;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        i1 i1Var = i1.V;
        WindowManager.LayoutParams layoutParams = i1Var.f15700c;
        int n10 = (int) (i1Var.n() * i1Var.I);
        layoutParams.width = n10;
        i1Var.F = n10;
        WindowManager.LayoutParams layoutParams2 = i1Var.f15700c;
        int m10 = (int) (i1Var.m() * i1Var.I);
        layoutParams2.height = m10;
        i1Var.G = m10;
        AndroidUtilities.updateViewLayout(i1Var.f15699b, i1Var.d, i1Var.f15700c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        i1 i1Var = i1.V;
        i1Var.I = i7.w.a(scaleGestureDetector.getScaleFactor() * i1Var.I, 0.6f, i1Var.f15698a);
        i1Var.F = (int) (i1Var.n() * i1Var.I);
        i1Var.G = (int) (i1Var.m() * i1Var.I);
        AndroidUtilities.runOnUIThread(new ag.o0(this, 16));
        o1.k kVar = i1Var.L;
        kVar.f19036b = i1Var.J;
        kVar.f19037c = true;
        o1.l lVar = kVar.f19045u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        if (focusX >= i10 / 2.0f) {
            dp = (i10 - i1Var.F) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f19052i = dp;
        o1.k kVar2 = i1Var.L;
        if (!kVar2.f19039f) {
            kVar2.f();
        }
        o1.k kVar3 = i1Var.M;
        kVar3.f19036b = i1Var.K;
        kVar3.f19037c = true;
        kVar3.f19045u.f19052i = i7.w.a(scaleGestureDetector.getFocusY() - (i1Var.G / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
        o1.k kVar4 = i1Var.M;
        if (!kVar4.f19039f) {
            kVar4.f();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        i1 i1Var = i1.V;
        if (i1Var.A) {
            i1Var.A = false;
        }
        i1Var.B = true;
        i1Var.f15700c.width = (int) (i1Var.n() * i1Var.f15698a);
        i1Var.f15700c.height = (int) (i1Var.m() * i1Var.f15698a);
        AndroidUtilities.updateViewLayout(i1Var.f15699b, i1Var.d, i1Var.f15700c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        i1 i1Var = i1.V;
        if (!i1Var.L.f19039f && !i1Var.M.f19039f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        e1 e1Var = new e1(this, arrayList, 0);
        o1.k kVar = i1Var.L;
        if (!kVar.f19039f) {
            arrayList.add(kVar);
        } else {
            kVar.a(e1Var);
        }
        o1.k kVar2 = i1Var.M;
        if (!kVar2.f19039f) {
            arrayList.add(kVar2);
        } else {
            kVar2.a(e1Var);
        }
    }
}
