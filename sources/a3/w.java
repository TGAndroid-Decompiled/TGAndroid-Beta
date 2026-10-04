package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.a1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class w {
    public static final b f207o = new b(0);
    public final Context f208a;
    public final u f209b;
    public final SparseArray f210c;
    public final boolean d;
    public final f f211e;
    public final e2.x f212f;
    public final CopyOnWriteArraySet f213g;
    public e2.a0 h = new e2.a0();
    public e2.z f214i;
    public Pair f215j;
    public int f216k;
    public int f217l;
    public long f218m;
    public int f219n;

    public w(q qVar) {
        this.f208a = (Context) qVar.f197c;
        u uVar = (u) qVar.f198e;
        e2.d.h(uVar);
        this.f209b = uVar;
        this.f210c = new SparseArray();
        e9.g0 g0Var = e9.i0.f8758b;
        a1 a1Var = a1.f8721e;
        this.d = qVar.f195a;
        e2.x xVar = (e2.x) qVar.f199f;
        this.f212f = xVar;
        this.f211e = new f((a0) qVar.d, xVar);
        this.f213g = new CopyOnWriteArraySet();
        new b2.r().a();
        this.f218m = -9223372036854775807L;
        this.f219n = -1;
        this.f217l = 0;
    }
}
