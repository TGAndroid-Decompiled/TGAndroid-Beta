package i2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import v7.s6;
import v7.u6;
public final class p {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f12502a;
    public final e2.g0 f12503b;
    public d9.u f12504c;
    public final c2.d d;
    public d9.u e;
    public d9.u f12505f;
    public final c2.d f12506g;
    public final Looper h;
    public final int f12507i;
    public final b2.f f12508j;
    public final int f12509k;
    public final boolean f12510l;
    public final s1 f12511m;
    public final r1 f12512n;
    public final long f12513o;
    public final long f12514p;
    public final long f12515q;
    public final h f12516r;
    public final long f12517s;
    public final long f12518t;
    public final int f12519u;
    public final int v;
    public final int f12520w;
    public final int f12521x;
    public final boolean f12522y;
    public boolean f12523z;

    static {
        int i10;
        String str = e2.m0.f8252a;
        String c10 = s6.c(Build.DEVICE);
        if (!c10.contains("emulator") && !c10.contains("emu64a") && !c10.contains("emu64x") && !c10.contains("generic")) {
            i10 = 10000;
        } else {
            i10 = 30000;
        }
        C = i10;
        D = true;
    }

    public p(Context context) {
        int i10;
        c2.d dVar = new c2.d(context, 1);
        c2.d dVar2 = new c2.d(context, 2);
        c2.d dVar3 = new c2.d(context, 3);
        a3.s sVar = new a3.s(3);
        c2.d dVar4 = new c2.d(context, 4);
        context.getClass();
        this.f12502a = context;
        this.f12504c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f12505f = sVar;
        this.f12506g = dVar4;
        String str = e2.m0.f8252a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f12508j = b2.f.f3737i;
        this.f12509k = 1;
        this.f12510l = true;
        this.f12511m = s1.f12582f;
        this.f12513o = 5000L;
        this.f12514p = 15000L;
        this.f12515q = 3000L;
        this.f12512n = r1.f12573b;
        this.f12516r = new h(e2.m0.S(20L), e2.m0.S(500L));
        this.f12503b = e2.g0.f8229a;
        this.f12517s = 500L;
        this.f12518t = 2000L;
        this.f12519u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f12520w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f12521x = 600000;
        this.f12522y = true;
        this.A = "";
        this.f12507i = -1000;
        new pb.a();
        this.B = true;
    }

    public final i0 a() {
        u6.p(!this.f12523z);
        this.f12523z = true;
        return new i0(this);
    }
}
