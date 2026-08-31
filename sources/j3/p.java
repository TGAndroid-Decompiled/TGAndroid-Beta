package j3;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f9354a;
    public final h5.y f9355b;
    public r8.i f9356c;
    public final o d;
    public r8.i f9357e;
    public r8.i f9358f;
    public final o f9359g;
    public final Looper h;
    public final l3.d f9360i;
    public final int f9361j;
    public final boolean f9362k;
    public final h2 f9363l;
    public final long f9364m;
    public final long f9365n;
    public final i f9366o;
    public final long f9367p;
    public final long f9368q;
    public final boolean f9369r;
    public boolean f9370s;

    public p(Context context) {
        o oVar = new o(context, 0);
        o oVar2 = new o(context, 1);
        o oVar3 = new o(context, 2);
        f5.u uVar = new f5.u(21);
        o oVar4 = new o(context, 3);
        context.getClass();
        this.f9354a = context;
        this.f9356c = oVar;
        this.d = oVar2;
        this.f9357e = oVar3;
        this.f9358f = uVar;
        this.f9359g = oVar4;
        int i10 = h5.d0.f7237a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f9360i = l3.d.h;
        this.f9361j = 1;
        this.f9362k = true;
        this.f9363l = h2.f9181e;
        this.f9364m = 5000L;
        this.f9365n = 15000L;
        this.f9366o = new i(h5.d0.G(20L), h5.d0.G(500L));
        this.f9355b = h5.y.f7314a;
        this.f9367p = 500L;
        this.f9368q = 2000L;
        this.f9369r = true;
    }
}
