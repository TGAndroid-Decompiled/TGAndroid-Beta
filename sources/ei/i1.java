package ei;

import android.graphics.Point;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import b8.be;
import java.util.ArrayList;
public final class i1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final void a() {
        n1 n1Var = n1.f10647a0;
        WindowManager.LayoutParams layoutParams = n1Var.f10650c;
        int h = (int) (n1Var.h() * n1Var.N);
        layoutParams.width = h;
        n1Var.K = h;
        WindowManager.LayoutParams layoutParams2 = n1Var.f10650c;
        int f10 = (int) (n1Var.f() * n1Var.N);
        layoutParams2.height = f10;
        n1Var.L = f10;
        org.telegram.messenger.g0.T3(n1Var.f10649b, n1Var.d, n1Var.f10650c);
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Point point;
        float L;
        n1 n1Var = n1.f10647a0;
        n1Var.N = be.a(scaleGestureDetector.getScaleFactor() * n1Var.N, 0.6f, n1Var.f10648a);
        n1Var.K = (int) (n1Var.h() * n1Var.N);
        n1Var.L = (int) (n1Var.f() * n1Var.N);
        org.telegram.messenger.g0.h3(new ai.y1(this, 11));
        q1.g gVar = n1Var.Q;
        gVar.f53644b = n1Var.O;
        gVar.f53645c = true;
        q1.h hVar = gVar.f53653m;
        float focusX = scaleGestureDetector.getFocusX();
        int i3 = org.telegram.messenger.g0.f22608q.x;
        if (focusX >= i3 / 2.0f) {
            L = (i3 - n1Var.K) - org.telegram.messenger.g0.L(16.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        hVar.f53661i = L;
        q1.g gVar2 = n1Var.Q;
        if (!gVar2.f53647f) {
            gVar2.h();
        }
        q1.g gVar3 = n1Var.R;
        gVar3.f53644b = n1Var.P;
        gVar3.f53645c = true;
        gVar3.f53653m.f53661i = be.a(scaleGestureDetector.getFocusY() - (n1Var.L / 2.0f), org.telegram.messenger.g0.L(16.0f), (point.y - n1Var.L) - org.telegram.messenger.g0.L(16.0f));
        q1.g gVar4 = n1Var.R;
        if (!gVar4.f53647f) {
            gVar4.h();
        }
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        n1 n1Var = n1.f10647a0;
        if (n1Var.F) {
            n1Var.F = false;
        }
        n1Var.G = true;
        n1Var.f10650c.width = (int) (n1Var.h() * n1Var.f10648a);
        n1Var.f10650c.height = (int) (n1Var.f() * n1Var.f10648a);
        org.telegram.messenger.g0.T3(n1Var.f10649b, n1Var.d, n1Var.f10650c);
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        n1 n1Var = n1.f10647a0;
        if (!n1Var.Q.f53647f && !n1Var.R.f53647f) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        h1 h1Var = new h1(this, arrayList, 0);
        q1.g gVar = n1Var.Q;
        if (!gVar.f53647f) {
            arrayList.add(gVar);
        } else {
            gVar.a(h1Var);
        }
        q1.g gVar2 = n1Var.R;
        if (!gVar2.f53647f) {
            arrayList.add(gVar2);
        } else {
            gVar2.a(h1Var);
        }
    }
}
