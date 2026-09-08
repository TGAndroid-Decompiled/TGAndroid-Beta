package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.a1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class w {
    public static final b f205o = new b(0);
    public final Context f206a;
    public final u f207b;
    public final SparseArray f208c;
    public final boolean d;
    public final f f209e;
    public final e2.x f210f;
    public final CopyOnWriteArraySet f211g;
    public e2.a0 h = new e2.a0();
    public e2.z f212i;
    public Pair f213j;
    public int f214k;
    public int f215l;
    public long f216m;
    public int f217n;

    public w(q qVar) {
        this.f206a = (Context) qVar.f195c;
        u uVar = (u) qVar.f196e;
        e2.d.h(uVar);
        this.f207b = uVar;
        this.f208c = new SparseArray();
        e9.g0 g0Var = e9.i0.f8985b;
        a1 a1Var = a1.f8948e;
        this.d = qVar.f193a;
        e2.x xVar = (e2.x) qVar.f197f;
        this.f210f = xVar;
        this.f209e = new f((a0) qVar.d, xVar);
        this.f211g = new CopyOnWriteArraySet();
        new b2.r().a();
        this.f216m = -9223372036854775807L;
        this.f217n = -1;
        this.f215l = 0;
    }
}
