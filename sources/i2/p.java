package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f11764a;
    public final e2.x f11765b;
    public d9.i f11766c;
    public final d d;
    public d9.i f11767e;
    public d9.i f11768f;
    public final d f11769g;
    public final Looper h;
    public final int f11770i;
    public final b2.e f11771j;
    public final int f11772k;
    public final boolean f11773l;
    public final q1 f11774m;
    public final p1 f11775n;
    public final long f11776o;
    public final long f11777p;
    public final long f11778q;
    public final i f11779r;
    public final long f11780s;
    public final long f11781t;
    public final boolean f11782u;
    public boolean v;
    public final String f11783w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f11764a = context;
        this.f11766c = dVar;
        this.d = dVar2;
        this.f11767e = dVar3;
        this.f11768f = sVar;
        this.f11769g = dVar4;
        String str = e2.d0.f8537a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f11771j = b2.e.h;
        this.f11772k = 1;
        this.f11773l = true;
        this.f11774m = q1.f11822e;
        this.f11776o = 5000L;
        this.f11777p = 15000L;
        this.f11778q = 3000L;
        this.f11775n = p1.f11815b;
        this.f11779r = new i(e2.d0.Q(20L), e2.d0.Q(500L));
        this.f11765b = e2.x.f8595a;
        this.f11780s = 500L;
        this.f11781t = 2000L;
        this.f11782u = true;
        this.f11783w = "";
        this.f11770i = -1000;
        new rb.a();
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
