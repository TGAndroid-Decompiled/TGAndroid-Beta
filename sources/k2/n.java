package k2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import b8.xb;
import b8.zb;
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f16631a;
    public final g2.h0 f16632b;
    public f9.t f16633c;
    public final e2.c d;
    public f9.t f16634e;
    public f9.t f16635f;
    public final e2.c f16636g;
    public final Looper h;
    public final int f16637i;
    public final d2.f f16638j;
    public final int f16639k;
    public final boolean f16640l;
    public final t1 f16641m;
    public final s1 f16642n;
    public final long f16643o;
    public final long f16644p;
    public final long f16645q;
    public final f f16646r;
    public final long f16647s;
    public final long f16648t;
    public final int f16649u;
    public final int v;
    public final int f16650w;
    public final int f16651x;
    public final boolean f16652y;
    public boolean f16653z;

    static {
        int i3;
        String str = g2.n0.f11873a;
        String c2 = xb.c(Build.DEVICE);
        if (!c2.contains("emulator") && !c2.contains("emu64a") && !c2.contains("emu64x") && !c2.contains("generic")) {
            i3 = 10000;
        } else {
            i3 = 30000;
        }
        C = i3;
        D = true;
    }

    public n(Context context) {
        int i3;
        e2.c cVar = new e2.c(context, 1);
        e2.c cVar2 = new e2.c(context, 2);
        e2.c cVar3 = new e2.c(context, 3);
        c3.q qVar = new c3.q(3);
        e2.c cVar4 = new e2.c(context, 4);
        context.getClass();
        this.f16631a = context;
        this.f16633c = cVar;
        this.d = cVar2;
        this.f16634e = cVar3;
        this.f16635f = qVar;
        this.f16636g = cVar4;
        String str = g2.n0.f11873a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f16638j = d2.f.f8079i;
        this.f16639k = 1;
        this.f16640l = true;
        this.f16641m = t1.f16738f;
        this.f16643o = 5000L;
        this.f16644p = 15000L;
        this.f16645q = 3000L;
        this.f16642n = s1.f16732b;
        this.f16646r = new f(g2.n0.S(20L), g2.n0.S(500L));
        this.f16632b = g2.h0.f11849a;
        this.f16647s = 500L;
        this.f16648t = 2000L;
        this.f16649u = 600000;
        boolean z10 = D;
        if (z10) {
            i3 = C;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        this.v = i3;
        this.f16650w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f16651x = 600000;
        this.f16652y = true;
        this.A = "";
        this.f16637i = -1000;
        new mb.b();
        this.B = true;
    }

    public final i0 a() {
        zb.p(!this.f16653z);
        this.f16653z = true;
        return new i0(this);
    }
}
