package defpackage;

import android.content.SharedPreferences;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class f43 implements ScaleGestureDetector.OnScaleGestureListener {
    public final byte a;
    public final Object b;

    public f43(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b() {
        float f;
        tl4 tl4Var = (tl4) this.b;
        WindowManager.LayoutParams layoutParams = tl4Var.e;
        int h = (int) (tl4Var.h() * tl4Var.z);
        layoutParams.width = h;
        tl4Var.x = h;
        vc8 vc8Var = tl4Var.b;
        int S = vc8Var.S();
        int o0 = vc8Var.o0();
        if (S > 0 && o0 > 0) {
            f = o0 / S;
        } else {
            f = 0.5625f;
        }
        int i = (int) (((int) (tl4.i(f) * f)) * tl4Var.z);
        layoutParams.height = i;
        tl4Var.y = i;
        tl4Var.r();
        tl4Var.a.b.d();
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
                u43 u43Var = ((g43) obj).b;
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = u43Var.a;
                ImageView imageView = u43Var.b;
                if (u43Var.G) {
                    return true;
                }
                float f2 = u43Var.M.e;
                if (f2 * scaleFactor > 30.0f) {
                    scaleFactor = 30.0f / f2;
                }
                if (!u43Var.r) {
                    i = gm.m;
                } else {
                    i = 0;
                }
                u43Var.M.f(scaleFactor, u43Var.M.b() * ((focusX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), u43Var.M.a() * (td4.y((imageView.getHeight() - u43Var.E) - i, u43Var.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                u43Var.r(false);
                return true;
            default:
                tl4 tl4Var = (tl4) obj;
                tl4Var.z = pqe.a(scaleGestureDetector.getScaleFactor() * tl4Var.z, 0.75f, tl4Var.A);
                tl4Var.x = (int) (tl4Var.h() * tl4Var.z);
                vc8 vc8Var = tl4Var.b;
                int S = vc8Var.S();
                int o0 = vc8Var.o0();
                if (S > 0 && o0 > 0) {
                    f = o0 / S;
                } else {
                    f = 0.5625f;
                }
                tl4Var.y = (int) (((int) (tl4.i(f) * f)) * tl4Var.z);
                gm.c3(new a14(this, (byte) 26));
                if (scaleGestureDetector.getFocusX() >= gm.q.x / 2.0f) {
                    m = (i2 - tl4Var.x) - tl4.m();
                } else {
                    m = tl4.m();
                }
                zna znaVar = tl4Var.D;
                if (!znaVar.f) {
                    znaVar.b = tl4Var.B;
                    znaVar.c = true;
                    znaVar.m.i = m;
                } else {
                    znaVar.m.i = m;
                }
                znaVar.h();
                float focusY2 = scaleGestureDetector.getFocusY();
                float f3 = tl4Var.y;
                float e = tl4.e(focusY2 - (f3 / 2.0f), f3);
                zna znaVar2 = tl4Var.E;
                if (!znaVar2.f) {
                    znaVar2.b = tl4Var.C;
                    znaVar2.c = true;
                    znaVar2.m.i = e;
                } else {
                    znaVar2.m.i = e;
                }
                znaVar2.h();
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
                tl4 tl4Var = (tl4) this.b;
                WindowManager.LayoutParams layoutParams = tl4Var.e;
                vc8 vc8Var = tl4Var.b;
                if (tl4Var.r) {
                    tl4Var.r = false;
                    tl4Var.L = false;
                    vc8Var.R();
                    gm.r(tl4Var.N);
                }
                tl4Var.s = true;
                layoutParams.width = (int) (tl4Var.h() * tl4Var.A);
                int S = vc8Var.S();
                int o0 = vc8Var.o0();
                if (S > 0 && o0 > 0) {
                    f = o0 / S;
                } else {
                    f = 0.5625f;
                }
                layoutParams.height = (int) (((int) (tl4.i(f) * f)) * tl4Var.A);
                tl4Var.r();
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
                lj4 t = lj4.t();
                tl4 tl4Var = (tl4) this.b;
                ((SharedPreferences) t.a).edit().putFloat("scale_factor", tl4Var.z).apply();
                if (!tl4Var.D.f && !tl4Var.E.f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                rl4 rl4Var = new rl4(this, arrayList);
                zna znaVar = tl4Var.D;
                if (!znaVar.f) {
                    arrayList.add(znaVar);
                } else {
                    znaVar.a(rl4Var);
                }
                zna znaVar2 = tl4Var.E;
                if (!znaVar2.f) {
                    arrayList.add(znaVar2);
                    return;
                } else {
                    znaVar2.a(rl4Var);
                    return;
                }
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
