package l2;

import a8.ga;
import a8.ia;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f17939a;
    public final h2.g0 f17940b;
    public g9.u f17941c;
    public final f2.c d;
    public g9.u f17942e;
    public g9.u f17943f;
    public final f2.c f17944g;
    public final Looper h;
    public final int f17945i;
    public final e2.e f17946j;
    public final int f17947k;
    public final boolean f17948l;
    public final t1 f17949m;
    public final s1 f17950n;
    public final long f17951o;
    public final long f17952p;
    public final long f17953q;
    public final f f17954r;
    public final long f17955s;
    public final long f17956t;
    public final int f17957u;
    public final int v;
    public final int f17958w;
    public final int f17959x;
    public final boolean f17960y;
    public boolean f17961z;

    static {
        int i7;
        String str = h2.m0.f14112a;
        String c10 = ga.c(Build.DEVICE);
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
        f2.c cVar = new f2.c(context, 1);
        f2.c cVar2 = new f2.c(context, 2);
        f2.c cVar3 = new f2.c(context, 3);
        d3.q qVar = new d3.q(3);
        f2.c cVar4 = new f2.c(context, 4);
        context.getClass();
        this.f17939a = context;
        this.f17941c = cVar;
        this.d = cVar2;
        this.f17942e = cVar3;
        this.f17943f = qVar;
        this.f17944g = cVar4;
        String str = h2.m0.f14112a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f17946j = e2.e.f10215i;
        this.f17947k = 1;
        this.f17948l = true;
        this.f17949m = t1.f18050f;
        this.f17951o = 5000L;
        this.f17952p = 15000L;
        this.f17953q = 3000L;
        this.f17950n = s1.f18044b;
        this.f17954r = new f(h2.m0.S(20L), h2.m0.S(500L));
        this.f17940b = h2.g0.f14088a;
        this.f17955s = 500L;
        this.f17956t = 2000L;
        this.f17957u = 600000;
        boolean z9 = D;
        if (z9) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f17958w = z9 ? 60000 : Integer.MAX_VALUE;
        this.f17959x = 600000;
        this.f17960y = true;
        this.A = "";
        this.f17945i = -1000;
        new w7.s(12);
        this.B = true;
    }

    public final i0 a() {
        ia.p(!this.f17961z);
        this.f17961z = true;
        return new i0(this);
    }
}
