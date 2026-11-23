package m1;
public final class a0 extends kd.j implements rd.p {
    public kotlin.jvm.internal.p f20376a;
    public int f20377b;
    public Object f20378c;
    public final kotlin.jvm.internal.p d;
    public final b0 f20379e;
    public final Object f20380f;
    public final boolean h;

    public a0(kotlin.jvm.internal.p pVar, b0 b0Var, Object obj, boolean z10, id.c cVar) {
        super(2, cVar);
        this.d = pVar;
        this.f20379e = b0Var;
        this.f20380f = obj;
        this.h = z10;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        a0 a0Var = new a0(this.d, this.f20379e, this.f20380f, this.h, cVar);
        a0Var.f20378c = obj;
        return a0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((k0) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: m1.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
