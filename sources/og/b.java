package og;

import android.content.SharedPreferences;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.m9;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.jn;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f21821a;
    public final Object f21822b;

    public b(Object obj, int i7) {
        this.f21821a = i7;
        this.f21822b = obj;
    }

    public void b() {
        float f10;
        wi.h hVar = (wi.h) this.f21822b;
        WindowManager.LayoutParams layoutParams = hVar.f59959e;
        int h = (int) (hVar.h() * hVar.f59978z);
        layoutParams.width = h;
        hVar.f59976x = h;
        wi.l lVar = hVar.f59957b;
        int J = lVar.J();
        int a02 = lVar.a0();
        if (J > 0 && a02 > 0) {
            f10 = a02 / J;
        } else {
            f10 = 0.5625f;
        }
        int i7 = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f59978z);
        layoutParams.height = i7;
        hVar.f59977y = i7;
        hVar.r();
        hVar.f59956a.f59998b.f();
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i7;
        float f10;
        int i10;
        float m10;
        switch (this.f21821a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                o oVar = ((c) this.f21822b).f21824b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = oVar.f21887a;
                ImageView imageView = oVar.f21888b;
                if (!oVar.G) {
                    float f11 = oVar.M.f21880e;
                    if (f11 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f11;
                    }
                    if (!oVar.f21893r) {
                        i7 = g0.f24004m;
                    } else {
                        i7 = 0;
                    }
                    m.g(oVar.M, scaleFactor, m.a(oVar.M) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), m.b(oVar.M) * (f3.y((imageView.getHeight() - oVar.E) - i7, oVar.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    oVar.r(false);
                }
                return true;
            default:
                wi.h hVar = (wi.h) this.f21822b;
                hVar.f59978z = m9.a(scaleGestureDetector.getScaleFactor() * hVar.f59978z, 0.75f, hVar.A);
                hVar.f59976x = (int) (hVar.h() * hVar.f59978z);
                wi.l lVar = hVar.f59957b;
                int J = lVar.J();
                int a02 = lVar.a0();
                if (J > 0 && a02 > 0) {
                    f10 = a02 / J;
                } else {
                    f10 = 0.5625f;
                }
                hVar.f59977y = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f59978z);
                g0.g3(new vg.d(this, 9));
                if (scaleGestureDetector.getFocusX() >= g0.f24010q.x / 2.0f) {
                    m10 = (i10 - hVar.f59976x) - wi.h.m();
                } else {
                    m10 = wi.h.m();
                }
                r1.g gVar = hVar.D;
                if (!gVar.f56327f) {
                    gVar.f56324b = hVar.B;
                    gVar.f56325c = true;
                    gVar.f56333m.f56341i = m10;
                } else {
                    gVar.f56333m.f56341i = m10;
                }
                gVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f12 = hVar.f59977y;
                float e10 = wi.h.e(focusY2 - (f12 / 2.0f), f12);
                r1.g gVar2 = hVar.E;
                if (!gVar2.f56327f) {
                    gVar2.f56324b = hVar.C;
                    gVar2.f56325c = true;
                    gVar2.f56333m.f56341i = e10;
                } else {
                    gVar2.f56333m.f56341i = e10;
                }
                gVar2.h();
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float f10;
        switch (this.f21821a) {
            case 0:
                return true;
            default:
                wi.h hVar = (wi.h) this.f21822b;
                WindowManager.LayoutParams layoutParams = hVar.f59959e;
                wi.l lVar = hVar.f59957b;
                if (hVar.f59971r) {
                    hVar.f59971r = false;
                    hVar.L = false;
                    lVar.H();
                    g0.r(hVar.N);
                }
                hVar.f59972s = true;
                layoutParams.width = (int) (hVar.h() * hVar.A);
                int J = lVar.J();
                int a02 = lVar.a0();
                if (J > 0 && a02 > 0) {
                    f10 = a02 / J;
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
        switch (this.f21821a) {
            case 0:
                return;
            default:
                jn m10 = jn.m();
                wi.h hVar = (wi.h) this.f21822b;
                ((SharedPreferences) m10.f36522b).edit().putFloat("scale_factor", hVar.f59978z).apply();
                if (!hVar.D.f56327f && !hVar.E.f56327f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                wi.f fVar = new wi.f(this, arrayList);
                r1.g gVar = hVar.D;
                if (!gVar.f56327f) {
                    arrayList.add(gVar);
                } else {
                    gVar.a(fVar);
                }
                r1.g gVar2 = hVar.E;
                if (!gVar2.f56327f) {
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
