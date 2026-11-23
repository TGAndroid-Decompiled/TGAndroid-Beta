package l2;

import a8.ka;
import a8.ma;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f19449a;
    public final h2.g0 f19450b;
    public g9.t f19451c;
    public final f2.d d;
    public g9.t f19452e;
    public g9.t f19453f;
    public final f2.d f19454g;
    public final Looper h;
    public final int f19455i;
    public final e2.e f19456j;
    public final int f19457k;
    public final boolean f19458l;
    public final p1 f19459m;
    public final o1 f19460n;
    public final long f19461o;
    public final long f19462p;
    public final long f19463q;
    public final f f19464r;
    public final long f19465s;
    public final long f19466t;
    public final int f19467u;
    public final int v;
    public final int f19468w;
    public final int f19469x;
    public final boolean f19470y;
    public boolean f19471z;

    static {
        int i7;
        String str = h2.l0.f13778a;
        String c10 = ka.c(Build.DEVICE);
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
        this.f19449a = context;
        this.f19451c = dVar;
        this.d = dVar2;
        this.f19452e = dVar3;
        this.f19453f = pVar;
        this.f19454g = dVar4;
        String str = h2.l0.f13778a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f19456j = e2.e.f10361i;
        this.f19457k = 1;
        this.f19458l = true;
        this.f19459m = p1.f19523f;
        this.f19461o = 5000L;
        this.f19462p = 15000L;
        this.f19463q = 3000L;
        this.f19460n = o1.f19515b;
        this.f19464r = new f(h2.l0.S(20L), h2.l0.S(500L));
        this.f19450b = h2.g0.f13755a;
        this.f19465s = 500L;
        this.f19466t = 2000L;
        this.f19467u = 600000;
        boolean z10 = D;
        if (z10) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f19468w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f19469x = 600000;
        this.f19470y = true;
        this.A = "";
        this.f19455i = -1000;
        new w7.s();
        this.B = true;
    }

    public final f0 a() {
        ma.p(!this.f19471z);
        this.f19471z = true;
        return new f0(this);
    }
}
