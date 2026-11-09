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
    public final Context f17940a;
    public final h2.g0 f17941b;
    public g9.u f17942c;
    public final f2.c d;
    public g9.u f17943e;
    public g9.u f17944f;
    public final f2.c f17945g;
    public final Looper h;
    public final int f17946i;
    public final e2.e f17947j;
    public final int f17948k;
    public final boolean f17949l;
    public final t1 f17950m;
    public final s1 f17951n;
    public final long f17952o;
    public final long f17953p;
    public final long f17954q;
    public final f f17955r;
    public final long f17956s;
    public final long f17957t;
    public final int f17958u;
    public final int v;
    public final int f17959w;
    public final int f17960x;
    public final boolean f17961y;
    public boolean f17962z;

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
        this.f17940a = context;
        this.f17942c = cVar;
        this.d = cVar2;
        this.f17943e = cVar3;
        this.f17944f = qVar;
        this.f17945g = cVar4;
        String str = h2.m0.f14112a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f17947j = e2.e.f10215i;
        this.f17948k = 1;
        this.f17949l = true;
        this.f17950m = t1.f18051f;
        this.f17952o = 5000L;
        this.f17953p = 15000L;
        this.f17954q = 3000L;
        this.f17951n = s1.f18045b;
        this.f17955r = new f(h2.m0.S(20L), h2.m0.S(500L));
        this.f17941b = h2.g0.f14088a;
        this.f17956s = 500L;
        this.f17957t = 2000L;
        this.f17958u = 600000;
        boolean z9 = D;
        if (z9) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f17959w = z9 ? 60000 : Integer.MAX_VALUE;
        this.f17960x = 600000;
        this.f17961y = true;
        this.A = "";
        this.f17946i = -1000;
        new w7.s(12);
        this.B = true;
    }

    public final i0 a() {
        ia.p(!this.f17962z);
        this.f17962z = true;
        return new i0(this);
    }
}
