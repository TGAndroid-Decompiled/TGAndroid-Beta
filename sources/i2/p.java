package i2;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f10796a;
    public final e2.x f10797b;
    public d9.i f10798c;
    public final d d;
    public d9.i e;
    public d9.i f10799f;
    public final d f10800g;
    public final Looper h;
    public final int f10801i;
    public final b2.e f10802j;
    public final int f10803k;
    public final boolean f10804l;
    public final q1 f10805m;
    public final p1 f10806n;
    public final long f10807o;
    public final long f10808p;
    public final long f10809q;
    public final i f10810r;
    public final long f10811s;
    public final long f10812t;
    public final boolean f10813u;
    public boolean v;
    public final String f10814w;

    public p(Context context) {
        d dVar = new d(context, 1);
        d dVar2 = new d(context, 2);
        d dVar3 = new d(context, 3);
        a3.s sVar = new a3.s(3);
        d dVar4 = new d(context, 4);
        context.getClass();
        this.f10796a = context;
        this.f10798c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f10799f = sVar;
        this.f10800g = dVar4;
        String str = e2.d0.f7870a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f10802j = b2.e.h;
        this.f10803k = 1;
        this.f10804l = true;
        this.f10805m = q1.e;
        this.f10807o = 5000L;
        this.f10808p = 15000L;
        this.f10809q = 3000L;
        this.f10806n = p1.f10845b;
        this.f10810r = new i(e2.d0.Q(20L), e2.d0.Q(500L));
        this.f10797b = e2.x.f7922a;
        this.f10811s = 500L;
        this.f10812t = 2000L;
        this.f10813u = true;
        this.f10814w = "";
        this.f10801i = -1000;
        new rb.a();
    }

    public final f0 a() {
        e2.d.g(!this.v);
        this.v = true;
        return new f0(this);
    }
}
