package defpackage;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import org.telegram.messenger.a;
public class v2d implements s2d, r2d, i1d {
    public j1d E;
    public View F;
    public int G;
    public int H;
    public final t84 a;
    public final adc b = new adc(0.0f);
    public final bdc c = new bdc();
    public final bdc d = new bdc();
    public final pn e = new pn(null);
    public final qj4 f;
    public final Runnable h;
    public boolean n;
    public l2d r;
    public byte s;
    public int w;
    public int x;
    public final u2d y;

    public v2d(Runnable runnable) {
        t2d t2dVar = new t2d(this, (byte) 0);
        ?? obj = new Object();
        obj.c = sx5.a;
        obj.d = new ea5(obj, (byte) 20);
        obj.b = t2dVar;
        Typeface typeface = hl.a;
        float f = 1.0f;
        try {
            f = Settings.Global.getFloat(a.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.a = f * 250.0f * 1.1f;
        this.f = obj;
        this.s = (byte) 1;
        this.y = new u2d(this, (byte) 0);
        this.h = runnable;
        this.a = new t84(0, new zhc(this, runnable, (byte) 3), hb.w, 250L);
    }

    @Override
    public final void P() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new u2d(this, (byte) 1));
        }
    }

    @Override
    public final View R() {
        return this.F;
    }

    public final void a() {
        boolean z = this.a.h;
        boolean z2 = this.n;
        pn pnVar = this.e;
        if (!z2 && z) {
            this.n = true;
            pnVar.d();
        }
        if (this.n && !z) {
            this.n = false;
            pnVar.e();
        }
    }

    public final float c() {
        j1d j1dVar = this.E;
        bdc bdcVar = this.d;
        if (j1dVar != null && this.H > 0) {
            return Math.max(this.G, bdcVar.d.a);
        }
        return bdcVar.d.a;
    }

    public final float d() {
        j1d j1dVar = this.E;
        bdc bdcVar = this.c;
        if (j1dVar != null && this.H > 0) {
            return Math.max(this.G, bdcVar.d.a);
        }
        return bdcVar.d.a;
    }

    public final int e() {
        if (this.E != null && this.H > 0) {
            return Math.max(this.G, Math.max(f(527).d, this.w));
        }
        return Math.max(f(527).d, this.w);
    }

    public final mq5 f(int i) {
        l2d l2dVar = this.r;
        if (l2dVar != null) {
            return l2dVar.a.f(i);
        }
        return mq5.e;
    }

    public final void g(int i) {
        if (this.w == i && this.s == 0) {
            return;
        }
        hl.r(this.y);
        this.x = Math.max(this.w, i);
        this.w = i;
        this.s = (byte) 0;
        j(this.r);
    }

    public final void h(int i) {
        if (i > 0) {
            g(i + hl.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z) {
        byte b;
        if (this.w != 0) {
            u2d u2dVar = this.y;
            hl.r(u2dVar);
            if (z) {
                b = 3;
            } else {
                b = 2;
            }
            this.s = b;
            j(this.r);
            if (z) {
                hl.d3(u2dVar, 1000L);
            }
        }
    }

    public final void j(l2d l2dVar) {
        boolean z;
        if (this.r != null) {
            z = true;
        } else {
            z = false;
        }
        k(l2dVar, z);
    }

    public final void k(l2d l2dVar, boolean z) {
        mq5 mq5Var;
        mq5 mq5Var2;
        boolean z2;
        sx5 sx5Var;
        float f;
        int i;
        t84 t84Var;
        float f2;
        l2d b = b(l2dVar);
        this.r = b;
        if (b != null) {
            i2d i2dVar = b.a;
            mq5Var = mq5.a(i2dVar.f(647), i2dVar.g(647));
            mq5Var2 = i2dVar.f(8);
        } else {
            mq5Var = mq5.e;
            mq5Var2 = mq5Var;
        }
        qj4 qj4Var = this.f;
        sx5 sx5Var2 = (sx5) qj4Var.c;
        if (mq5Var2.d > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (z2) {
                sx5Var = sx5.d;
            } else {
                sx5Var = sx5.a;
            }
        } else if (z2) {
            sx5Var = sx5.c;
        } else {
            sx5Var = sx5.b;
        }
        if (sx5Var2 != sx5Var) {
            qj4Var.a(sx5Var, false);
        }
        byte b2 = this.s;
        if (b2 == 2) {
            this.w = 0;
        }
        if (b2 == 3 && mq5Var2.d > 0) {
            this.w = 0;
        }
        mq5 a = mq5.a(mq5Var2, mq5.b(0, 0, 0, this.w));
        int i2 = a.c;
        int i3 = a.b;
        int i4 = a.a;
        int i5 = a.d;
        mq5 a2 = mq5.a(mq5Var, a);
        int i6 = a2.d;
        int i7 = a2.c;
        int i8 = a2.b;
        int i9 = a2.a;
        Runnable runnable = this.h;
        t84 t84Var2 = this.a;
        bdc bdcVar = this.d;
        bdc bdcVar2 = this.c;
        adc adcVar = this.b;
        if (z) {
            if (i5 > 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (!adcVar.b(f)) {
                t84Var = t84Var2;
                i = i7;
                if (!bdcVar2.b(i9, i8, i7, i6) && !bdcVar.b(i4, i3, i2, i5)) {
                    if (sx5Var2 != sx5Var) {
                        runnable.run();
                    }
                }
            } else {
                i = i7;
                t84Var = t84Var2;
            }
            t84Var.b();
            adcVar.c(false);
            bdcVar2.c(false);
            bdcVar.c(false);
            if (i5 > 0) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            adcVar.c = f2;
            bdcVar2.e(i9, i8, i, i6);
            bdcVar.e(i4, i3, i2, i5);
            t84 t84Var3 = t84Var;
            t84Var3.c(0.0f);
            t84Var3.a(1.0f);
        } else {
            float f3 = 0.0f;
            t84Var2.b();
            if (i5 > 0) {
                f3 = 1.0f;
            }
            adcVar.d(f3);
            bdcVar2.d(i9, i8, i7, i6);
            bdcVar.d(i4, i3, i2, i5);
            runnable.run();
        }
        a();
    }

    @Override
    public final void o(l2d l2dVar) {
        int i;
        l2d b = b(l2dVar);
        if (b != null) {
            i = b.a.f(8).d;
        } else {
            i = 0;
        }
        this.G = i;
        this.h.run();
    }

    @Override
    public final void w() {
        this.H++;
    }

    public l2d b(l2d l2dVar) {
        return l2dVar;
    }
}
