package l2;

import a8.ja;
import a8.la;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f19455a;
    public final h2.g0 f19456b;
    public g9.t f19457c;
    public final f2.d d;
    public g9.t f19458e;
    public g9.t f19459f;
    public final f2.d f19460g;
    public final Looper h;
    public final int f19461i;
    public final e2.e f19462j;
    public final int f19463k;
    public final boolean f19464l;
    public final p1 f19465m;
    public final o1 f19466n;
    public final long f19467o;
    public final long f19468p;
    public final long f19469q;
    public final f f19470r;
    public final long f19471s;
    public final long f19472t;
    public final int f19473u;
    public final int v;
    public final int f19474w;
    public final int f19475x;
    public final boolean f19476y;
    public boolean f19477z;

    static {
        int i7;
        String str = h2.l0.f13786a;
        String c10 = ja.c(Build.DEVICE);
        if (!c10.contains("emulator") && !c10.contains("emu64a") && !c10.contains("emu64x") && !c10.contains("generic")) {
            i7 = 10000;
        } else {
            i7 = 30000;
        }
        C = i7;
        D = true;
    }

    public n(Context context) {
        int i7;
        f2.d dVar = new f2.d(context, 1);
        f2.d dVar2 = new f2.d(context, 2);
        f2.d dVar3 = new f2.d(context, 3);
        d3.p pVar = new d3.p(3);
        f2.d dVar4 = new f2.d(context, 4);
        context.getClass();
        this.f19455a = context;
        this.f19457c = dVar;
        this.d = dVar2;
        this.f19458e = dVar3;
        this.f19459f = pVar;
        this.f19460g = dVar4;
        String str = h2.l0.f13786a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f19462j = e2.e.f10369i;
        this.f19463k = 1;
        this.f19464l = true;
        this.f19465m = p1.f19529f;
        this.f19467o = 5000L;
        this.f19468p = 15000L;
        this.f19469q = 3000L;
        this.f19466n = o1.f19521b;
        this.f19470r = new f(h2.l0.S(20L), h2.l0.S(500L));
        this.f19456b = h2.g0.f13763a;
        this.f19471s = 500L;
        this.f19472t = 2000L;
        this.f19473u = 600000;
        boolean z10 = D;
        if (z10) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f19474w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f19475x = 600000;
        this.f19476y = true;
        this.A = "";
        this.f19461i = -1000;
        new w7.s();
        this.B = true;
    }

    public final f0 a() {
        la.p(!this.f19477z);
        this.f19477z = true;
        return new f0(this);
    }
}
