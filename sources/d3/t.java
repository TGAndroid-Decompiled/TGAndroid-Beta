package d3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import h9.s1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class t {
    public static final b f7738q = new b(0);
    public final Context f7739a;
    public final r f7740b;
    public final SparseArray f7741c;
    public final boolean d;
    public final e f7742e;
    public final h2.g0 f7743f;
    public final CopyOnWriteArraySet f7744g;
    public final long h;
    public final y f7745i;
    public h2.j0 f7746j = new h2.j0();
    public h2.i0 f7747k;
    public Pair f7748l;
    public int f7749m;
    public int f7750n;
    public long f7751o;
    public int f7752p;

    public t(ai.u uVar) {
        long j3;
        this.f7739a = (Context) uVar.d;
        r rVar = (r) uVar.f1545f;
        rVar.getClass();
        this.f7740b = rVar;
        this.f7741c = new SparseArray();
        h9.g0 g0Var = h9.i0.f13995b;
        s1 s1Var = s1.f14058e;
        this.d = uVar.f1541a;
        h2.g0 g0Var2 = (h2.g0) uVar.f1546g;
        this.f7743f = g0Var2;
        long j10 = uVar.f1543c;
        if (j10 != -9223372036854775807L) {
            j3 = -j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.h = j3;
        y yVar = (y) uVar.h;
        this.f7745i = yVar;
        this.f7742e = new e((x) uVar.f1544e, yVar, g0Var2);
        this.f7744g = new CopyOnWriteArraySet();
        new e2.t().a();
        this.f7751o = -9223372036854775807L;
        this.f7752p = -1;
        this.f7750n = 0;
    }
}
