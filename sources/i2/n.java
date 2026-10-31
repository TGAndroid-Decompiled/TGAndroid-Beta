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
    public final Context f7987a;
    public final e2.g0 f7988b;
    public d9.t f7989c;
    public final c2.c d;
    public d9.t e;
    public d9.t f7990f;
    public final c2.c f7991g;
    public final Looper h;
    public final int f7992i;
    public final b2.f f7993j;
    public final int f7994k;
    public final boolean f7995l;
    public final v1 f7996m;
    public final u1 f7997n;
    public final long f7998o;
    public final long f7999p;
    public final long f8000q;
    public final f f8001r;
    public final long f8002s;
    public final long f8003t;
    public final int f8004u;
    public final int v;
    public final int f8005w;
    public final int f8006x;
    public final boolean f8007y;
    public boolean f8008z;

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
        this.f7987a = context;
        this.f7989c = cVar;
        this.d = cVar2;
        this.e = cVar3;
        this.f7990f = sVar;
        this.f7991g = cVar4;
        String str = e2.l0.f6165a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f7993j = b2.f.f2027i;
        this.f7994k = 1;
        this.f7995l = true;
        this.f7996m = v1.f8102f;
        this.f7998o = 5000L;
        this.f7999p = 15000L;
        this.f8000q = 3000L;
        this.f7997n = u1.f8093b;
        this.f8001r = new f(e2.l0.S(20L), e2.l0.S(500L));
        this.f7988b = e2.g0.f6143a;
        this.f8002s = 500L;
        this.f8003t = 2000L;
        this.f8004u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f8005w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f8006x = 600000;
        this.f8007y = true;
        this.A = "";
        this.f7992i = -1000;
        new t7.u();
        this.B = true;
    }

    public final i0 a() {
        t6.p(!this.f8008z);
        this.f8008z = true;
        return new i0(this);
    }
}
