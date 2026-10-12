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
    public final Context f11099a;
    public final e2.g0 f11100b;
    public d9.u f11101c;
    public final c2.d d;
    public d9.u e;
    public d9.u f11102f;
    public final c2.d f11103g;
    public final Looper h;
    public final int f11104i;
    public final b2.f f11105j;
    public final int f11106k;
    public final boolean f11107l;
    public final t1 f11108m;
    public final s1 f11109n;
    public final long f11110o;
    public final long f11111p;
    public final long f11112q;
    public final g f11113r;
    public final long f11114s;
    public final long f11115t;
    public final int f11116u;
    public final int v;
    public final int f11117w;
    public final int f11118x;
    public final boolean f11119y;
    public boolean f11120z;

    static {
        int i10;
        String str = e2.m0.f8372a;
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
        this.f11099a = context;
        this.f11101c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f11102f = sVar;
        this.f11103g = dVar4;
        String str = e2.m0.f8372a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f11105j = b2.f.f2113i;
        this.f11106k = 1;
        this.f11107l = true;
        this.f11108m = t1.f11193f;
        this.f11110o = 5000L;
        this.f11111p = 15000L;
        this.f11112q = 3000L;
        this.f11109n = s1.f11188b;
        this.f11113r = new g(e2.m0.S(20L), e2.m0.S(500L));
        this.f11100b = e2.g0.f8349a;
        this.f11114s = 500L;
        this.f11115t = 2000L;
        this.f11116u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f11117w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f11118x = 600000;
        this.f11119y = true;
        this.A = "";
        this.f11104i = -1000;
        new pb.a();
        this.B = true;
    }

    public final h0 a() {
        u6.p(!this.f11120z);
        this.f11120z = true;
        return new h0(this);
    }
}
