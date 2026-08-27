package h3;

import android.content.Context;
import android.os.Looper;

public final class r {

    public final Context f8089a;

    public final d5.b0 f8090b;

    public o8.i f8091c;
    public final p d;

    public o8.i f8092e;

    public o8.i f8093f;

    public final p f8094g;
    public final Looper h;

    public final j3.e f8095i;

    public final int f8096j;

    public final boolean f8097k;

    public final j2 f8098l;

    public final long f8099m;

    public final long f8100n;

    public final i f8101o;

    public final long f8102p;

    public final long f8103q;

    public final boolean f8104r;

    public boolean f8105s;

    public r(Context context) {
        p pVar = new p(context, 0);
        p pVar2 = new p(context, 1);
        p pVar3 = new p(context, 2);
        q qVar = new q(0);
        p pVar4 = new p(context, 3);
        context.getClass();
        this.f8089a = context;
        this.f8091c = pVar;
        this.d = pVar2;
        this.f8092e = pVar3;
        this.f8093f = qVar;
        this.f8094g = pVar4;
        int i10 = d5.g0.f4795a;
        Looper looperMyLooper = Looper.myLooper();
        this.h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f8095i = j3.e.h;
        this.f8096j = 1;
        this.f8097k = true;
        this.f8098l = j2.f7953e;
        this.f8099m = 5000L;
        this.f8100n = 15000L;
        this.f8101o = new i(d5.g0.H(20L), d5.g0.H(500L));
        this.f8090b = d5.b0.f4778a;
        this.f8102p = 500L;
        this.f8103q = 2000L;
        this.f8104r = true;
    }
}
