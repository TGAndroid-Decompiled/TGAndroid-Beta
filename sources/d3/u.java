package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class u {
    public static final b f8081q = new b(0);
    public final Context f8082a;
    public final s f8083b;
    public final SparseArray f8084c;
    public final boolean d;
    public final e f8085e;
    public final h2.g0 f8086f;
    public final CopyOnWriteArraySet f8087g;
    public final long h;
    public final z f8088i;
    public h2.j0 f8089j = new h2.j0();
    public h2.i0 f8090k;
    public Pair f8091l;
    public int f8092m;
    public int f8093n;
    public long f8094o;
    public int f8095p;

    public u(o oVar) {
        long j3;
        this.f8082a = oVar.f8067a;
        s sVar = oVar.f8069c;
        sVar.getClass();
        this.f8083b = sVar;
        this.f8084c = new SparseArray();
        h9.g0 g0Var = h9.i0.f14331b;
        t1 t1Var = t1.f14399e;
        this.d = oVar.d;
        h2.g0 g0Var2 = oVar.f8070e;
        this.f8086f = g0Var2;
        long j10 = oVar.f8072g;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        z zVar = oVar.h;
        this.f8088i = zVar;
        this.f8085e = new e(oVar.f8068b, zVar, g0Var2);
        this.f8087g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f8094o = -9223372036854775807L;
        this.f8095p = -1;
        this.f8093n = 0;
    }
}
