package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.a1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class w {
    public static final b f188o = new b(0);
    public final Context f189a;
    public final u f190b;
    public final SparseArray f191c;
    public final boolean d;
    public final f e;
    public final e2.x f192f;
    public final CopyOnWriteArraySet f193g;
    public e2.a0 h = new e2.a0();
    public e2.z f194i;
    public Pair f195j;
    public int f196k;
    public int f197l;
    public long f198m;
    public int f199n;

    public w(q qVar) {
        this.f189a = (Context) qVar.f180c;
        u uVar = (u) qVar.e;
        e2.d.h(uVar);
        this.f190b = uVar;
        this.f191c = new SparseArray();
        e9.g0 g0Var = e9.i0.f7384b;
        a1 a1Var = a1.e;
        this.d = qVar.f178a;
        e2.x xVar = (e2.x) qVar.f181f;
        this.f192f = xVar;
        this.e = new f((a0) qVar.d, xVar);
        this.f193g = new CopyOnWriteArraySet();
        new b2.r().a();
        this.f198m = -9223372036854775807L;
        this.f199n = -1;
        this.f197l = 0;
    }
}
