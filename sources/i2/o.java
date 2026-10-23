package i2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import v7.s6;
import v7.u6;
public final class o {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f12531a;
    public final e2.g0 f12532b;
    public d9.u f12533c;
    public final c2.d d;
    public d9.u e;
    public d9.u f12534f;
    public final c2.d f12535g;
    public final Looper h;
    public final int f12536i;
    public final b2.f f12537j;
    public final int f12538k;
    public final boolean f12539l;
    public final s1 f12540m;
    public final r1 f12541n;
    public final long f12542o;
    public final long f12543p;
    public final long f12544q;
    public final g f12545r;
    public final long f12546s;
    public final long f12547t;
    public final int f12548u;
    public final int v;
    public final int f12549w;
    public final int f12550x;
    public final boolean f12551y;
    public boolean f12552z;

    static {
        int i10;
        String str = e2.m0.f8259a;
        String c10 = s6.c(Build.DEVICE);
        if (!c10.contains("emulator") && !c10.contains("emu64a") && !c10.contains("emu64x") && !c10.contains("generic")) {
            i10 = 10000;
        } else {
            i10 = 30000;
        }
        C = i10;
        D = true;
    }

    public o(Context context) {
        int i10;
        c2.d dVar = new c2.d(context, 1);
        c2.d dVar2 = new c2.d(context, 2);
        c2.d dVar3 = new c2.d(context, 3);
        a3.s sVar = new a3.s(3);
        c2.d dVar4 = new c2.d(context, 4);
        context.getClass();
        this.f12531a = context;
        this.f12533c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f12534f = sVar;
        this.f12535g = dVar4;
        String str = e2.m0.f8259a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f12537j = b2.f.f3744i;
        this.f12538k = 1;
        this.f12539l = true;
        this.f12540m = s1.f12612f;
        this.f12542o = 5000L;
        this.f12543p = 15000L;
        this.f12544q = 3000L;
        this.f12541n = r1.f12608b;
        this.f12545r = new g(e2.m0.S(20L), e2.m0.S(500L));
        this.f12532b = e2.g0.f8236a;
        this.f12546s = 500L;
        this.f12547t = 2000L;
        this.f12548u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f12549w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f12550x = 600000;
        this.f12551y = true;
        this.A = "";
        this.f12536i = -1000;
        new pb.a();
        this.B = true;
    }

    public final h0 a() {
        u6.p(!this.f12552z);
        this.f12552z = true;
        return new h0(this);
    }
}
