package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class t {
    public static final b f7747q = new b(0);
    public final Context f7748a;
    public final r f7749b;
    public final SparseArray f7750c;
    public final boolean d;
    public final e f7751e;
    public final h2.g0 f7752f;
    public final CopyOnWriteArraySet f7753g;
    public final long h;
    public final y f7754i;
    public h2.j0 f7755j = new h2.j0();
    public h2.i0 f7756k;
    public Pair f7757l;
    public int f7758m;
    public int f7759n;
    public long f7760o;
    public int f7761p;

    public t(ai.x xVar) {
        long j3;
        this.f7748a = (Context) xVar.d;
        r rVar = (r) xVar.f1603f;
        rVar.getClass();
        this.f7749b = rVar;
        this.f7750c = new SparseArray();
        h9.g0 g0Var = h9.i0.f14006b;
        t1 t1Var = t1.f14074e;
        this.d = xVar.f1599a;
        h2.g0 g0Var2 = (h2.g0) xVar.f1604g;
        this.f7752f = g0Var2;
        long j10 = xVar.f1601c;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        y yVar = (y) xVar.h;
        this.f7754i = yVar;
        this.f7751e = new e((x) xVar.f1602e, yVar, g0Var2);
        this.f7753g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f7760o = -9223372036854775807L;
        this.f7761p = -1;
        this.f7759n = 0;
    }
}
