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
    public final Context f13670a;
    public final e2.g0 f13671b;
    public e9.t f13672c;
    public final c2.d d;
    public e9.t e;
    public e9.t f13673f;
    public final c2.d f13674g;
    public final Looper h;
    public final int f13675i;
    public final b2.f f13676j;
    public final int f13677k;
    public final boolean f13678l;
    public final t1 f13679m;
    public final s1 f13680n;
    public final long f13681o;
    public final long f13682p;
    public final long f13683q;
    public final g f13684r;
    public final long f13685s;
    public final long f13686t;
    public final int f13687u;
    public final int v;
    public final int f13688w;
    public final int f13689x;
    public final boolean f13690y;
    public boolean f13691z;

    static {
        int i10;
        String str = e2.n0.f9692a;
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
        this.f13670a = context;
        this.f13672c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f13673f = sVar;
        this.f13674g = dVar4;
        String str = e2.n0.f9692a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f13676j = b2.f.f3180i;
        this.f13677k = 1;
        this.f13678l = true;
        this.f13679m = t1.f13767f;
        this.f13681o = 5000L;
        this.f13682p = 15000L;
        this.f13683q = 3000L;
        this.f13680n = s1.f13759b;
        this.f13684r = new g(e2.n0.S(20L), e2.n0.S(500L));
        this.f13671b = e2.g0.f9664a;
        this.f13685s = 500L;
        this.f13686t = 2000L;
        this.f13687u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f13688w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f13689x = 600000;
        this.f13690y = true;
        this.A = "";
        this.f13675i = -1000;
        new sb.b();
        this.B = true;
    }

    public final j0 a() {
        yb.p(!this.f13691z);
        this.f13691z = true;
        return new j0(this);
    }
}
