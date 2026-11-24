package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
public final class v64 {
    public static final short E;
    public static final boolean F;
    public boolean A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final Context a;
    public final bfb b;
    public sdb c;
    public final sdb d;
    public sdb e;
    public sdb f;
    public final a10 g;
    public final o41 h;
    public Looper i;
    public final int j;
    public final o00 k;
    public final boolean l;
    public final boolean m;
    public final jx9 n;
    public final ot9 o;
    public final short p;
    public final short q;
    public final short r;
    public final vc3 s;
    public final short t;
    public final short u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final boolean z;

    static {
        short s;
        String str = hac.a;
        String c = vod.c(Build.DEVICE);
        if (!c.contains("emulator") && !c.contains("emu64a") && !c.contains("emu64x") && !c.contains("generic") && !c.contains("vsoc")) {
            s = 10000;
        } else {
            s = 30000;
        }
        E = s;
        F = true;
    }

    public v64(Context context, sdb sdbVar, sdb sdbVar2) {
        short s;
        a10 a10Var = new a10(context, (byte) 4);
        k50 k50Var = new k50((byte) 3);
        a10 a10Var2 = new a10(context, (byte) 5);
        o41 o41Var = new o41((byte) 6);
        context.getClass();
        this.a = context;
        this.c = sdbVar;
        this.d = sdbVar2;
        this.e = a10Var;
        this.f = k50Var;
        this.g = a10Var2;
        this.h = o41Var;
        this.i = hac.z();
        this.k = o00.i;
        this.l = true;
        this.m = true;
        this.n = jx9.f;
        this.p = (short) 5000;
        this.q = (short) 15000;
        this.r = (short) 3000;
        this.o = ot9.b;
        this.s = new vc3(hac.T(20L), hac.T(500L));
        this.b = bfb.a;
        this.t = (short) 500;
        this.u = (short) 2000;
        this.v = 600000;
        boolean z = F;
        if (z) {
            s = E;
        } else {
            s = 2147483647;
        }
        this.w = s;
        this.x = z ? 60000 : Integer.MAX_VALUE;
        this.y = 600000;
        this.z = true;
        this.B = "";
        this.j = -1000;
        new jk2();
        this.C = true;
        this.D = true;
    }

    public final h74 a() {
        jte.p(!this.A);
        this.A = true;
        return new h74(this);
    }

    public final void b(xc3 xc3Var) {
        jte.p(!this.A);
        this.f = new ad3(xc3Var, (byte) 1);
    }

    public v64(Context context) {
        this(context, new a10(context, (byte) 2), new a10(context, (byte) 3));
    }
}
