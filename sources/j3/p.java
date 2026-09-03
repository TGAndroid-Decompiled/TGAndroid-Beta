package j3;

import android.content.Context;
import android.os.Looper;
public final class p {
    public final Context f8749a;
    public final h5.y f8750b;
    public r8.i f8751c;
    public final o d;
    public r8.i e;
    public r8.i f8752f;
    public final o f8753g;
    public final Looper h;
    public final l3.d f8754i;
    public final int f8755j;
    public final boolean f8756k;
    public final h2 f8757l;
    public final long f8758m;
    public final long f8759n;
    public final i f8760o;
    public final long f8761p;
    public final long f8762q;
    public final boolean f8763r;
    public boolean f8764s;

    public p(Context context) {
        o oVar = new o(context, 0);
        o oVar2 = new o(context, 1);
        o oVar3 = new o(context, 2);
        f0.d dVar = new f0.d(21);
        o oVar4 = new o(context, 3);
        context.getClass();
        this.f8749a = context;
        this.f8751c = oVar;
        this.d = oVar2;
        this.e = oVar3;
        this.f8752f = dVar;
        this.f8753g = oVar4;
        int i10 = h5.d0.f6924a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f8754i = l3.d.h;
        this.f8755j = 1;
        this.f8756k = true;
        this.f8757l = h2.e;
        this.f8758m = 5000L;
        this.f8759n = 15000L;
        this.f8760o = new i(h5.d0.G(20L), h5.d0.G(500L));
        this.f8750b = h5.y.f6993a;
        this.f8761p = 500L;
        this.f8762q = 2000L;
        this.f8763r = true;
    }
}
