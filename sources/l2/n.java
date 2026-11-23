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
    public final Context f19483a;
    public final h2.g0 f19484b;
    public g9.t f19485c;
    public final f2.d d;
    public g9.t f19486e;
    public g9.t f19487f;
    public final f2.d f19488g;
    public final Looper h;
    public final int f19489i;
    public final e2.e f19490j;
    public final int f19491k;
    public final boolean f19492l;
    public final p1 f19493m;
    public final o1 f19494n;
    public final long f19495o;
    public final long f19496p;
    public final long f19497q;
    public final f f19498r;
    public final long f19499s;
    public final long f19500t;
    public final int f19501u;
    public final int v;
    public final int f19502w;
    public final int f19503x;
    public final boolean f19504y;
    public boolean f19505z;

    static {
        int i7;
        String str = h2.l0.f13815a;
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
        this.f19483a = context;
        this.f19485c = dVar;
        this.d = dVar2;
        this.f19486e = dVar3;
        this.f19487f = pVar;
        this.f19488g = dVar4;
        String str = h2.l0.f13815a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f19490j = e2.e.f10398i;
        this.f19491k = 1;
        this.f19492l = true;
        this.f19493m = p1.f19557f;
        this.f19495o = 5000L;
        this.f19496p = 15000L;
        this.f19497q = 3000L;
        this.f19494n = o1.f19549b;
        this.f19498r = new f(h2.l0.S(20L), h2.l0.S(500L));
        this.f19484b = h2.g0.f13792a;
        this.f19499s = 500L;
        this.f19500t = 2000L;
        this.f19501u = 600000;
        boolean z10 = D;
        if (z10) {
            i7 = C;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.v = i7;
        this.f19502w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f19503x = 600000;
        this.f19504y = true;
        this.A = "";
        this.f19489i = -1000;
        new w7.s();
        this.B = true;
    }

    public final f0 a() {
        la.p(!this.f19505z);
        this.f19505z = true;
        return new f0(this);
    }
}
