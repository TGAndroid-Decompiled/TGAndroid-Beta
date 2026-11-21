package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class t {
    public static final b f7773q = new b(0);
    public final Context f7774a;
    public final r f7775b;
    public final SparseArray f7776c;
    public final boolean d;
    public final e f7777e;
    public final h2.g0 f7778f;
    public final CopyOnWriteArraySet f7779g;
    public final long h;
    public final y f7780i;
    public h2.j0 f7781j = new h2.j0();
    public h2.i0 f7782k;
    public Pair f7783l;
    public int f7784m;
    public int f7785n;
    public long f7786o;
    public int f7787p;

    public t(ai.x xVar) {
        long j3;
        this.f7774a = (Context) xVar.d;
        r rVar = (r) xVar.f1599f;
        rVar.getClass();
        this.f7775b = rVar;
        this.f7776c = new SparseArray();
        h9.g0 g0Var = h9.i0.f14032b;
        t1 t1Var = t1.f14100e;
        this.d = xVar.f1595a;
        h2.g0 g0Var2 = (h2.g0) xVar.f1600g;
        this.f7778f = g0Var2;
        long j10 = xVar.f1597c;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        y yVar = (y) xVar.h;
        this.f7780i = yVar;
        this.f7777e = new e((x) xVar.f1598e, yVar, g0Var2);
        this.f7779g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f7786o = -9223372036854775807L;
        this.f7787p = -1;
        this.f7785n = 0;
    }
}
