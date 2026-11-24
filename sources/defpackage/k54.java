package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
public final class k54 {
    public static final short E;
    public static final boolean F;
    public boolean A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final Context a;
    public final adb b;
    public qbb c;
    public final qbb d;
    public qbb e;
    public qbb f;
    public final a00 g;
    public final g31 h;
    public Looper i;
    public final int j;
    public final nz k;
    public final boolean l;
    public final boolean m;
    public final gv9 n;
    public final mr9 o;
    public final short p;
    public final short q;
    public final short r;
    public final jb3 s;
    public final short t;
    public final short u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final boolean z;

    static {
        short s;
        String str = g8c.a;
        String c = smd.c(Build.DEVICE);
        if (!c.contains("emulator") && !c.contains("emu64a") && !c.contains("emu64x") && !c.contains("generic") && !c.contains("vsoc")) {
            s = 10000;
        } else {
            s = 30000;
        }
        E = s;
        F = true;
    }

    public k54(Context context, qbb qbbVar, qbb qbbVar2) {
        short s;
        a00 a00Var = new a00(context, (byte) 4);
        k40 k40Var = new k40((byte) 3);
        a00 a00Var2 = new a00(context, (byte) 5);
        g31 g31Var = new g31((byte) 6);
        context.getClass();
        this.a = context;
        this.c = qbbVar;
        this.d = qbbVar2;
        this.e = a00Var;
        this.f = k40Var;
        this.g = a00Var2;
        this.h = g31Var;
        this.i = g8c.z();
        this.k = nz.i;
        this.l = true;
        this.m = true;
        this.n = gv9.f;
        this.p = (short) 5000;
        this.q = (short) 15000;
        this.r = (short) 3000;
        this.o = mr9.b;
        this.s = new jb3(g8c.T(20L), g8c.T(500L));
        this.b = adb.a;
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
        new vi2();
        this.C = true;
        this.D = true;
    }

    public final y54 a() {
        gre.p(!this.A);
        this.A = true;
        return new y54(this);
    }

    public final void b(lb3 lb3Var) {
        gre.p(!this.A);
        this.f = new ob3(lb3Var, (byte) 1);
    }

    public k54(Context context) {
        this(context, new a00(context, (byte) 2), new a00(context, (byte) 3));
    }
}
