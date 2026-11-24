package defpackage;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class u23 implements ScaleGestureDetector.OnScaleGestureListener {
    public final byte a;
    public final Object b;

    public u23(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b() {
        float f;
        sj4 sj4Var = (sj4) this.b;
        WindowManager.LayoutParams layoutParams = sj4Var.e;
        int h = (int) (sj4Var.h() * sj4Var.z);
        layoutParams.width = h;
        sj4Var.x = h;
        sa8 sa8Var = sj4Var.b;
        int Q0 = sa8Var.Q0();
        int S1 = sa8Var.S1();
        if (Q0 > 0 && S1 > 0) {
            f = S1 / Q0;
        } else {
            f = 0.5625f;
        }
        int i = (int) (((int) (sj4.i(f) * f)) * sj4Var.z);
        layoutParams.height = i;
        sj4Var.y = i;
        sj4Var.r();
        sj4Var.a.b.d();
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i;
        float f;
        int i2;
        float m;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                j33 j33Var = ((v23) obj).b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = j33Var.a;
                ImageView imageView = j33Var.b;
                if (j33Var.G) {
                    return true;
                }
                float f2 = j33Var.M.e;
                if (f2 * scaleFactor > 30.0f) {
                    scaleFactor = 30.0f / f2;
                }
                if (!j33Var.r) {
                    i = gl.m;
                } else {
                    i = 0;
                }
                j33Var.M.f(scaleFactor, j33Var.M.b() * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), j33Var.M.a() * (tb4.x((imageView.getHeight() - j33Var.E) - i, j33Var.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                j33Var.r(false);
                return true;
            default:
                sj4 sj4Var = (sj4) obj;
                sj4Var.z = moe.a(scaleGestureDetector.getScaleFactor() * sj4Var.z, 0.75f, sj4Var.A);
                sj4Var.x = (int) (sj4Var.h() * sj4Var.z);
                sa8 sa8Var = sj4Var.b;
                int Q0 = sa8Var.Q0();
                int S1 = sa8Var.S1();
                if (Q0 > 0 && S1 > 0) {
                    f = S1 / Q0;
                } else {
                    f = 0.5625f;
                }
                sj4Var.y = (int) (((int) (sj4.i(f) * f)) * sj4Var.z);
                gl.d3(new s54(this, (byte) 19));
                if (scaleGestureDetector.getFocusX() >= gl.q.x / 2.0f) {
                    m = (i2 - sj4Var.x) - sj4.m();
                } else {
                    m = sj4.m();
                }
                yla ylaVar = sj4Var.D;
                if (!ylaVar.f) {
                    ylaVar.b = sj4Var.B;
                    ylaVar.c = true;
                    ylaVar.m.i = m;
                } else {
                    ylaVar.m.i = m;
                }
                ylaVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f3 = sj4Var.y;
                float e = sj4.e(focusY2 - (f3 / 2.0f), f3);
                yla ylaVar2 = sj4Var.E;
                if (!ylaVar2.f) {
                    ylaVar2.b = sj4Var.C;
                    ylaVar2.c = true;
                    ylaVar2.m.i = e;
                } else {
                    ylaVar2.m.i = e;
                }
                ylaVar2.h();
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float f;
        switch (this.a) {
            case 0:
                break;
            default:
                sj4 sj4Var = (sj4) this.b;
                WindowManager.LayoutParams layoutParams = sj4Var.e;
                sa8 sa8Var = sj4Var.b;
                if (sj4Var.r) {
                    sj4Var.r = false;
                    sj4Var.L = false;
                    sa8Var.L0();
                    gl.r(sj4Var.N);
                }
                sj4Var.s = true;
                layoutParams.width = (int) (sj4Var.h() * sj4Var.A);
                int Q0 = sa8Var.Q0();
                int S1 = sa8Var.S1();
                if (Q0 > 0 && S1 > 0) {
                    f = S1 / Q0;
                } else {
                    f = 0.5625f;
                }
                layoutParams.height = (int) (((int) (sj4.i(f) * f)) * sj4Var.A);
                sj4Var.r();
                break;
        }
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                return;
            default:
                qj4 b = qj4.b();
                sj4 sj4Var = (sj4) this.b;
                b.a.edit().putFloat("scale_factor", sj4Var.z).apply();
                if (!sj4Var.D.f && !sj4Var.E.f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                nj4 nj4Var = new nj4(this, arrayList);
                yla ylaVar = sj4Var.D;
                if (!ylaVar.f) {
                    arrayList.add(ylaVar);
                } else {
                    ylaVar.a(nj4Var);
                }
                yla ylaVar2 = sj4Var.E;
                if (!ylaVar2.f) {
                    arrayList.add(ylaVar2);
                    return;
                } else {
                    ylaVar2.a(nj4Var);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
