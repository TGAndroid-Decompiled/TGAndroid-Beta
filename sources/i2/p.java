package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f11815a;
    public final e2.x f11816b;
    public d9.j f11817c;
    public final d d;
    public d9.j f11818e;
    public d9.j f11819f;
    public final d f11820g;
    public final Looper h;
    public final int f11821i;
    public final b2.e f11822j;
    public final int f11823k;
    public final boolean f11824l;
    public final q1 f11825m;
    public final p1 f11826n;
    public final long f11827o;
    public final long f11828p;
    public final long f11829q;
    public final i f11830r;
    public final long f11831s;
    public final long f11832t;
    public final boolean f11833u;
    public boolean v;
    public final String f11834w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f11815a = context;
        this.f11817c = dVar;
        this.d = dVar2;
        this.f11818e = dVar3;
        this.f11819f = sVar;
        this.f11820g = dVar4;
        String str = e2.d0.f8532a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f11822j = b2.e.h;
        this.f11823k = 1;
        this.f11824l = true;
        this.f11825m = q1.f11873e;
        this.f11827o = 5000L;
        this.f11828p = 15000L;
        this.f11829q = 3000L;
        this.f11826n = p1.f11866b;
        this.f11830r = new i(e2.d0.P(20L), e2.d0.P(500L));
        this.f11816b = e2.x.f8590a;
        this.f11831s = 500L;
        this.f11832t = 2000L;
        this.f11833u = true;
        this.f11834w = "";
        this.f11821i = -1000;
        new rb.a();
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
