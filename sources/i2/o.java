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
    public final Context f12501a;
    public final e2.g0 f12502b;
    public d9.u f12503c;
    public final c2.d d;
    public d9.u e;
    public d9.u f12504f;
    public final c2.d f12505g;
    public final Looper h;
    public final int f12506i;
    public final b2.f f12507j;
    public final int f12508k;
    public final boolean f12509l;
    public final r1 f12510m;
    public final q1 f12511n;
    public final long f12512o;
    public final long f12513p;
    public final long f12514q;
    public final g f12515r;
    public final long f12516s;
    public final long f12517t;
    public final int f12518u;
    public final int v;
    public final int f12519w;
    public final int f12520x;
    public final boolean f12521y;
    public boolean f12522z;

    static {
        int i10;
        String str = e2.m0.f8255a;
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
        this.f12501a = context;
        this.f12503c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f12504f = sVar;
        this.f12505g = dVar4;
        String str = e2.m0.f8255a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f12507j = b2.f.f3741i;
        this.f12508k = 1;
        this.f12509l = true;
        this.f12510m = r1.f12581f;
        this.f12512o = 5000L;
        this.f12513p = 15000L;
        this.f12514q = 3000L;
        this.f12511n = q1.f12572b;
        this.f12515r = new g(e2.m0.S(20L), e2.m0.S(500L));
        this.f12502b = e2.g0.f8232a;
        this.f12516s = 500L;
        this.f12517t = 2000L;
        this.f12518u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f12519w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f12520x = 600000;
        this.f12521y = true;
        this.A = "";
        this.f12506i = -1000;
        new pb.a();
        this.B = true;
    }

    public final h0 a() {
        u6.p(!this.f12522z);
        this.f12522z = true;
        return new h0(this);
    }
}
