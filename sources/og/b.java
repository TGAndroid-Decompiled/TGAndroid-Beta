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
    public final int f20941a;
    public final Object f20942b;

    public b(Object obj, int i7) {
        this.f20941a = i7;
        this.f20942b = obj;
    }

    public void b() {
        float f10;
        ti.i iVar = (ti.i) this.f20942b;
        WindowManager.LayoutParams layoutParams = iVar.f56085e;
        int h = (int) (iVar.h() * iVar.f56104z);
        layoutParams.width = h;
        iVar.f56102x = h;
        ti.m mVar = iVar.f56083b;
        int I = mVar.I();
        int U = mVar.U();
        if (I > 0 && U > 0) {
            f10 = U / I;
        } else {
            f10 = 0.5625f;
        }
        int i7 = (int) (((int) (ti.i.i(f10) * f10)) * iVar.f56104z);
        layoutParams.height = i7;
        iVar.f56103y = i7;
        iVar.r();
        iVar.f56082a.f56124b.f();
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i7;
        float f10;
        int i10;
        float m10;
        switch (this.f20941a) {
            case 0:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                o oVar = ((c) this.f20942b).f20944b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = oVar.f21007a;
                ImageView imageView = oVar.f21008b;
                if (!oVar.F) {
                    float f11 = oVar.L.f21000e;
                    if (f11 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f11;
                    }
                    if (!oVar.f21013r) {
                        i7 = g0.f22557m;
                    } else {
                        i7 = 0;
                    }
                    m.g(oVar.L, scaleFactor, m.a(oVar.L) * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), m.b(oVar.L) * (k5.y((imageView.getHeight() - oVar.D) - i7, oVar.E, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    oVar.r(false);
                }
                return true;
            default:
                ti.i iVar = (ti.i) this.f20942b;
                iVar.f56104z = j9.a(scaleGestureDetector.getScaleFactor() * iVar.f56104z, 0.75f, iVar.A);
                iVar.f56102x = (int) (iVar.h() * iVar.f56104z);
                ti.m mVar = iVar.f56083b;
                int I = mVar.I();
                int U = mVar.U();
                if (I > 0 && U > 0) {
                    f10 = U / I;
                } else {
                    f10 = 0.5625f;
                }
                iVar.f56103y = (int) (((int) (ti.i.i(f10) * f10)) * iVar.f56104z);
                g0.h3(new t0(this, 10));
                if (scaleGestureDetector.getFocusX() >= g0.f22563q.x / 2.0f) {
                    m10 = (i10 - iVar.f56102x) - ti.i.m();
                } else {
                    m10 = ti.i.m();
                }
                r1.g gVar = iVar.D;
                if (!gVar.f54262f) {
                    gVar.f54259b = iVar.B;
                    gVar.f54260c = true;
                    gVar.f54268m.f54276i = m10;
                } else {
                    gVar.f54268m.f54276i = m10;
                }
                gVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f12 = iVar.f56103y;
                float e10 = ti.i.e(focusY2 - (f12 / 2.0f), f12);
                r1.g gVar2 = iVar.E;
                if (!gVar2.f54262f) {
                    gVar2.f54259b = iVar.C;
                    gVar2.f54260c = true;
                    gVar2.f54268m.f54276i = e10;
                } else {
                    gVar2.f54268m.f54276i = e10;
                }
                gVar2.h();
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float f10;
        switch (this.f20941a) {
            case 0:
                return true;
            default:
                ti.i iVar = (ti.i) this.f20942b;
                WindowManager.LayoutParams layoutParams = iVar.f56085e;
                ti.m mVar = iVar.f56083b;
                if (iVar.f56097r) {
                    iVar.f56097r = false;
                    iVar.L = false;
                    mVar.F();
                    g0.r(iVar.N);
                }
                iVar.f56098s = true;
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
        switch (this.f20941a) {
            case 0:
                return;
            default:
                d0 b10 = d0.b();
                ti.i iVar = (ti.i) this.f20942b;
                b10.f918a.edit().putFloat("scale_factor", iVar.f56104z).apply();
                if (!iVar.D.f54262f && !iVar.E.f54262f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ti.g gVar = new ti.g(this, arrayList);
                r1.g gVar2 = iVar.D;
                if (!gVar2.f54262f) {
                    arrayList.add(gVar2);
                } else {
                    gVar2.a(gVar);
                }
                r1.g gVar3 = iVar.E;
                if (!gVar3.f54262f) {
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
