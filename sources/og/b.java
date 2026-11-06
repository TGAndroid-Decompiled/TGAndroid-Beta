package og;

import ab.d0;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.j9;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.Crop.CropAreaView;
import sg.t0;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f20938a;
    public final Object f20939b;

    public b(Object obj, int i7) {
        this.f20938a = i7;
        this.f20939b = obj;
    }

    public void b() {
        float f10;
        ti.i iVar = (ti.i) this.f20939b;
        WindowManager.LayoutParams layoutParams = iVar.f55968e;
        int h = (int) (iVar.h() * iVar.f55987z);
        layoutParams.width = h;
        iVar.f55985x = h;
        ti.m mVar = iVar.f55966b;
        int I = mVar.I();
        int U = mVar.U();
        if (I > 0 && U > 0) {
            f10 = U / I;
        } else {
            f10 = 0.5625f;
        }
        int i7 = (int) (((int) (ti.i.i(f10) * f10)) * iVar.f55987z);
        layoutParams.height = i7;
        iVar.f55986y = i7;
        iVar.r();
        iVar.f55965a.f56007b.f();
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i7;
        float f10;
        int i10;
        float m10;
        switch (this.f20938a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                o oVar = ((c) this.f20939b).f20941b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = oVar.f21004a;
                ImageView imageView = oVar.f21005b;
                if (!oVar.F) {
                    float f11 = oVar.L.f20997e;
                    if (f11 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f11;
                    }
                    if (!oVar.f21010r) {
                        i7 = g0.f22531m;
                    } else {
                        i7 = 0;
                    }
                    m.g(oVar.L, scaleFactor, m.a(oVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), m.b(oVar.L) * (k5.y((imageView.getHeight() - oVar.D) - i7, oVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    oVar.r(false);
                }
                return true;
            default:
                ti.i iVar = (ti.i) this.f20939b;
                iVar.f55987z = j9.a(scaleGestureDetector.getScaleFactor() * iVar.f55987z, 0.75f, iVar.A);
                iVar.f55985x = (int) (iVar.h() * iVar.f55987z);
                ti.m mVar = iVar.f55966b;
                int I = mVar.I();
                int U = mVar.U();
                if (I > 0 && U > 0) {
                    f10 = U / I;
                } else {
                    f10 = 0.5625f;
                }
                iVar.f55986y = (int) (((int) (ti.i.i(f10) * f10)) * iVar.f55987z);
                g0.h3(new t0(this, 10));
                if (scaleGestureDetector.getFocusX() >= g0.f22537q.x / 2.0f) {
                    m10 = (i10 - iVar.f55985x) - ti.i.m();
                } else {
                    m10 = ti.i.m();
                }
                r1.g gVar = iVar.D;
                if (!gVar.f54144f) {
                    gVar.f54141b = iVar.B;
                    gVar.f54142c = true;
                    gVar.f54150m.f54158i = m10;
                } else {
                    gVar.f54150m.f54158i = m10;
                }
                gVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f12 = iVar.f55986y;
                float e10 = ti.i.e(focusY2 - (f12 / 2.0f), f12);
                r1.g gVar2 = iVar.E;
                if (!gVar2.f54144f) {
                    gVar2.f54141b = iVar.C;
                    gVar2.f54142c = true;
                    gVar2.f54150m.f54158i = e10;
                } else {
                    gVar2.f54150m.f54158i = e10;
                }
                gVar2.h();
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float f10;
        switch (this.f20938a) {
            case 0:
                return true;
            default:
                ti.i iVar = (ti.i) this.f20939b;
                WindowManager.LayoutParams layoutParams = iVar.f55968e;
                ti.m mVar = iVar.f55966b;
                if (iVar.f55980r) {
                    iVar.f55980r = false;
                    iVar.L = false;
                    mVar.F();
                    g0.r(iVar.N);
                }
                iVar.f55981s = true;
                layoutParams.width = (int) (iVar.h() * iVar.A);
                int I = mVar.I();
                int U = mVar.U();
                if (I > 0 && U > 0) {
                    f10 = U / I;
                } else {
                    f10 = 0.5625f;
                }
                layoutParams.height = (int) (((int) (ti.i.i(f10) * f10)) * iVar.A);
                iVar.r();
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f20938a) {
            case 0:
                return;
            default:
                d0 b10 = d0.b();
                ti.i iVar = (ti.i) this.f20939b;
                b10.f918a.edit().putFloat("scale_factor", iVar.f55987z).apply();
                if (!iVar.D.f54144f && !iVar.E.f54144f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ti.g gVar = new ti.g(this, arrayList);
                r1.g gVar2 = iVar.D;
                if (!gVar2.f54144f) {
                    arrayList.add(gVar2);
                } else {
                    gVar2.a(gVar);
                }
                r1.g gVar3 = iVar.E;
                if (!gVar3.f54144f) {
                    arrayList.add(gVar3);
                    return;
                } else {
                    gVar3.a(gVar);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
