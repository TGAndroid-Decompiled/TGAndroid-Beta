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
    public final Context f17942a;
    public final h2.g0 f17943b;
    public g9.u f17944c;
    public final f2.c d;
    public g9.u f17945e;
    public g9.u f17946f;
    public final f2.c f17947g;
    public final Looper h;
    public final int f17948i;
    public final e2.e f17949j;
    public final int f17950k;
    public final boolean f17951l;
    public final t1 f17952m;
    public final s1 f17953n;
    public final long f17954o;
    public final long f17955p;
    public final long f17956q;
    public final f f17957r;
    public final long f17958s;
    public final long f17959t;
    public final int f17960u;
    public final int v;
    public final int f17961w;
    public final int f17962x;
    public final boolean f17963y;
    public boolean f17964z;

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
        this.f17942a = context;
        this.f17944c = cVar;
        this.d = cVar2;
        this.f17945e = cVar3;
        this.f17946f = qVar;
        this.f17947g = cVar4;
        String str = h2.m0.f14112a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f17949j = e2.e.f10215i;
        this.f17950k = 1;
        this.f17951l = true;
        this.f17952m = t1.f18053f;
        this.f17954o = 5000L;
        this.f17955p = 15000L;
        this.f17956q = 3000L;
        this.f17953n = s1.f18047b;
        this.f17957r = new f(h2.m0.S(20L), h2.m0.S(500L));
        this.f17943b = h2.g0.f14088a;
        this.f17958s = 500L;
        this.f17959t = 2000L;
        this.f17960u = 600000;
        boolean z9 = D;
        if (z9) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f17961w = z9 ? 60000 : Integer.MAX_VALUE;
        this.f17962x = 600000;
        this.f17963y = true;
        this.A = "";
        this.f17948i = -1000;
        new w7.s(12);
        this.B = true;
    }

    public final i0 a() {
        ia.p(!this.f17964z);
        this.f17964z = true;
        return new i0(this);
    }
}
