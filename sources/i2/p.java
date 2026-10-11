package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f11814a;
    public final e2.x f11815b;
    public d9.j f11816c;
    public final d d;
    public d9.j f11817e;
    public d9.j f11818f;
    public final d f11819g;
    public final Looper h;
    public final int f11820i;
    public final b2.e f11821j;
    public final int f11822k;
    public final boolean f11823l;
    public final q1 f11824m;
    public final p1 f11825n;
    public final long f11826o;
    public final long f11827p;
    public final long f11828q;
    public final i f11829r;
    public final long f11830s;
    public final long f11831t;
    public final boolean f11832u;
    public boolean v;
    public final String f11833w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f11814a = context;
        this.f11816c = dVar;
        this.d = dVar2;
        this.f11817e = dVar3;
        this.f11818f = sVar;
        this.f11819g = dVar4;
        String str = e2.d0.f8531a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f11821j = b2.e.h;
        this.f11822k = 1;
        this.f11823l = true;
        this.f11824m = q1.f11872e;
        this.f11826o = 5000L;
        this.f11827p = 15000L;
        this.f11828q = 3000L;
        this.f11825n = p1.f11865b;
        this.f11829r = new i(e2.d0.P(20L), e2.d0.P(500L));
        this.f11815b = e2.x.f8589a;
        this.f11830s = 500L;
        this.f11831t = 2000L;
        this.f11832u = true;
        this.f11833w = "";
        this.f11820i = -1000;
        new rb.a();
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
