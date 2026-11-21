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
    public final Context f19480a;
    public final h2.g0 f19481b;
    public g9.t f19482c;
    public final f2.d d;
    public g9.t f19483e;
    public g9.t f19484f;
    public final f2.d f19485g;
    public final Looper h;
    public final int f19486i;
    public final e2.e f19487j;
    public final int f19488k;
    public final boolean f19489l;
    public final p1 f19490m;
    public final o1 f19491n;
    public final long f19492o;
    public final long f19493p;
    public final long f19494q;
    public final f f19495r;
    public final long f19496s;
    public final long f19497t;
    public final int f19498u;
    public final int v;
    public final int f19499w;
    public final int f19500x;
    public final boolean f19501y;
    public boolean f19502z;

    static {
        int i7;
        String str = h2.l0.f13812a;
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
        this.f19480a = context;
        this.f19482c = dVar;
        this.d = dVar2;
        this.f19483e = dVar3;
        this.f19484f = pVar;
        this.f19485g = dVar4;
        String str = h2.l0.f13812a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f19487j = e2.e.f10395i;
        this.f19488k = 1;
        this.f19489l = true;
        this.f19490m = p1.f19554f;
        this.f19492o = 5000L;
        this.f19493p = 15000L;
        this.f19494q = 3000L;
        this.f19491n = o1.f19546b;
        this.f19495r = new f(h2.l0.S(20L), h2.l0.S(500L));
        this.f19481b = h2.g0.f13789a;
        this.f19496s = 500L;
        this.f19497t = 2000L;
        this.f19498u = 600000;
        boolean z10 = D;
        if (z10) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f19499w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f19500x = 600000;
        this.f19501y = true;
        this.A = "";
        this.f19486i = -1000;
        new w7.s();
        this.B = true;
    }

    public final f0 a() {
        la.p(!this.f19502z);
        this.f19502z = true;
        return new f0(this);
    }
}
