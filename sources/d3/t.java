package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.s1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class t {
    public static final b f7461q = new b(0);
    public final Context f7462a;
    public final r f7463b;
    public final SparseArray f7464c;
    public final boolean d;
    public final e f7465e;
    public final h2.g0 f7466f;
    public final CopyOnWriteArraySet f7467g;
    public final long h;
    public final y f7468i;
    public h2.j0 f7469j = new h2.j0();
    public h2.i0 f7470k;
    public Pair f7471l;
    public int f7472m;
    public int f7473n;
    public long f7474o;
    public int f7475p;

    public t(ai.w wVar) {
        long j3;
        this.f7462a = (Context) wVar.d;
        r rVar = (r) wVar.f1603f;
        rVar.getClass();
        this.f7463b = rVar;
        this.f7464c = new SparseArray();
        h9.g0 g0Var = h9.i0.f13686b;
        s1 s1Var = s1.f13749e;
        this.d = wVar.f1599a;
        h2.g0 g0Var2 = (h2.g0) wVar.f1604g;
        this.f7466f = g0Var2;
        long j10 = wVar.f1601c;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        y yVar = (y) wVar.h;
        this.f7468i = yVar;
        this.f7465e = new e((x) wVar.f1602e, yVar, g0Var2);
        this.f7467g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f7474o = -9223372036854775807L;
        this.f7475p = -1;
        this.f7473n = 0;
    }
}
