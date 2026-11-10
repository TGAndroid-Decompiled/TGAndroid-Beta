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
    public final Context f17943a;
    public final h2.g0 f17944b;
    public g9.u f17945c;
    public final f2.c d;
    public g9.u f17946e;
    public g9.u f17947f;
    public final f2.c f17948g;
    public final Looper h;
    public final int f17949i;
    public final e2.e f17950j;
    public final int f17951k;
    public final boolean f17952l;
    public final t1 f17953m;
    public final s1 f17954n;
    public final long f17955o;
    public final long f17956p;
    public final long f17957q;
    public final f f17958r;
    public final long f17959s;
    public final long f17960t;
    public final int f17961u;
    public final int v;
    public final int f17962w;
    public final int f17963x;
    public final boolean f17964y;
    public boolean f17965z;

    static {
        int i7;
        String str = h2.m0.f14114a;
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
        this.f17943a = context;
        this.f17945c = cVar;
        this.d = cVar2;
        this.f17946e = cVar3;
        this.f17947f = qVar;
        this.f17948g = cVar4;
        String str = h2.m0.f14114a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f17950j = e2.e.f10220i;
        this.f17951k = 1;
        this.f17952l = true;
        this.f17953m = t1.f18054f;
        this.f17955o = 5000L;
        this.f17956p = 15000L;
        this.f17957q = 3000L;
        this.f17954n = s1.f18048b;
        this.f17958r = new f(h2.m0.S(20L), h2.m0.S(500L));
        this.f17944b = h2.g0.f14090a;
        this.f17959s = 500L;
        this.f17960t = 2000L;
        this.f17961u = 600000;
        boolean z9 = D;
        if (z9) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f17962w = z9 ? 60000 : Integer.MAX_VALUE;
        this.f17963x = 600000;
        this.f17964y = true;
        this.A = "";
        this.f17949i = -1000;
        new w7.s(12);
        this.B = true;
    }

    public final i0 a() {
        ia.p(!this.f17965z);
        this.f17965z = true;
        return new i0(this);
    }
}
