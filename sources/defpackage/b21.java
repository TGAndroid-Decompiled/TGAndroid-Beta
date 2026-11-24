package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class b21 extends GestureDetector.SimpleOnGestureListener {
    public final q11 a;
    public final c11 b;

    public b21(c11 c11Var, q11 q11Var) {
        this.b = c11Var;
        this.a = q11Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        c11 c11Var = this.b;
        if (c11Var.s) {
            return false;
        }
        q11 q11Var = this.a;
        c11Var.w = q11.access$1600(q11Var, true);
        c11Var.x = q11.access$1600(q11Var, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        if (Math.abs(f) <= 2000.0f) {
            return false;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        c11 c11Var = this.b;
        if ((i < 0 && c11Var.w) || (f > 0.0f && c11Var.x)) {
            z = true;
        } else {
            z = false;
        }
        float signum = Math.signum(f);
        q11 q11Var = this.a;
        yla ylaVar = new yla(q11Var, yla.o, signum * q11Var.getWidth() * 2.0f);
        if (!z) {
            ylaVar.a(new xr3(this) {
                public final b21 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(yla ylaVar2, boolean z2, float f3, float f4) {
                    byte b = r2;
                    b21 b21Var = this.b;
                    switch (b) {
                        case 0:
                            b21Var.b.E.b();
                            return;
                        default:
                            b21Var.b.E.b();
                            return;
                    }
                }
            });
            ylaVar.b(new h10(q11Var, (byte) 2));
        }
        ylaVar.m.a(1.0f);
        ylaVar.m.b(100.0f);
        ylaVar.a = f;
        ylaVar.h();
        if (z) {
            yla ylaVar2 = new yla((Object) q11Var, (ri4) yla.v, 0.0f);
            ylaVar2.a(new xr3(this) {
                public final b21 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(yla ylaVar22, boolean z2, float f3, float f4) {
                    byte b = r2;
                    b21 b21Var = this.b;
                    switch (b) {
                        case 0:
                            b21Var.b.E.b();
                            return;
                        default:
                            b21Var.b.E.b();
                            return;
                    }
                }
            });
            ylaVar2.b(new Object());
            ylaVar.m.a(1.0f);
            ylaVar.m.b(10.0f);
            ylaVar.a = f;
            ylaVar2.h();
        }
        c11Var.s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        c11 c11Var = this.b;
        float f3 = c11Var.h + f;
        c11Var.h = f3;
        float f4 = c11Var.n + f2;
        c11Var.n = f4;
        if (Utilities.t(0.0f, 0.0f, f3, f4) > gl.e) {
            c11Var.r = true;
        }
        if (!c11Var.d) {
            return false;
        }
        float f5 = c11Var.f - f;
        c11Var.f = f5;
        q11 q11Var = this.a;
        q11Var.setTranslationX(f5);
        float f6 = c11Var.f;
        int i = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        if (i != 0 && ((f6 >= 0.0f || !c11Var.w) && (i <= 0 || !c11Var.x))) {
            return true;
        }
        q11Var.setAlpha(1.0f - (Math.abs(f6) / q11Var.getWidth()));
        return true;
    }
}
