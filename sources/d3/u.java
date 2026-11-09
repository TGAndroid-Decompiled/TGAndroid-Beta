package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class u {
    public static final b f8076q = new b(0);
    public final Context f8077a;
    public final s f8078b;
    public final SparseArray f8079c;
    public final boolean d;
    public final e f8080e;
    public final h2.g0 f8081f;
    public final CopyOnWriteArraySet f8082g;
    public final long h;
    public final z f8083i;
    public h2.j0 f8084j = new h2.j0();
    public h2.i0 f8085k;
    public Pair f8086l;
    public int f8087m;
    public int f8088n;
    public long f8089o;
    public int f8090p;

    public u(o oVar) {
        long j3;
        this.f8077a = oVar.f8062a;
        s sVar = oVar.f8064c;
        sVar.getClass();
        this.f8078b = sVar;
        this.f8079c = new SparseArray();
        h9.g0 g0Var = h9.i0.f14329b;
        t1 t1Var = t1.f14397e;
        this.d = oVar.d;
        h2.g0 g0Var2 = oVar.f8065e;
        this.f8081f = g0Var2;
        long j10 = oVar.f8067g;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        z zVar = oVar.h;
        this.f8083i = zVar;
        this.f8080e = new e(oVar.f8063b, zVar, g0Var2);
        this.f8082g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f8089o = -9223372036854775807L;
        this.f8090p = -1;
        this.f8088n = 0;
    }
}
