package l2;

import a8.ka;
import a8.ma;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
public final class o {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f19553a;
    public final h2.g0 f19554b;
    public g9.t f19555c;
    public final f2.d d;
    public g9.t f19556e;
    public g9.t f19557f;
    public final f2.d f19558g;
    public final Looper h;
    public final int f19559i;
    public final e2.e f19560j;
    public final int f19561k;
    public final boolean f19562l;
    public final q1 f19563m;
    public final p1 f19564n;
    public final long f19565o;
    public final long f19566p;
    public final long f19567q;
    public final g f19568r;
    public final long f19569s;
    public final long f19570t;
    public final int f19571u;
    public final int v;
    public final int f19572w;
    public final int f19573x;
    public final boolean f19574y;
    public boolean f19575z;

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

    public o(Context context) {
        int i7;
        f2.d dVar = new f2.d(context, 1);
        f2.d dVar2 = new f2.d(context, 2);
        f2.d dVar3 = new f2.d(context, 3);
        d3.p pVar = new d3.p(3);
        f2.d dVar4 = new f2.d(context, 4);
        context.getClass();
        this.f19553a = context;
        this.f19555c = dVar;
        this.d = dVar2;
        this.f19556e = dVar3;
        this.f19557f = pVar;
        this.f19558g = dVar4;
        String str = h2.l0.f13778a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f19560j = e2.e.f10359i;
        this.f19561k = 1;
        this.f19562l = true;
        this.f19563m = q1.f19627f;
        this.f19565o = 5000L;
        this.f19566p = 15000L;
        this.f19567q = 3000L;
        this.f19564n = p1.f19619b;
        this.f19568r = new g(h2.l0.S(20L), h2.l0.S(500L));
        this.f19554b = h2.g0.f13755a;
        this.f19569s = 500L;
        this.f19570t = 2000L;
        this.f19571u = 600000;
        boolean z10 = D;
        if (z10) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f19572w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f19573x = 600000;
        this.f19574y = true;
        this.A = "";
        this.f19559i = -1000;
        new w7.s();
        this.B = true;
    }

    public final g0 a() {
        ma.p(!this.f19575z);
        this.f19575z = true;
        return new g0(this);
    }
}
