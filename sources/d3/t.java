package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.s1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class t {
    public static final b f7464q = new b(0);
    public final Context f7465a;
    public final r f7466b;
    public final SparseArray f7467c;
    public final boolean d;
    public final e f7468e;
    public final h2.g0 f7469f;
    public final CopyOnWriteArraySet f7470g;
    public final long h;
    public final y f7471i;
    public h2.j0 f7472j = new h2.j0();
    public h2.i0 f7473k;
    public Pair f7474l;
    public int f7475m;
    public int f7476n;
    public long f7477o;
    public int f7478p;

    public t(ai.x xVar) {
        long j3;
        this.f7465a = (Context) xVar.d;
        r rVar = (r) xVar.f1612f;
        rVar.getClass();
        this.f7466b = rVar;
        this.f7467c = new SparseArray();
        h9.g0 g0Var = h9.i0.f13686b;
        s1 s1Var = s1.f13749e;
        this.d = xVar.f1608a;
        h2.g0 g0Var2 = (h2.g0) xVar.f1613g;
        this.f7469f = g0Var2;
        long j10 = xVar.f1610c;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        y yVar = (y) xVar.h;
        this.f7471i = yVar;
        this.f7468e = new e((x) xVar.f1611e, yVar, g0Var2);
        this.f7470g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f7477o = -9223372036854775807L;
        this.f7478p = -1;
        this.f7476n = 0;
    }
}
