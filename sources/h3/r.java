package h3;

import android.content.Context;
import android.os.Looper;
public final class r {
    public final Context f9669a;
    public final d5.a0 f9670b;
    public n8.i f9671c;
    public final p d;
    public n8.i f9672e;
    public n8.i f9673f;
    public final p f9674g;
    public final Looper h;
    public final j3.e f9675i;
    public final int f9676j;
    public final boolean f9677k;
    public final j2 f9678l;
    public final long f9679m;
    public final long f9680n;
    public final i f9681o;
    public final long f9682p;
    public final long f9683q;
    public final boolean f9684r;
    public boolean f9685s;

    public r(Context context) {
        p pVar = new p(context, 0);
        p pVar2 = new p(context, 1);
        p pVar3 = new p(context, 2);
        q qVar = new q(0);
        p pVar4 = new p(context, 3);
        context.getClass();
        this.f9669a = context;
        this.f9671c = pVar;
        this.d = pVar2;
        this.f9672e = pVar3;
        this.f9673f = qVar;
        this.f9674g = pVar4;
        int i9 = d5.f0.f4349a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f9675i = j3.e.h;
        this.f9676j = 1;
        this.f9677k = true;
        this.f9678l = j2.f9523e;
        this.f9679m = 5000L;
        this.f9680n = 15000L;
        this.f9681o = new i(d5.f0.H(20L), d5.f0.H(500L));
        this.f9670b = d5.a0.f4330a;
        this.f9682p = 500L;
        this.f9683q = 2000L;
        this.f9684r = true;
    }
}
