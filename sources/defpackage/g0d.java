package defpackage;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import org.telegram.messenger.a;
public class g0d implements d0d, c0d, tyc {
    public uyc E;
    public View F;
    public int G;
    public int H;
    public final h94 a;
    public final bbc b = new bbc(0.0f);
    public final cbc c = new cbc();
    public final cbc d = new cbc();
    public final po e = new po(null);
    public final sj4 f;
    public final Runnable h;
    public boolean n;
    public wzc r;
    public byte s;
    public int w;
    public int x;
    public final f0d y;

    public g0d(Runnable runnable) {
        e0d e0dVar = new e0d(this, (byte) 0);
        ?? obj = new Object();
        obj.c = nx5.a;
        obj.d = new kg5(obj, (byte) 12);
        obj.b = e0dVar;
        Typeface typeface = gm.a;
        float f = 1.0f;
        try {
            f = Settings.Global.getFloat(a.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.a = f * 250.0f * 1.1f;
        this.f = obj;
        this.s = (byte) 1;
        this.y = new f0d(this, (byte) 0);
        this.h = runnable;
        this.a = new h94(0, new rhb(this, runnable, (byte) 5), gb.w, 250L);
    }

    @Override
    public final void P() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new f0d(this, (byte) 1));
        }
    }

    @Override
    public final View R() {
        return this.F;
    }

    public final void a() {
        boolean z = this.a.h;
        boolean z2 = this.n;
        po poVar = this.e;
        if (!z2 && z) {
            this.n = true;
            poVar.d();
        }
        if (this.n && !z) {
            this.n = false;
            poVar.e();
        }
    }

    public final float c() {
        uyc uycVar = this.E;
        cbc cbcVar = this.d;
        if (uycVar != null && this.H > 0) {
            return Math.max(this.G, cbcVar.d.a);
        }
        return cbcVar.d.a;
    }

    public final float d() {
        uyc uycVar = this.E;
        cbc cbcVar = this.c;
        if (uycVar != null && this.H > 0) {
            return Math.max(this.G, cbcVar.d.a);
        }
        return cbcVar.d.a;
    }

    public final int e() {
        if (this.E != null && this.H > 0) {
            return Math.max(this.G, Math.max(f(527).d, this.w));
        }
        return Math.max(f(527).d, this.w);
    }

    public final iq5 f(int i) {
        wzc wzcVar = this.r;
        if (wzcVar != null) {
            return wzcVar.a.f(i);
        }
        return iq5.e;
    }

    public final void g(int i) {
        if (this.w == i && this.s == 0) {
            return;
        }
        gm.r(this.y);
        this.x = Math.max(this.w, i);
        this.w = i;
        this.s = (byte) 0;
        j(this.r);
    }

    public final void h(int i) {
        if (i > 0) {
            g(i + gm.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z) {
        byte b;
        if (this.w != 0) {
            f0d f0dVar = this.y;
            gm.r(f0dVar);
            if (z) {
                b = 3;
            } else {
                b = 2;
            }
            this.s = b;
            j(this.r);
            if (z) {
                gm.d3(f0dVar, 1000L);
            }
        }
    }

    public final void j(wzc wzcVar) {
        boolean z;
        if (this.r != null) {
            z = true;
        } else {
            z = false;
        }
        k(wzcVar, z);
    }

    public final void k(wzc wzcVar, boolean z) {
        iq5 iq5Var;
        iq5 iq5Var2;
        boolean z2;
        nx5 nx5Var;
        float f;
        int i;
        h94 h94Var;
        float f2;
        wzc b = b(wzcVar);
        this.r = b;
        if (b != null) {
            tzc tzcVar = b.a;
            iq5Var = iq5.a(tzcVar.f(647), tzcVar.g(647));
            iq5Var2 = tzcVar.f(8);
        } else {
            iq5Var = iq5.e;
            iq5Var2 = iq5Var;
        }
        sj4 sj4Var = this.f;
        nx5 nx5Var2 = (nx5) sj4Var.c;
        if (iq5Var2.d > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (z2) {
                nx5Var = nx5.d;
            } else {
                nx5Var = nx5.a;
            }
        } else if (z2) {
            nx5Var = nx5.c;
        } else {
            nx5Var = nx5.b;
        }
        if (nx5Var2 != nx5Var) {
            sj4Var.a(nx5Var, false);
        }
        byte b2 = this.s;
        if (b2 == 2) {
            this.w = 0;
        }
        if (b2 == 3 && iq5Var2.d > 0) {
            this.w = 0;
        }
        iq5 a = iq5.a(iq5Var2, iq5.b(0, 0, 0, this.w));
        int i2 = a.c;
        int i3 = a.b;
        int i4 = a.a;
        int i5 = a.d;
        iq5 a2 = iq5.a(iq5Var, a);
        int i6 = a2.d;
        int i7 = a2.c;
        int i8 = a2.b;
        int i9 = a2.a;
        Runnable runnable = this.h;
        h94 h94Var2 = this.a;
        cbc cbcVar = this.d;
        cbc cbcVar2 = this.c;
        bbc bbcVar = this.b;
        if (z) {
            if (i5 > 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (!bbcVar.b(f)) {
                h94Var = h94Var2;
                i = i7;
                if (!cbcVar2.b(i9, i8, i7, i6) && !cbcVar.b(i4, i3, i2, i5)) {
                    if (nx5Var2 != nx5Var) {
                        runnable.run();
                    }
                }
            } else {
                i = i7;
                h94Var = h94Var2;
            }
            h94Var.b();
            bbcVar.c(false);
            cbcVar2.c(false);
            cbcVar.c(false);
            if (i5 > 0) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            bbcVar.c = f2;
            cbcVar2.e(i9, i8, i, i6);
            cbcVar.e(i4, i3, i2, i5);
            h94 h94Var3 = h94Var;
            h94Var3.c(0.0f);
            h94Var3.a(1.0f);
        } else {
            float f3 = 0.0f;
            h94Var2.b();
            if (i5 > 0) {
                f3 = 1.0f;
            }
            bbcVar.d(f3);
            cbcVar2.d(i9, i8, i7, i6);
            cbcVar.d(i4, i3, i2, i5);
            runnable.run();
        }
        a();
    }

    @Override
    public final void o(wzc wzcVar) {
        int i;
        wzc b = b(wzcVar);
        if (b != null) {
            i = b.a.f(8).d;
        } else {
            i = 0;
        }
        this.G = i;
        this.h.run();
    }

    @Override
    public final void v() {
        this.H++;
    }

    public wzc b(wzc wzcVar) {
        return wzcVar;
    }
}
