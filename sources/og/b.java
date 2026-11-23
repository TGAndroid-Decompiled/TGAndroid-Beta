package og;

import android.content.SharedPreferences;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.m9;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.Crop.CropAreaView;
import ug.u1;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f21921a;
    public final Object f21922b;

    public b(Object obj, int i7) {
        this.f21921a = i7;
        this.f21922b = obj;
    }

    public void b() {
        float f10;
        wi.h hVar = (wi.h) this.f21922b;
        WindowManager.LayoutParams layoutParams = hVar.f60077e;
        int h = (int) (hVar.h() * hVar.f60096z);
        layoutParams.width = h;
        hVar.f60094x = h;
        wi.l lVar = hVar.f60075b;
        int b12 = lVar.b1();
        int V1 = lVar.V1();
        if (b12 > 0 && V1 > 0) {
            f10 = V1 / b12;
        } else {
            f10 = 0.5625f;
        }
        int i7 = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f60096z);
        layoutParams.height = i7;
        hVar.f60095y = i7;
        hVar.r();
        hVar.f60074a.f60116b.f();
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i7;
        float f10;
        int i10;
        float m10;
        switch (this.f21921a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                o oVar = ((c) this.f21922b).f21924b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = oVar.f21987a;
                ImageView imageView = oVar.f21988b;
                if (!oVar.G) {
                    float f11 = oVar.M.f21980e;
                    if (f11 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f11;
                    }
                    if (!oVar.f21993r) {
                        i7 = g0.f24220m;
                    } else {
                        i7 = 0;
                    }
                    m.g(oVar.M, scaleFactor, m.a(oVar.M) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), m.b(oVar.M) * (f3.y((imageView.getHeight() - oVar.E) - i7, oVar.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    oVar.r(false);
                }
                return true;
            default:
                wi.h hVar = (wi.h) this.f21922b;
                hVar.f60096z = m9.a(scaleGestureDetector.getScaleFactor() * hVar.f60096z, 0.75f, hVar.A);
                hVar.f60094x = (int) (hVar.h() * hVar.f60096z);
                wi.l lVar = hVar.f60075b;
                int b12 = lVar.b1();
                int V1 = lVar.V1();
                if (b12 > 0 && V1 > 0) {
                    f10 = V1 / b12;
                } else {
                    f10 = 0.5625f;
                }
                hVar.f60095y = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f60096z);
                g0.g3(new u1(this, 11));
                if (scaleGestureDetector.getFocusX() >= g0.f24226q.x / 2.0f) {
                    m10 = (i10 - hVar.f60094x) - wi.h.m();
                } else {
                    m10 = wi.h.m();
                }
                r1.g gVar = hVar.D;
                if (!gVar.f56440f) {
                    gVar.f56437b = hVar.B;
                    gVar.f56438c = true;
                    gVar.f56446m.f56454i = m10;
                } else {
                    gVar.f56446m.f56454i = m10;
                }
                gVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f12 = hVar.f60095y;
                float e10 = wi.h.e(focusY2 - (f12 / 2.0f), f12);
                r1.g gVar2 = hVar.E;
                if (!gVar2.f56440f) {
                    gVar2.f56437b = hVar.C;
                    gVar2.f56438c = true;
                    gVar2.f56446m.f56454i = e10;
                } else {
                    gVar2.f56446m.f56454i = e10;
                }
                gVar2.h();
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float f10;
        switch (this.f21921a) {
            case 0:
                return true;
            default:
                wi.h hVar = (wi.h) this.f21922b;
                WindowManager.LayoutParams layoutParams = hVar.f60077e;
                wi.l lVar = hVar.f60075b;
                if (hVar.f60089r) {
                    hVar.f60089r = false;
                    hVar.L = false;
                    lVar.T0();
                    g0.r(hVar.N);
                }
                hVar.f60090s = true;
                layoutParams.width = (int) (hVar.h() * hVar.A);
                int b12 = lVar.b1();
                int V1 = lVar.V1();
                if (b12 > 0 && V1 > 0) {
                    f10 = V1 / b12;
                } else {
                    f10 = 0.5625f;
                }
                layoutParams.height = (int) (((int) (wi.h.i(f10) * f10)) * hVar.A);
                hVar.r();
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f21921a) {
            case 0:
                return;
            default:
                aa F2 = aa.F2();
                wi.h hVar = (wi.h) this.f21922b;
                ((SharedPreferences) F2.f30491b).edit().putFloat("scale_factor", hVar.f60096z).apply();
                if (!hVar.D.f56440f && !hVar.E.f56440f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                wi.f fVar = new wi.f(this, arrayList);
                r1.g gVar = hVar.D;
                if (!gVar.f56440f) {
                    arrayList.add(gVar);
                } else {
                    gVar.a(fVar);
                }
                r1.g gVar2 = hVar.E;
                if (!gVar2.f56440f) {
                    arrayList.add(gVar2);
                    return;
                } else {
                    gVar2.a(fVar);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
