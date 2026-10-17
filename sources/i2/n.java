package i2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import v7.s6;
import v7.u6;
public final class n {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context f12494a;
    public final e2.g0 f12495b;
    public d9.u f12496c;
    public final c2.d d;
    public d9.u e;
    public d9.u f12497f;
    public final c2.d f12498g;
    public final Looper h;
    public final int f12499i;
    public final b2.f f12500j;
    public final int f12501k;
    public final boolean f12502l;
    public final r1 f12503m;
    public final q1 f12504n;
    public final long f12505o;
    public final long f12506p;
    public final long f12507q;
    public final f f12508r;
    public final long f12509s;
    public final long f12510t;
    public final int f12511u;
    public final int v;
    public final int f12512w;
    public final int f12513x;
    public final boolean f12514y;
    public boolean f12515z;

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

    public n(Context context) {
        int i10;
        c2.d dVar = new c2.d(context, 1);
        c2.d dVar2 = new c2.d(context, 2);
        c2.d dVar3 = new c2.d(context, 3);
        a3.s sVar = new a3.s(3);
        c2.d dVar4 = new c2.d(context, 4);
        context.getClass();
        this.f12494a = context;
        this.f12496c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f12497f = sVar;
        this.f12498g = dVar4;
        String str = e2.m0.f8254a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f12500j = b2.f.f3740i;
        this.f12501k = 1;
        this.f12502l = true;
        this.f12503m = r1.f12581f;
        this.f12505o = 5000L;
        this.f12506p = 15000L;
        this.f12507q = 3000L;
        this.f12504n = q1.f12577b;
        this.f12508r = new f(e2.m0.S(20L), e2.m0.S(500L));
        this.f12495b = e2.g0.f8231a;
        this.f12509s = 500L;
        this.f12510t = 2000L;
        this.f12511u = 600000;
        boolean z10 = D;
        if (z10) {
            i10 = C;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.v = i10;
        this.f12512w = z10 ? 60000 : Integer.MAX_VALUE;
        this.f12513x = 600000;
        this.f12514y = true;
        this.A = "";
        this.f12499i = -1000;
        new pb.a();
        this.B = true;
    }

    public final g0 a() {
        u6.p(!this.f12515z);
        this.f12515z = true;
        return new g0(this);
    }
}
