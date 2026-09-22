package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.a1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class w {
    public static final b f190o = new b(0);
    public final Context f191a;
    public final u f192b;
    public final SparseArray f193c;
    public final boolean d;
    public final f e;
    public final e2.x f194f;
    public final CopyOnWriteArraySet f195g;
    public e2.a0 h = new e2.a0();
    public e2.z f196i;
    public Pair f197j;
    public int f198k;
    public int f199l;
    public long f200m;
    public int f201n;

    public w(q qVar) {
        this.f191a = (Context) qVar.f182c;
        u uVar = (u) qVar.e;
        e2.d.h(uVar);
        this.f192b = uVar;
        this.f193c = new SparseArray();
        e9.g0 g0Var = e9.i0.f8081b;
        a1 a1Var = a1.e;
        this.d = qVar.f180a;
        e2.x xVar = (e2.x) qVar.f183f;
        this.f194f = xVar;
        this.e = new f((a0) qVar.d, xVar);
        this.f195g = new CopyOnWriteArraySet();
        new b2.r().a();
        this.f200m = -9223372036854775807L;
        this.f201n = -1;
        this.f199l = 0;
    }
}
