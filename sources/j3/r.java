package j3;

import android.content.Context;
import android.os.Looper;
public final class r {
    public final Context f10706a;
    public final f5.y f10707b;
    public p8.i f10708c;
    public final p d;
    public p8.i f10709e;
    public p8.i f10710f;
    public final p f10711g;
    public final Looper h;
    public final l3.e f10712i;
    public final int f10713j;
    public final boolean f10714k;
    public final j2 f10715l;
    public final long f10716m;
    public final long f10717n;
    public final i f10718o;
    public final long f10719p;
    public final long f10720q;
    public final boolean f10721r;
    public boolean f10722s;

    public r(Context context) {
        p pVar = new p(context, 0);
        p pVar2 = new p(context, 1);
        p pVar3 = new p(context, 2);
        q qVar = new q(0);
        p pVar4 = new p(context, 3);
        context.getClass();
        this.f10706a = context;
        this.f10708c = pVar;
        this.d = pVar2;
        this.f10709e = pVar3;
        this.f10710f = qVar;
        this.f10711g = pVar4;
        int i10 = f5.d0.f6579a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f10712i = l3.e.h;
        this.f10713j = 1;
        this.f10714k = true;
        this.f10715l = j2.f10560e;
        this.f10716m = 5000L;
        this.f10717n = 15000L;
        this.f10718o = new i(f5.d0.H(20L), f5.d0.H(500L));
        this.f10707b = f5.y.f6646a;
        this.f10719p = 500L;
        this.f10720q = 2000L;
        this.f10721r = true;
    }
}
