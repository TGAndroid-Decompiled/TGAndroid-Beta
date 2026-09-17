package a3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import e9.a1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class v {
    public static final a f181o = new a(0);
    public final Context f182a;
    public final t f183b;
    public final SparseArray f184c;
    public final boolean d;
    public final e f185e;
    public final e2.x f186f;
    public final CopyOnWriteArraySet f187g;
    public e2.a0 h = new e2.a0();
    public e2.z f188i;
    public Pair f189j;
    public int f190k;
    public int f191l;
    public long f192m;
    public int f193n;

    public v(p pVar) {
        this.f182a = (Context) pVar.f171c;
        t tVar = (t) pVar.f172e;
        e2.d.h(tVar);
        this.f183b = tVar;
        this.f184c = new SparseArray();
        e9.g0 g0Var = e9.i0.f8957b;
        a1 a1Var = a1.f8920e;
        this.d = pVar.f169a;
        e2.x xVar = (e2.x) pVar.f173f;
        this.f186f = xVar;
        this.f185e = new e((z) pVar.d, xVar);
        this.f187g = new CopyOnWriteArraySet();
        new b2.r().a();
        this.f192m = -9223372036854775807L;
        this.f193n = -1;
        this.f191l = 0;
    }
}
