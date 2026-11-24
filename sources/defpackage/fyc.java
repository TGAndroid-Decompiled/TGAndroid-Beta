package defpackage;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import org.telegram.messenger.a;
public class fyc implements cyc, byc, swc {
    public twc E;
    public View F;
    public int G;
    public int H;
    public final y74 a;
    public final a9c b = new a9c(0.0f);
    public final b9c c = new b9c();
    public final b9c d = new b9c();
    public final on e = new on(null);
    public final oh4 f;
    public final Runnable h;
    public boolean n;
    public vxc r;
    public byte s;
    public int w;
    public int x;
    public final eyc y;

    public fyc(Runnable runnable) {
        dyc dycVar = new dyc(this, (byte) 0);
        ?? obj = new Object();
        obj.c = nv5.a;
        obj.d = new tp5(obj, (byte) 5);
        obj.b = dycVar;
        Typeface typeface = gl.a;
        float f = 1.0f;
        try {
            f = Settings.Global.getFloat(a.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.a = f * 250.0f * 1.1f;
        this.f = obj;
        this.s = (byte) 1;
        this.y = new eyc(this, (byte) 0);
        this.h = runnable;
        this.a = new y74(0, new aec(this, runnable, (byte) 3), gb.w, 250L);
    }

    @Override
    public final void P() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new eyc(this, (byte) 1));
        }
    }

    @Override
    public final View R() {
        return this.F;
    }

    public final void a() {
        boolean z = this.a.h;
        boolean z2 = this.n;
        on onVar = this.e;
        if (!z2 && z) {
            this.n = true;
            onVar.d();
        }
        if (this.n && !z) {
            this.n = false;
            onVar.e();
        }
    }

    public final float c() {
        twc twcVar = this.E;
        b9c b9cVar = this.d;
        if (twcVar != null && this.H > 0) {
            return Math.max(this.G, b9cVar.d.a);
        }
        return b9cVar.d.a;
    }

    public final float d() {
        twc twcVar = this.E;
        b9c b9cVar = this.c;
        if (twcVar != null && this.H > 0) {
            return Math.max(this.G, b9cVar.d.a);
        }
        return b9cVar.d.a;
    }

    public final int e() {
        if (this.E != null && this.H > 0) {
            return Math.max(this.G, Math.max(f(527).d, this.w));
        }
        return Math.max(f(527).d, this.w);
    }

    public final io5 f(int i) {
        vxc vxcVar = this.r;
        if (vxcVar != null) {
            return vxcVar.a.f(i);
        }
        return io5.e;
    }

    public final void g(int i) {
        if (this.w == i && this.s == 0) {
            return;
        }
        gl.r(this.y);
        this.x = Math.max(this.w, i);
        this.w = i;
        this.s = (byte) 0;
        j(this.r);
    }

    public final void h(int i) {
        if (i > 0) {
            g(i + gl.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z) {
        byte b;
        if (this.w != 0) {
            eyc eycVar = this.y;
            gl.r(eycVar);
            if (z) {
                b = 3;
            } else {
                b = 2;
            }
            this.s = b;
            j(this.r);
            if (z) {
                gl.d3(eycVar, 1000L);
            }
        }
    }

    public final void j(vxc vxcVar) {
        boolean z;
        if (this.r != null) {
            z = true;
        } else {
            z = false;
        }
        k(vxcVar, z);
    }

    public final void k(vxc vxcVar, boolean z) {
        io5 io5Var;
        io5 io5Var2;
        boolean z2;
        nv5 nv5Var;
        float f;
        int i;
        y74 y74Var;
        float f2;
        vxc b = b(vxcVar);
        this.r = b;
        if (b != null) {
            sxc sxcVar = b.a;
            io5Var = io5.a(sxcVar.f(647), sxcVar.g(647));
            io5Var2 = sxcVar.f(8);
        } else {
            io5Var = io5.e;
            io5Var2 = io5Var;
        }
        oh4 oh4Var = this.f;
        nv5 nv5Var2 = (nv5) oh4Var.c;
        if (io5Var2.d > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (z2) {
                nv5Var = nv5.d;
            } else {
                nv5Var = nv5.a;
            }
        } else if (z2) {
            nv5Var = nv5.c;
        } else {
            nv5Var = nv5.b;
        }
        if (nv5Var2 != nv5Var) {
            oh4Var.a(nv5Var, false);
        }
        byte b2 = this.s;
        if (b2 == 2) {
            this.w = 0;
        }
        if (b2 == 3 && io5Var2.d > 0) {
            this.w = 0;
        }
        io5 a = io5.a(io5Var2, io5.b(0, 0, 0, this.w));
        int i2 = a.c;
        int i3 = a.b;
        int i4 = a.a;
        int i5 = a.d;
        io5 a2 = io5.a(io5Var, a);
        int i6 = a2.d;
        int i7 = a2.c;
        int i8 = a2.b;
        int i9 = a2.a;
        Runnable runnable = this.h;
        y74 y74Var2 = this.a;
        b9c b9cVar = this.d;
        b9c b9cVar2 = this.c;
        a9c a9cVar = this.b;
        if (z) {
            if (i5 > 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (!a9cVar.b(f)) {
                y74Var = y74Var2;
                i = i7;
                if (!b9cVar2.b(i9, i8, i7, i6) && !b9cVar.b(i4, i3, i2, i5)) {
                    if (nv5Var2 != nv5Var) {
                        runnable.run();
                    }
                }
            } else {
                i = i7;
                y74Var = y74Var2;
            }
            y74Var.b();
            a9cVar.c(false);
            b9cVar2.c(false);
            b9cVar.c(false);
            if (i5 > 0) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            a9cVar.c = f2;
            b9cVar2.e(i9, i8, i, i6);
            b9cVar.e(i4, i3, i2, i5);
            y74 y74Var3 = y74Var;
            y74Var3.c(0.0f);
            y74Var3.a(1.0f);
        } else {
            float f3 = 0.0f;
            y74Var2.b();
            if (i5 > 0) {
                f3 = 1.0f;
            }
            a9cVar.d(f3);
            b9cVar2.d(i9, i8, i7, i6);
            b9cVar.d(i4, i3, i2, i5);
            runnable.run();
        }
        a();
    }

    @Override
    public final void o(vxc vxcVar) {
        int i;
        vxc b = b(vxcVar);
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

    public vxc b(vxc vxcVar) {
        return vxcVar;
    }
}
