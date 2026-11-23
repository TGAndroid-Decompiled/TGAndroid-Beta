package og;

import android.content.SharedPreferences;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import c8.l9;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.jn;
import v4.p;
public final class b implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f21855a;
    public final Object f21856b;

    public b(Object obj, int i7) {
        this.f21855a = i7;
        this.f21856b = obj;
    }

    public void b() {
        float f10;
        wi.h hVar = (wi.h) this.f21856b;
        WindowManager.LayoutParams layoutParams = hVar.f59994e;
        int h = (int) (hVar.h() * hVar.f60013z);
        layoutParams.width = h;
        hVar.f60011x = h;
        wi.l lVar = hVar.f59992b;
        int J = lVar.J();
        int a02 = lVar.a0();
        if (J > 0 && a02 > 0) {
            f10 = a02 / J;
        } else {
            f10 = 0.5625f;
        }
        int i7 = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f60013z);
        layoutParams.height = i7;
        hVar.f60012y = i7;
        hVar.r();
        hVar.f59991a.f60033b.f();
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i7;
        float f10;
        int i10;
        float m10;
        switch (this.f21855a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                o oVar = ((c) this.f21856b).f21858b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = oVar.f21921a;
                ImageView imageView = oVar.f21922b;
                if (!oVar.G) {
                    float f11 = oVar.M.f21914e;
                    if (f11 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f11;
                    }
                    if (!oVar.f21927r) {
                        i7 = g0.f24040m;
                    } else {
                        i7 = 0;
                    }
                    m.g(oVar.M, scaleFactor, m.a(oVar.M) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), m.b(oVar.M) * (f3.y((imageView.getHeight() - oVar.E) - i7, oVar.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    oVar.r(false);
                }
                return true;
            default:
                wi.h hVar = (wi.h) this.f21856b;
                hVar.f60013z = l9.a(scaleGestureDetector.getScaleFactor() * hVar.f60013z, 0.75f, hVar.A);
                hVar.f60011x = (int) (hVar.h() * hVar.f60013z);
                wi.l lVar = hVar.f59992b;
                int J = lVar.J();
                int a02 = lVar.a0();
                if (J > 0 && a02 > 0) {
                    f10 = a02 / J;
                } else {
                    f10 = 0.5625f;
                }
                hVar.f60012y = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f60013z);
                g0.g3(new p(this, 10));
                if (scaleGestureDetector.getFocusX() >= g0.f24046q.x / 2.0f) {
                    m10 = (i10 - hVar.f60011x) - wi.h.m();
                } else {
                    m10 = wi.h.m();
                }
                r1.g gVar = hVar.D;
                if (!gVar.f56362f) {
                    gVar.f56359b = hVar.B;
                    gVar.f56360c = true;
                    gVar.f56368m.f56376i = m10;
                } else {
                    gVar.f56368m.f56376i = m10;
                }
                gVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f12 = hVar.f60012y;
                float e10 = wi.h.e(focusY2 - (f12 / 2.0f), f12);
                r1.g gVar2 = hVar.E;
                if (!gVar2.f56362f) {
                    gVar2.f56359b = hVar.C;
                    gVar2.f56360c = true;
                    gVar2.f56368m.f56376i = e10;
                } else {
                    gVar2.f56368m.f56376i = e10;
                }
                gVar2.h();
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float f10;
        switch (this.f21855a) {
            case 0:
                return true;
            default:
                wi.h hVar = (wi.h) this.f21856b;
                WindowManager.LayoutParams layoutParams = hVar.f59994e;
                wi.l lVar = hVar.f59992b;
                if (hVar.f60006r) {
                    hVar.f60006r = false;
                    hVar.L = false;
                    lVar.H();
                    g0.r(hVar.N);
                }
                hVar.f60007s = true;
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
        switch (this.f21855a) {
            case 0:
                return;
            default:
                jn m10 = jn.m();
                wi.h hVar = (wi.h) this.f21856b;
                ((SharedPreferences) m10.f36567b).edit().putFloat("scale_factor", hVar.f60013z).apply();
                if (!hVar.D.f56362f && !hVar.E.f56362f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                wi.f fVar = new wi.f(this, arrayList);
                r1.g gVar = hVar.D;
                if (!gVar.f56362f) {
                    arrayList.add(gVar);
                } else {
                    gVar.a(fVar);
                }
                r1.g gVar2 = hVar.E;
                if (!gVar2.f56362f) {
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
