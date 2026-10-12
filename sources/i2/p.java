package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f11813a;
    public final e2.x f11814b;
    public d9.j f11815c;
    public final d d;
    public d9.j f11816e;
    public d9.j f11817f;
    public final d f11818g;
    public final Looper h;
    public final int f11819i;
    public final b2.e f11820j;
    public final int f11821k;
    public final boolean f11822l;
    public final q1 f11823m;
    public final p1 f11824n;
    public final long f11825o;
    public final long f11826p;
    public final long f11827q;
    public final i f11828r;
    public final long f11829s;
    public final long f11830t;
    public final boolean f11831u;
    public boolean v;
    public final String f11832w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f11813a = context;
        this.f11815c = dVar;
        this.d = dVar2;
        this.f11816e = dVar3;
        this.f11817f = sVar;
        this.f11818g = dVar4;
        String str = e2.d0.f8529a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f11820j = b2.e.h;
        this.f11821k = 1;
        this.f11822l = true;
        this.f11823m = q1.f11871e;
        this.f11825o = 5000L;
        this.f11826p = 15000L;
        this.f11827q = 3000L;
        this.f11824n = p1.f11864b;
        this.f11828r = new i(e2.d0.P(20L), e2.d0.P(500L));
        this.f11814b = e2.x.f8587a;
        this.f11829s = 500L;
        this.f11830t = 2000L;
        this.f11831u = true;
        this.f11832w = "";
        this.f11819i = -1000;
        new rb.a(10);
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
