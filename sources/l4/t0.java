package l4;
public final class t0 implements b0 {
    public final com.google.android.exoplayer2.upstream.l f14429a;
    public final s0 f14430b;
    public final a3.c f14431c;
    public final f7.v d;
    public final int f14432e;

    public t0(com.google.android.exoplayer2.upstream.l lVar, o3.i iVar) {
        s0 s0Var = new s0(iVar, 0);
        a3.c cVar = new a3.c();
        f7.v vVar = new f7.v(4);
        this.f14429a = lVar;
        this.f14430b = s0Var;
        this.f14431c = cVar;
        this.d = vVar;
        this.f14432e = 1048576;
    }

    @Override
    public final u0 a(j3.f1 f1Var) {
        f1Var.f10437b.getClass();
        Object obj = f1Var.f10437b.f10405f;
        return new u0(f1Var, this.f14429a, this.f14430b, this.f14431c.b(f1Var), this.d, this.f14432e);
    }
}
