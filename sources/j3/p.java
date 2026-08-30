package j3;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f8767a;
    public final h5.y f8768b;
    public r8.i f8769c;
    public final o d;
    public r8.i e;
    public r8.i f8770f;
    public final o f8771g;
    public final Looper h;
    public final l3.d f8772i;
    public final int f8773j;
    public final boolean f8774k;
    public final h2 f8775l;
    public final long f8776m;
    public final long f8777n;
    public final i f8778o;
    public final long f8779p;
    public final long f8780q;
    public final boolean f8781r;
    public boolean f8782s;

    public p(Context context) {
        o oVar = new o(context, 0);
        o oVar2 = new o(context, 1);
        o oVar3 = new o(context, 2);
        f0.d dVar = new f0.d(21);
        o oVar4 = new o(context, 3);
        context.getClass();
        this.f8767a = context;
        this.f8769c = oVar;
        this.d = oVar2;
        this.e = oVar3;
        this.f8770f = dVar;
        this.f8771g = oVar4;
        int i10 = h5.d0.f6937a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f8772i = l3.d.h;
        this.f8773j = 1;
        this.f8774k = true;
        this.f8775l = h2.e;
        this.f8776m = 5000L;
        this.f8777n = 15000L;
        this.f8778o = new i(h5.d0.G(20L), h5.d0.G(500L));
        this.f8768b = h5.y.f7006a;
        this.f8779p = 500L;
        this.f8780q = 2000L;
        this.f8781r = true;
    }
}
