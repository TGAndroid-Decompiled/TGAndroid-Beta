package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class u {
    public static final b f8078q = new b(0);
    public final Context f8079a;
    public final s f8080b;
    public final SparseArray f8081c;
    public final boolean d;
    public final e f8082e;
    public final h2.g0 f8083f;
    public final CopyOnWriteArraySet f8084g;
    public final long h;
    public final z f8085i;
    public h2.j0 f8086j = new h2.j0();
    public h2.i0 f8087k;
    public Pair f8088l;
    public int f8089m;
    public int f8090n;
    public long f8091o;
    public int f8092p;

    public u(o oVar) {
        long j3;
        this.f8079a = oVar.f8064a;
        s sVar = oVar.f8066c;
        sVar.getClass();
        this.f8080b = sVar;
        this.f8081c = new SparseArray();
        h9.g0 g0Var = h9.i0.f14329b;
        t1 t1Var = t1.f14397e;
        this.d = oVar.d;
        h2.g0 g0Var2 = oVar.f8067e;
        this.f8083f = g0Var2;
        long j10 = oVar.f8069g;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        z zVar = oVar.h;
        this.f8085i = zVar;
        this.f8082e = new e(oVar.f8065b, zVar, g0Var2);
        this.f8084g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f8091o = -9223372036854775807L;
        this.f8092p = -1;
        this.f8090n = 0;
    }
}
