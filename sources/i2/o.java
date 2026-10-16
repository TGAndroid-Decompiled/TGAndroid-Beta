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
    public final Context f11103a;
    public final e2.g0 f11104b;
    public d9.u f11105c;
    public final c2.d d;
    public d9.u e;
    public d9.u f11106f;
    public final c2.d f11107g;
    public final Looper h;
    public final int f11108i;
    public final b2.f f11109j;
    public final int f11110k;
    public final boolean f11111l;
    public final t1 f11112m;
    public final s1 f11113n;
    public final long f11114o;
    public final long f11115p;
    public final long f11116q;
    public final g f11117r;
    public final long f11118s;
    public final long f11119t;
    public final int f11120u;
    public final int v;
    public final int f11121w;
    public final int f11122x;
    public final boolean f11123y;
    public boolean f11124z;

    static {
        int i10;
        String str = e2.m0.f8375a;
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
        this.f11103a = context;
        this.f11105c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f11106f = sVar;
        this.f11107g = dVar4;
        String str = e2.m0.f8375a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f11109j = b2.f.f2117i;
        this.f11110k = 1;
        this.f11111l = true;
        this.f11112m = t1.f11197f;
        this.f11114o = 5000L;
        this.f11115p = 15000L;
        this.f11116q = 3000L;
        this.f11113n = s1.f11192b;
        this.f11117r = new g(e2.m0.S(20L), e2.m0.S(500L));
        this.f11104b = e2.g0.f8352a;
        this.f11118s = 500L;
        this.f11119t = 2000L;
        this.f11120u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f11121w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f11122x = 600000;
        this.f11123y = true;
        this.A = "";
        this.f11108i = -1000;
        new pb.a();
        this.B = true;
    }

    public final h0 a() {
        u6.p(!this.f11124z);
        this.f11124z = true;
        return new h0(this);
    }
}
