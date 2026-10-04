package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f11765a;
    public final e2.x f11766b;
    public d9.i f11767c;
    public final d d;
    public d9.i f11768e;
    public d9.i f11769f;
    public final d f11770g;
    public final Looper h;
    public final int f11771i;
    public final b2.e f11772j;
    public final int f11773k;
    public final boolean f11774l;
    public final q1 f11775m;
    public final p1 f11776n;
    public final long f11777o;
    public final long f11778p;
    public final long f11779q;
    public final i f11780r;
    public final long f11781s;
    public final long f11782t;
    public final boolean f11783u;
    public boolean v;
    public final String f11784w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f11765a = context;
        this.f11767c = dVar;
        this.d = dVar2;
        this.f11768e = dVar3;
        this.f11769f = sVar;
        this.f11770g = dVar4;
        String str = e2.d0.f8538a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f11772j = b2.e.h;
        this.f11773k = 1;
        this.f11774l = true;
        this.f11775m = q1.f11823e;
        this.f11777o = 5000L;
        this.f11778p = 15000L;
        this.f11779q = 3000L;
        this.f11776n = p1.f11816b;
        this.f11780r = new i(e2.d0.Q(20L), e2.d0.Q(500L));
        this.f11766b = e2.x.f8596a;
        this.f11781s = 500L;
        this.f11782t = 2000L;
        this.f11783u = true;
        this.f11784w = "";
        this.f11771i = -1000;
        new rb.a();
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
