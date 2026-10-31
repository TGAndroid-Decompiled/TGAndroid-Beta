package eg;

import android.graphics.Point;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.voip.s0;
import w7.u;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f6520a;
    public final Object f6521b;

    public b(Object obj, int i10) {
        this.f6520a = i10;
        this.f6521b = obj;
    }

    public void b() {
        switch (this.f6520a) {
            case 1:
                jf0 jf0Var = (jf0) this.f6521b;
                WindowManager.LayoutParams layoutParams = jf0Var.f27350c;
                int t10 = (int) (jf0Var.t() * jf0Var.J);
                layoutParams.width = t10;
                jf0Var.H = t10;
                WindowManager.LayoutParams layoutParams2 = jf0Var.f27350c;
                int p5 = (int) (jf0Var.p() * jf0Var.J);
                layoutParams2.height = p5;
                jf0Var.I = p5;
                try {
                    i0.S3(jf0Var.f27348b, jf0Var.d, jf0Var.f27350c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                s0 s0Var = (s0) this.f6521b;
                WindowManager.LayoutParams layoutParams3 = s0Var.f31649c;
                int f7 = (int) (s0Var.f() * s0Var.P);
                layoutParams3.width = f7;
                s0Var.M = f7;
                WindowManager.LayoutParams layoutParams4 = s0Var.f31649c;
                int e = (int) (s0Var.e() * s0Var.P);
                layoutParams4.height = e;
                s0Var.N = e;
                i0.S3(s0Var.f31648b, s0Var.d, s0Var.f31649c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i10;
        Point point;
        float L;
        Point point2;
        float L2;
        switch (this.f6520a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                q qVar = ((c) this.f6521b).f6523b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = qVar.f6583a;
                ImageView imageView = qVar.f6584b;
                if (!qVar.F) {
                    float f7 = qVar.L.e;
                    if (f7 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f7;
                    }
                    if (!qVar.f6588r) {
                        i10 = i0.f16020m;
                    } else {
                        i10 = 0;
                    }
                    o.g(qVar.L, scaleFactor, o.a(qVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), o.b(qVar.L) * (m5.y((imageView.getHeight() - qVar.D) - i10, qVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    qVar.r(false);
                }
                return true;
            case 1:
                jf0 jf0Var = (jf0) this.f6521b;
                jf0Var.J = u.a(scaleGestureDetector.getScaleFactor() * jf0Var.J, 0.75f, jf0Var.f27346a);
                jf0Var.H = (int) (jf0Var.t() * jf0Var.J);
                jf0Var.I = (int) (jf0Var.p() * jf0Var.J);
                i0.g3(new eb0(this, 12));
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = i0.f16026q.x;
                if (focusX2 >= i11 / 2.0f) {
                    L = (i11 - jf0Var.H) - i0.L(16.0f);
                } else {
                    L = i0.L(16.0f);
                }
                o1.j jVar = jf0Var.M;
                if (!jVar.f13951f) {
                    jVar.f13949b = jf0Var.K;
                    jVar.f13950c = true;
                    jVar.f13957m.f13964i = L;
                } else {
                    jVar.f13957m.f13964i = L;
                }
                jVar.h();
                float a2 = u.a(scaleGestureDetector.getFocusY() - (jf0Var.I / 2.0f), i0.L(16.0f), (point.y - jf0Var.I) - i0.L(16.0f));
                o1.j jVar2 = jf0Var.N;
                if (!jVar2.f13951f) {
                    jVar2.f13949b = jf0Var.L;
                    jVar2.f13950c = true;
                    jVar2.f13957m.f13964i = a2;
                } else {
                    jVar2.f13957m.f13964i = a2;
                }
                jVar2.h();
                return true;
            default:
                s0 s0Var = (s0) this.f6521b;
                s0Var.P = u.a(scaleGestureDetector.getScaleFactor() * s0Var.P, 0.6f, s0Var.f31646a);
                s0Var.M = (int) (s0Var.f() * s0Var.P);
                s0Var.N = (int) (s0Var.e() * s0Var.P);
                i0.g3(new w5(this, 5));
                o1.j jVar3 = s0Var.S;
                jVar3.f13949b = s0Var.Q;
                jVar3.f13950c = true;
                o1.k kVar = jVar3.f13957m;
                float focusX3 = scaleGestureDetector.getFocusX();
                int i12 = i0.f16026q.x;
                if (focusX3 >= i12 / 2.0f) {
                    L2 = (i12 - s0Var.M) - i0.L(16.0f);
                } else {
                    L2 = i0.L(16.0f);
                }
                kVar.f13964i = L2;
                o1.j jVar4 = s0Var.S;
                if (!jVar4.f13951f) {
                    jVar4.h();
                }
                o1.j jVar5 = s0Var.T;
                jVar5.f13949b = s0Var.R;
                jVar5.f13950c = true;
                jVar5.f13957m.f13964i = u.a(scaleGestureDetector.getFocusY() - (s0Var.N / 2.0f), i0.L(16.0f), (point2.y - s0Var.N) - i0.L(16.0f));
                o1.j jVar6 = s0Var.T;
                if (!jVar6.f13951f) {
                    jVar6.h();
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f6520a) {
            case 0:
                return true;
            case 1:
                jf0 jf0Var = (jf0) this.f6521b;
                if (jf0Var.f27366x) {
                    jf0Var.f27366x = false;
                    jf0Var.f27355f0 = false;
                    jf0Var.a();
                    i0.r(jf0Var.f27357h0);
                }
                jf0Var.f27367y = true;
                jf0Var.f27350c.width = (int) (jf0Var.t() * jf0Var.f27346a);
                jf0Var.f27350c.height = (int) (jf0Var.p() * jf0Var.f27346a);
                i0.S3(jf0Var.f27348b, jf0Var.d, jf0Var.f27350c);
                return true;
            default:
                s0 s0Var = (s0) this.f6521b;
                if (s0Var.H) {
                    s0Var.H = false;
                }
                s0Var.I = true;
                s0Var.f31649c.width = (int) (s0Var.f() * s0Var.f31646a);
                s0Var.f31649c.height = (int) (s0Var.e() * s0Var.f31646a);
                i0.S3(s0Var.f31648b, s0Var.d, s0Var.f31649c);
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f6520a) {
            case 0:
                return;
            case 1:
                jf0 jf0Var = (jf0) this.f6521b;
                if (!jf0Var.M.f13951f && !jf0Var.N.f13951f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ff0 ff0Var = new ff0(this, arrayList, 0);
                o1.j jVar = jf0Var.M;
                if (!jVar.f13951f) {
                    arrayList.add(jVar);
                } else {
                    jVar.a(ff0Var);
                }
                o1.j jVar2 = jf0Var.N;
                if (!jVar2.f13951f) {
                    arrayList.add(jVar2);
                    return;
                } else {
                    jVar2.a(ff0Var);
                    return;
                }
            default:
                s0 s0Var = (s0) this.f6521b;
                if (!s0Var.S.f13951f && !s0Var.T.f13951f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ff0 ff0Var2 = new ff0(this, arrayList2, 1);
                o1.j jVar3 = s0Var.S;
                if (!jVar3.f13951f) {
                    arrayList2.add(jVar3);
                } else {
                    jVar3.a(ff0Var2);
                }
                o1.j jVar4 = s0Var.T;
                if (!jVar4.f13951f) {
                    arrayList2.add(jVar4);
                    return;
                } else {
                    jVar4.a(ff0Var2);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
