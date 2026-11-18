package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class t {
    public static final b f7744q = new b(0);
    public final Context f7745a;
    public final r f7746b;
    public final SparseArray f7747c;
    public final boolean d;
    public final e f7748e;
    public final h2.g0 f7749f;
    public final CopyOnWriteArraySet f7750g;
    public final long h;
    public final y f7751i;
    public h2.j0 f7752j = new h2.j0();
    public h2.i0 f7753k;
    public Pair f7754l;
    public int f7755m;
    public int f7756n;
    public long f7757o;
    public int f7758p;

    public t(ai.x xVar) {
        long j3;
        this.f7745a = (Context) xVar.d;
        r rVar = (r) xVar.f1604f;
        rVar.getClass();
        this.f7746b = rVar;
        this.f7747c = new SparseArray();
        h9.g0 g0Var = h9.i0.f14003b;
        t1 t1Var = t1.f14071e;
        this.d = xVar.f1600a;
        h2.g0 g0Var2 = (h2.g0) xVar.f1605g;
        this.f7749f = g0Var2;
        long j10 = xVar.f1602c;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        y yVar = (y) xVar.h;
        this.f7751i = yVar;
        this.f7748e = new e((x) xVar.f1603e, yVar, g0Var2);
        this.f7750g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f7757o = -9223372036854775807L;
        this.f7758p = -1;
        this.f7756n = 0;
    }
}
