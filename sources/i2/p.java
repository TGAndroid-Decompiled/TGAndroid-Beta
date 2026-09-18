package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f10837a;
    public final e2.x f10838b;
    public d9.i f10839c;
    public final d d;
    public d9.i e;
    public d9.i f10840f;
    public final d f10841g;
    public final Looper h;
    public final int f10842i;
    public final b2.e f10843j;
    public final int f10844k;
    public final boolean f10845l;
    public final p1 f10846m;
    public final o1 f10847n;
    public final long f10848o;
    public final long f10849p;
    public final long f10850q;
    public final i f10851r;
    public final long f10852s;
    public final long f10853t;
    public final boolean f10854u;
    public boolean v;
    public final String f10855w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f10837a = context;
        this.f10839c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f10840f = sVar;
        this.f10841g = dVar4;
        String str = e2.d0.f7887a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f10843j = b2.e.h;
        this.f10844k = 1;
        this.f10845l = true;
        this.f10846m = p1.e;
        this.f10848o = 5000L;
        this.f10849p = 15000L;
        this.f10850q = 3000L;
        this.f10847n = o1.f10835b;
        this.f10851r = new i(e2.d0.Q(20L), e2.d0.Q(500L));
        this.f10838b = e2.x.f7939a;
        this.f10852s = 500L;
        this.f10853t = 2000L;
        this.f10854u = true;
        this.f10855w = "";
        this.f10842i = -1000;
        new rb.a();
    }

    public final e0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new e0(this);
    }
}
