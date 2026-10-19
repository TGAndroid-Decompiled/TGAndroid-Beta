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
    public final Context f12504a;
    public final e2.g0 f12505b;
    public d9.u f12506c;
    public final c2.d d;
    public d9.u e;
    public d9.u f12507f;
    public final c2.d f12508g;
    public final Looper h;
    public final int f12509i;
    public final b2.f f12510j;
    public final int f12511k;
    public final boolean f12512l;
    public final s1 f12513m;
    public final r1 f12514n;
    public final long f12515o;
    public final long f12516p;
    public final long f12517q;
    public final h f12518r;
    public final long f12519s;
    public final long f12520t;
    public final int f12521u;
    public final int v;
    public final int f12522w;
    public final int f12523x;
    public final boolean f12524y;
    public boolean f12525z;

    static {
        int i10;
        String str = e2.m0.f8254a;
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
        this.f12504a = context;
        this.f12506c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f12507f = sVar;
        this.f12508g = dVar4;
        String str = e2.m0.f8254a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f12510j = b2.f.f3739i;
        this.f12511k = 1;
        this.f12512l = true;
        this.f12513m = s1.f12584f;
        this.f12515o = 5000L;
        this.f12516p = 15000L;
        this.f12517q = 3000L;
        this.f12514n = r1.f12575b;
        this.f12518r = new h(e2.m0.S(20L), e2.m0.S(500L));
        this.f12505b = e2.g0.f8231a;
        this.f12519s = 500L;
        this.f12520t = 2000L;
        this.f12521u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f12522w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f12523x = 600000;
        this.f12524y = true;
        this.A = "";
        this.f12509i = -1000;
        new pb.a();
        this.B = true;
    }

    public final i0 a() {
        u6.p(!this.f12525z);
        this.f12525z = true;
        return new i0(this);
    }
}
