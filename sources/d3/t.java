package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class t {
    public static final b f7776q = new b(0);
    public final Context f7777a;
    public final r f7778b;
    public final SparseArray f7779c;
    public final boolean d;
    public final e f7780e;
    public final h2.g0 f7781f;
    public final CopyOnWriteArraySet f7782g;
    public final long h;
    public final y f7783i;
    public h2.j0 f7784j = new h2.j0();
    public h2.i0 f7785k;
    public Pair f7786l;
    public int f7787m;
    public int f7788n;
    public long f7789o;
    public int f7790p;

    public t(ai.x xVar) {
        long j3;
        this.f7777a = (Context) xVar.d;
        r rVar = (r) xVar.f1610f;
        rVar.getClass();
        this.f7778b = rVar;
        this.f7779c = new SparseArray();
        h9.g0 g0Var = h9.i0.f14035b;
        t1 t1Var = t1.f14103e;
        this.d = xVar.f1606a;
        h2.g0 g0Var2 = (h2.g0) xVar.f1611g;
        this.f7781f = g0Var2;
        long j10 = xVar.f1608c;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        y yVar = (y) xVar.h;
        this.f7783i = yVar;
        this.f7780e = new e((x) xVar.f1609e, yVar, g0Var2);
        this.f7782g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f7789o = -9223372036854775807L;
        this.f7790p = -1;
        this.f7788n = 0;
    }
}
