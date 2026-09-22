package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f10838a;
    public final e2.x f10839b;
    public d9.j f10840c;
    public final d d;
    public d9.j e;
    public d9.j f10841f;
    public final d f10842g;
    public final Looper h;
    public final int f10843i;
    public final b2.e f10844j;
    public final int f10845k;
    public final boolean f10846l;
    public final p1 f10847m;
    public final o1 f10848n;
    public final long f10849o;
    public final long f10850p;
    public final long f10851q;
    public final i f10852r;
    public final long f10853s;
    public final long f10854t;
    public final boolean f10855u;
    public boolean v;
    public final String f10856w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f10838a = context;
        this.f10840c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f10841f = sVar;
        this.f10842g = dVar4;
        String str = e2.d0.f7887a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f10844j = b2.e.h;
        this.f10845k = 1;
        this.f10846l = true;
        this.f10847m = p1.e;
        this.f10849o = 5000L;
        this.f10850p = 15000L;
        this.f10851q = 3000L;
        this.f10848n = o1.f10836b;
        this.f10852r = new i(e2.d0.Q(20L), e2.d0.Q(500L));
        this.f10839b = e2.x.f7939a;
        this.f10853s = 500L;
        this.f10854t = 2000L;
        this.f10855u = true;
        this.f10856w = "";
        this.f10843i = -1000;
        new rb.a();
    }

    public final e0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new e0(this);
    }
}
