package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class j31 extends GestureDetector.SimpleOnGestureListener {
    public final y21 a;
    public final k21 b;

    public j31(k21 k21Var, y21 y21Var) {
        this.b = k21Var;
        this.a = y21Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        k21 k21Var = this.b;
        if (k21Var.s) {
            return false;
        }
        y21 y21Var = this.a;
        k21Var.w = y21.access$1600(y21Var, true);
        k21Var.x = y21.access$1600(y21Var, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        if (Math.abs(f) <= 2000.0f) {
            return false;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        k21 k21Var = this.b;
        if ((i < 0 && k21Var.w) || (f > 0.0f && k21Var.x)) {
            z = true;
        } else {
            z = false;
        }
        float signum = Math.signum(f);
        y21 y21Var = this.a;
        zna znaVar = new zna(y21Var, zna.o, signum * y21Var.getWidth() * 2.0f);
        if (!z) {
            znaVar.a(new ht3(this) {
                public final j31 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(zna znaVar2, boolean z2, float f3, float f4) {
                    byte b = r2;
                    j31 j31Var = this.b;
                    switch (b) {
                        case 0:
                            j31Var.b.E.b();
                            return;
                        default:
                            j31Var.b.E.b();
                            return;
                    }
                }
            });
            znaVar.b(new h20(y21Var, (byte) 2));
        }
        znaVar.m.a(1.0f);
        znaVar.m.b(100.0f);
        znaVar.a = f;
        znaVar.h();
        if (z) {
            zna znaVar2 = new zna((Object) y21Var, (vk4) zna.v, 0.0f);
            znaVar2.a(new ht3(this) {
                public final j31 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(zna znaVar22, boolean z2, float f3, float f4) {
                    byte b = r2;
                    j31 j31Var = this.b;
                    switch (b) {
                        case 0:
                            j31Var.b.E.b();
                            return;
                        default:
                            j31Var.b.E.b();
                            return;
                    }
                }
            });
            znaVar2.b(new Object());
            znaVar.m.a(1.0f);
            znaVar.m.b(10.0f);
            znaVar.a = f;
            znaVar2.h();
        }
        k21Var.s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        k21 k21Var = this.b;
        float f3 = k21Var.h + f;
        k21Var.h = f3;
        float f4 = k21Var.n + f2;
        k21Var.n = f4;
        if (Utilities.t(0.0f, 0.0f, f3, f4) > gm.e) {
            k21Var.r = true;
        }
        if (!k21Var.d) {
            return false;
        }
        float f5 = k21Var.f - f;
        k21Var.f = f5;
        y21 y21Var = this.a;
        y21Var.setTranslationX(f5);
        float f6 = k21Var.f;
        int i = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        if (i != 0 && ((f6 >= 0.0f || !k21Var.w) && (i <= 0 || !k21Var.x))) {
            return true;
        }
        y21Var.setAlpha(1.0f - (Math.abs(f6) / y21Var.getWidth()));
        return true;
    }
}
