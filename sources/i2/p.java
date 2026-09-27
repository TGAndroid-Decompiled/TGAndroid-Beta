package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f10799a;
    public final e2.x f10800b;
    public d9.i f10801c;
    public final d d;
    public d9.i e;
    public d9.i f10802f;
    public final d f10803g;
    public final Looper h;
    public final int f10804i;
    public final b2.e f10805j;
    public final int f10806k;
    public final boolean f10807l;
    public final q1 f10808m;
    public final p1 f10809n;
    public final long f10810o;
    public final long f10811p;
    public final long f10812q;
    public final i f10813r;
    public final long f10814s;
    public final long f10815t;
    public final boolean f10816u;
    public boolean v;
    public final String f10817w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f10799a = context;
        this.f10801c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f10802f = sVar;
        this.f10803g = dVar4;
        String str = e2.d0.f7872a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f10805j = b2.e.h;
        this.f10806k = 1;
        this.f10807l = true;
        this.f10808m = q1.e;
        this.f10810o = 5000L;
        this.f10811p = 15000L;
        this.f10812q = 3000L;
        this.f10809n = p1.f10848b;
        this.f10813r = new i(e2.d0.Q(20L), e2.d0.Q(500L));
        this.f10800b = e2.x.f7924a;
        this.f10814s = 500L;
        this.f10815t = 2000L;
        this.f10816u = true;
        this.f10817w = "";
        this.f10804i = -1000;
        new rb.a();
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
