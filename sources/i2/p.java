package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f10810a;
    public final e2.x f10811b;
    public d9.i f10812c;
    public final d d;
    public d9.i e;
    public d9.i f10813f;
    public final d f10814g;
    public final Looper h;
    public final int f10815i;
    public final b2.e f10816j;
    public final int f10817k;
    public final boolean f10818l;
    public final q1 f10819m;
    public final p1 f10820n;
    public final long f10821o;
    public final long f10822p;
    public final long f10823q;
    public final i f10824r;
    public final long f10825s;
    public final long f10826t;
    public final boolean f10827u;
    public boolean v;
    public final String f10828w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f10810a = context;
        this.f10812c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f10813f = sVar;
        this.f10814g = dVar4;
        String str = e2.d0.f7882a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f10816j = b2.e.h;
        this.f10817k = 1;
        this.f10818l = true;
        this.f10819m = q1.e;
        this.f10821o = 5000L;
        this.f10822p = 15000L;
        this.f10823q = 3000L;
        this.f10820n = p1.f10859b;
        this.f10824r = new i(e2.d0.Q(20L), e2.d0.Q(500L));
        this.f10811b = e2.x.f7934a;
        this.f10825s = 500L;
        this.f10826t = 2000L;
        this.f10827u = true;
        this.f10828w = "";
        this.f10815i = -1000;
        new rb.a();
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
