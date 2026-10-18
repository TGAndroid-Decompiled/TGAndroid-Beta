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
    public final Context f12499a;
    public final e2.g0 f12500b;
    public d9.u f12501c;
    public final c2.d d;
    public d9.u e;
    public d9.u f12502f;
    public final c2.d f12503g;
    public final Looper h;
    public final int f12504i;
    public final b2.f f12505j;
    public final int f12506k;
    public final boolean f12507l;
    public final r1 f12508m;
    public final q1 f12509n;
    public final long f12510o;
    public final long f12511p;
    public final long f12512q;
    public final g f12513r;
    public final long f12514s;
    public final long f12515t;
    public final int f12516u;
    public final int v;
    public final int f12517w;
    public final int f12518x;
    public final boolean f12519y;
    public boolean f12520z;

    static {
        int i10;
        String str = e2.m0.f8253a;
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
        this.f12499a = context;
        this.f12501c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f12502f = sVar;
        this.f12503g = dVar4;
        String str = e2.m0.f8253a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f12505j = b2.f.f3741i;
        this.f12506k = 1;
        this.f12507l = true;
        this.f12508m = r1.f12579f;
        this.f12510o = 5000L;
        this.f12511p = 15000L;
        this.f12512q = 3000L;
        this.f12509n = q1.f12570b;
        this.f12513r = new g(e2.m0.S(20L), e2.m0.S(500L));
        this.f12500b = e2.g0.f8230a;
        this.f12514s = 500L;
        this.f12515t = 2000L;
        this.f12516u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f12517w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f12518x = 600000;
        this.f12519y = true;
        this.A = "";
        this.f12504i = -1000;
        new pb.a();
        this.B = true;
    }

    public final h0 a() {
        u6.p(!this.f12520z);
        this.f12520z = true;
        return new h0(this);
    }
}
