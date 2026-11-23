package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.t1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class t {
    public static final b f7739q = new b(0);
    public final Context f7740a;
    public final r f7741b;
    public final SparseArray f7742c;
    public final boolean d;
    public final e f7743e;
    public final h2.g0 f7744f;
    public final CopyOnWriteArraySet f7745g;
    public final long h;
    public final y f7746i;
    public h2.j0 f7747j = new h2.j0();
    public h2.i0 f7748k;
    public Pair f7749l;
    public int f7750m;
    public int f7751n;
    public long f7752o;
    public int f7753p;

    public t(ai.t tVar) {
        long j3;
        this.f7740a = (Context) tVar.d;
        r rVar = (r) tVar.f1533f;
        rVar.getClass();
        this.f7741b = rVar;
        this.f7742c = new SparseArray();
        h9.g0 g0Var = h9.i0.f13998b;
        t1 t1Var = t1.f14066e;
        this.d = tVar.f1529a;
        h2.g0 g0Var2 = (h2.g0) tVar.f1534g;
        this.f7744f = g0Var2;
        long j10 = tVar.f1531c;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        y yVar = (y) tVar.h;
        this.f7746i = yVar;
        this.f7743e = new e((x) tVar.f1532e, yVar, g0Var2);
        this.f7745g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f7752o = -9223372036854775807L;
        this.f7753p = -1;
        this.f7751n = 0;
    }
}
