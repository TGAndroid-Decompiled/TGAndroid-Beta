package i2;

import a8.wb;
import a8.yb;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
public final class o {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f13669a;
    public final e2.g0 f13670b;
    public e9.t f13671c;
    public final c2.d d;
    public e9.t e;
    public e9.t f13672f;
    public final c2.d f13673g;
    public final Looper h;
    public final int f13674i;
    public final b2.f f13675j;
    public final int f13676k;
    public final boolean f13677l;
    public final t1 f13678m;
    public final s1 f13679n;
    public final long f13680o;
    public final long f13681p;
    public final long f13682q;
    public final g f13683r;
    public final long f13684s;
    public final long f13685t;
    public final int f13686u;
    public final int v;
    public final int f13687w;
    public final int f13688x;
    public final boolean f13689y;
    public boolean f13690z;

    static {
        int i10;
        String str = e2.n0.f9691a;
        String c10 = wb.c(Build.DEVICE);
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
        this.f13669a = context;
        this.f13671c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f13672f = sVar;
        this.f13673g = dVar4;
        String str = e2.n0.f9691a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f13675j = b2.f.f3180i;
        this.f13676k = 1;
        this.f13677l = true;
        this.f13678m = t1.f13766f;
        this.f13680o = 5000L;
        this.f13681p = 15000L;
        this.f13682q = 3000L;
        this.f13679n = s1.f13758b;
        this.f13683r = new g(e2.n0.S(20L), e2.n0.S(500L));
        this.f13670b = e2.g0.f9663a;
        this.f13684s = 500L;
        this.f13685t = 2000L;
        this.f13686u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f13687w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f13688x = 600000;
        this.f13689y = true;
        this.A = "";
        this.f13674i = -1000;
        new sb.b();
        this.B = true;
    }

    public final j0 a() {
        yb.p(!this.f13690z);
        this.f13690z = true;
        return new j0(this);
    }
}
