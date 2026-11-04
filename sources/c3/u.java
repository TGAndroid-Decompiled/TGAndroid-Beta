package c3;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import g9.s1;
import java.util.concurrent.CopyOnWriteArraySet;
public final class u {
    public static final b f4104q = new b(0);
    public final Context f4105a;
    public final s f4106b;
    public final SparseArray f4107c;
    public final boolean d;
    public final e f4108e;
    public final g2.h0 f4109f;
    public final CopyOnWriteArraySet f4110g;
    public final long h;
    public final z f4111i;
    public g2.k0 f4112j = new g2.k0();
    public g2.j0 f4113k;
    public Pair f4114l;
    public int f4115m;
    public int f4116n;
    public long f4117o;
    public int f4118p;

    public u(o oVar) {
        long j10;
        this.f4105a = oVar.f4090a;
        s sVar = oVar.f4092c;
        sVar.getClass();
        this.f4106b = sVar;
        this.f4107c = new SparseArray();
        g9.g0 g0Var = g9.i0.f12083b;
        s1 s1Var = s1.f12146e;
        this.d = oVar.d;
        g2.h0 h0Var = oVar.f4093e;
        this.f4109f = h0Var;
        long j11 = oVar.f4095g;
        if (j11 != -9223372036854775807L) {
            j10 = -j11;
        } else {
            j10 = -9223372036854775807L;
        }
        this.h = j10;
        z zVar = oVar.h;
        this.f4111i = zVar;
        this.f4108e = new e(oVar.f4091b, zVar, h0Var);
        this.f4110g = new CopyOnWriteArraySet();
        new d2.u().a();
        this.f4117o = -9223372036854775807L;
        this.f4118p = -1;
        this.f4116n = 0;
    }
}
