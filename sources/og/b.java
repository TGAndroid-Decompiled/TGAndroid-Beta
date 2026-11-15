package og;

import android.content.SharedPreferences;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.i9;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f21464a;
    public final Object f21465b;

    public b(Object obj, int i7) {
        this.f21464a = i7;
        this.f21465b = obj;
    }

    public void b() {
        float f10;
        wi.h hVar = (wi.h) this.f21465b;
        WindowManager.LayoutParams layoutParams = hVar.f59384e;
        int h = (int) (hVar.h() * hVar.f59403z);
        layoutParams.width = h;
        hVar.f59401x = h;
        wi.l lVar = hVar.f59382b;
        int L = lVar.L();
        int b02 = lVar.b0();
        if (L > 0 && b02 > 0) {
            f10 = b02 / L;
        } else {
            f10 = 0.5625f;
        }
        int i7 = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f59403z);
        layoutParams.height = i7;
        hVar.f59402y = i7;
        hVar.r();
        hVar.f59381a.f59423b.f();
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i7;
        float f10;
        int i10;
        float m10;
        switch (this.f21464a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                o oVar = ((c) this.f21465b).f21467b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = oVar.f21530a;
                ImageView imageView = oVar.f21531b;
                if (!oVar.G) {
                    float f11 = oVar.M.f21523e;
                    if (f11 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f11;
                    }
                    if (!oVar.f21536r) {
                        i7 = g0.f23605m;
                    } else {
                        i7 = 0;
                    }
                    m.g(oVar.M, scaleFactor, m.a(oVar.M) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), m.b(oVar.M) * (k5.y((imageView.getHeight() - oVar.E) - i7, oVar.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    oVar.r(false);
                }
                return true;
            default:
                wi.h hVar = (wi.h) this.f21465b;
                hVar.f59403z = i9.a(scaleGestureDetector.getScaleFactor() * hVar.f59403z, 0.75f, hVar.A);
                hVar.f59401x = (int) (hVar.h() * hVar.f59403z);
                wi.l lVar = hVar.f59382b;
                int L = lVar.L();
                int b02 = lVar.b0();
                if (L > 0 && b02 > 0) {
                    f10 = b02 / L;
                } else {
                    f10 = 0.5625f;
                }
                hVar.f59402y = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f59403z);
                g0.h3(new vg.o(this, 8));
                if (scaleGestureDetector.getFocusX() >= g0.f23611q.x / 2.0f) {
                    m10 = (i10 - hVar.f59401x) - wi.h.m();
                } else {
                    m10 = wi.h.m();
                }
                r1.g gVar = hVar.D;
                if (!gVar.f55742f) {
                    gVar.f55739b = hVar.B;
                    gVar.f55740c = true;
                    gVar.f55748m.f55756i = m10;
                } else {
                    gVar.f55748m.f55756i = m10;
                }
                gVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f12 = hVar.f59402y;
                float e10 = wi.h.e(focusY2 - (f12 / 2.0f), f12);
                r1.g gVar2 = hVar.E;
                if (!gVar2.f55742f) {
                    gVar2.f55739b = hVar.C;
                    gVar2.f55740c = true;
                    gVar2.f55748m.f55756i = e10;
                } else {
                    gVar2.f55748m.f55756i = e10;
                }
                gVar2.h();
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float f10;
        switch (this.f21464a) {
            case 0:
                return true;
            default:
                wi.h hVar = (wi.h) this.f21465b;
                WindowManager.LayoutParams layoutParams = hVar.f59384e;
                wi.l lVar = hVar.f59382b;
                if (hVar.f59396r) {
                    hVar.f59396r = false;
                    hVar.L = false;
                    lVar.G();
                    g0.r(hVar.N);
                }
                hVar.f59397s = true;
                layoutParams.width = (int) (hVar.h() * hVar.A);
                int L = lVar.L();
                int b02 = lVar.b0();
                if (L > 0 && b02 > 0) {
                    f10 = b02 / L;
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
        switch (this.f21464a) {
            case 0:
                return;
            default:
                u7.i b10 = u7.i.b();
                wi.h hVar = (wi.h) this.f21465b;
                ((SharedPreferences) b10.f57880a).edit().putFloat("scale_factor", hVar.f59403z).apply();
                if (!hVar.D.f55742f && !hVar.E.f55742f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                wi.f fVar = new wi.f(this, arrayList);
                r1.g gVar = hVar.D;
                if (!gVar.f55742f) {
                    arrayList.add(gVar);
                } else {
                    gVar.a(fVar);
                }
                r1.g gVar2 = hVar.E;
                if (!gVar2.f55742f) {
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
