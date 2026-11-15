package l2;

import a8.ha;
import a8.ja;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f19088a;
    public final h2.g0 f19089b;
    public g9.t f19090c;
    public final f2.c d;
    public g9.t f19091e;
    public g9.t f19092f;
    public final f2.c f19093g;
    public final Looper h;
    public final int f19094i;
    public final e2.e f19095j;
    public final int f19096k;
    public final boolean f19097l;
    public final p1 f19098m;
    public final o1 f19099n;
    public final long f19100o;
    public final long f19101p;
    public final long f19102q;
    public final f f19103r;
    public final long f19104s;
    public final long f19105t;
    public final int f19106u;
    public final int v;
    public final int f19107w;
    public final int f19108x;
    public final boolean f19109y;
    public boolean f19110z;

    static {
        int i7;
        String str = h2.l0.f13471a;
        String c10 = ha.c(Build.DEVICE);
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
        d3.p pVar = new d3.p(3);
        f2.c cVar4 = new f2.c(context, 4);
        context.getClass();
        this.f19088a = context;
        this.f19090c = cVar;
        this.d = cVar2;
        this.f19091e = cVar3;
        this.f19092f = pVar;
        this.f19093g = cVar4;
        String str = h2.l0.f13471a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f19095j = e2.e.f10051i;
        this.f19096k = 1;
        this.f19097l = true;
        this.f19098m = p1.f19162f;
        this.f19100o = 5000L;
        this.f19101p = 15000L;
        this.f19102q = 3000L;
        this.f19099n = o1.f19154b;
        this.f19103r = new f(h2.l0.S(20L), h2.l0.S(500L));
        this.f19089b = h2.g0.f13448a;
        this.f19104s = 500L;
        this.f19105t = 2000L;
        this.f19106u = 600000;
        boolean z10 = D;
        if (z10) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f19107w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f19108x = 600000;
        this.f19109y = true;
        this.A = "";
        this.f19094i = -1000;
        new w7.s();
        this.B = true;
    }

    public final f0 a() {
        ja.p(!this.f19110z);
        this.f19110z = true;
        return new f0(this);
    }
}
