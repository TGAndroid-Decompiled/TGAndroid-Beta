package i2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import v7.r6;
import v7.t6;
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f7988a;
    public final e2.g0 f7989b;
    public d9.t f7990c;
    public final c2.c d;
    public d9.t e;
    public d9.t f7991f;
    public final c2.c f7992g;
    public final Looper h;
    public final int f7993i;
    public final b2.f f7994j;
    public final int f7995k;
    public final boolean f7996l;
    public final v1 f7997m;
    public final u1 f7998n;
    public final long f7999o;
    public final long f8000p;
    public final long f8001q;
    public final f f8002r;
    public final long f8003s;
    public final long f8004t;
    public final int f8005u;
    public final int v;
    public final int f8006w;
    public final int f8007x;
    public final boolean f8008y;
    public boolean f8009z;

    static {
        int i10;
        String str = e2.l0.f6165a;
        String c10 = r6.c(Build.DEVICE);
        if (!c10.contains("emulator") && !c10.contains("emu64a") && !c10.contains("emu64x") && !c10.contains("generic")) {
            i10 = 10000;
        } else {
            i10 = 30000;
        }
        C = i10;
        D = true;
    }

    public n(Context context) {
        int i10;
        c2.c cVar = new c2.c(context, 1);
        c2.c cVar2 = new c2.c(context, 2);
        c2.c cVar3 = new c2.c(context, 3);
        a3.s sVar = new a3.s(3);
        c2.c cVar4 = new c2.c(context, 4);
        context.getClass();
        this.f7988a = context;
        this.f7990c = cVar;
        this.d = cVar2;
        this.e = cVar3;
        this.f7991f = sVar;
        this.f7992g = cVar4;
        String str = e2.l0.f6165a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f7994j = b2.f.f2027i;
        this.f7995k = 1;
        this.f7996l = true;
        this.f7997m = v1.f8103f;
        this.f7999o = 5000L;
        this.f8000p = 15000L;
        this.f8001q = 3000L;
        this.f7998n = u1.f8094b;
        this.f8002r = new f(e2.l0.S(20L), e2.l0.S(500L));
        this.f7989b = e2.g0.f6143a;
        this.f8003s = 500L;
        this.f8004t = 2000L;
        this.f8005u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f8006w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f8007x = 600000;
        this.f8008y = true;
        this.A = "";
        this.f7993i = -1000;
        new t7.u();
        this.B = true;
    }

    public final i0 a() {
        t6.p(!this.f8009z);
        this.f8009z = true;
        return new i0(this);
    }
}
