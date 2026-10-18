package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.x1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class w {
    public static final b f192q = new b(0);
    public final Context f193a;
    public final u f194b;
    public final SparseArray f195c;
    public final boolean d;
    public final f e;
    public final e2.g0 f196f;
    public final CopyOnWriteArraySet f197g;
    public final long h;
    public final b0 f198i;
    public e2.j0 f199j = new e2.j0();
    public e2.i0 f200k;
    public Pair f201l;
    public int f202m;
    public int f203n;
    public long f204o;
    public int f205p;

    public w(q qVar) {
        long j10;
        this.f193a = qVar.f180a;
        u uVar = qVar.f182c;
        uVar.getClass();
        this.f194b = uVar;
        this.f195c = new SparseArray();
        e9.l0 l0Var = e9.n0.f8477b;
        x1 x1Var = x1.e;
        this.d = qVar.d;
        e2.g0 g0Var = qVar.e;
        this.f196f = g0Var;
        long j11 = qVar.f184g;
        if (j11 != -9223372036854775807L) {
            j10 = -j11;
        } else {
            j10 = -9223372036854775807L;
        }
        this.h = j10;
        b0 b0Var = qVar.h;
        this.f198i = b0Var;
        this.e = new f(qVar.f181b, b0Var, g0Var);
        this.f197g = new CopyOnWriteArraySet();
        new b2.v().a();
        this.f204o = -9223372036854775807L;
        this.f205p = -1;
        this.f203n = 0;
    }
}
