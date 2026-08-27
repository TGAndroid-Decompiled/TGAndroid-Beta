package jh;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class f1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        i1 i1Var = i1.V;
        WindowManager.LayoutParams layoutParams = i1Var.f13426c;
        int iN = (int) (i1Var.n() * i1Var.I);
        layoutParams.width = iN;
        i1Var.F = iN;
        WindowManager.LayoutParams layoutParams2 = i1Var.f13426c;
        int iM = (int) (i1Var.m() * i1Var.I);
        layoutParams2.height = iM;
        i1Var.G = iM;
        AndroidUtilities.updateViewLayout(i1Var.f13425b, i1Var.d, i1Var.f13426c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        i1 i1Var = i1.V;
        i1Var.I = h7.n.a(scaleGestureDetector.getScaleFactor() * i1Var.I, 0.6f, i1Var.f13424a);
        i1Var.F = (int) (i1Var.n() * i1Var.I);
        i1Var.G = (int) (i1Var.m() * i1Var.I);
        AndroidUtilities.runOnUIThread(new ag.l3(this, 12));
        o1.j jVar = i1Var.L;
        jVar.f19138b = i1Var.J;
        jVar.f19139c = true;
        o1.k kVar = jVar.f19147u;
        float focusX = scaleGestureDetector.getFocusX();
        int i10 = AndroidUtilities.displaySize.x;
        kVar.f19154i = focusX >= ((float) i10) / 2.0f ? (i10 - i1Var.F) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        o1.j jVar2 = i1Var.L;
        if (!jVar2.f19141f) {
            jVar2.f();
        }
        o1.j jVar3 = i1Var.M;
        jVar3.f19138b = i1Var.K;
        jVar3.f19139c = true;
        jVar3.f19147u.f19154i = h7.n.a(scaleGestureDetector.getFocusY() - (i1Var.G / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
        o1.j jVar4 = i1Var.M;
        if (!jVar4.f19141f) {
            jVar4.f();
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
        i1Var.f13426c.width = (int) (i1Var.n() * i1Var.f13424a);
        i1Var.f13426c.height = (int) (i1Var.m() * i1Var.f13424a);
        AndroidUtilities.updateViewLayout(i1Var.f13425b, i1Var.d, i1Var.f13426c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        i1 i1Var = i1.V;
        if (!i1Var.L.f19141f && !i1Var.M.f19141f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        e1 e1Var = new e1(this, arrayList, 0);
        o1.j jVar = i1Var.L;
        if (jVar.f19141f) {
            jVar.a(e1Var);
        } else {
            arrayList.add(jVar);
        }
        o1.j jVar2 = i1Var.M;
        if (jVar2.f19141f) {
            jVar2.a(e1Var);
        } else {
            arrayList.add(jVar2);
        }
    }
}
