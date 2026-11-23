package m1;
public final class i1 implements id.f {
    public final i1 f20455a;
    public final b0 f20456b;

    public i1(i1 i1Var, b0 b0Var) {
        this.f20455a = i1Var;
        this.f20456b = b0Var;
    }

    public final void a(b0 b0Var) {
        if (this.f20456b != b0Var) {
            i1 i1Var = this.f20455a;
            if (i1Var != null) {
                i1Var.a(b0Var);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override
    public final Object fold(Object obj, rd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public final id.f get(id.g gVar) {
        return c8.q0.a(this, gVar);
    }

    @Override
    public final id.g getKey() {
        return h1.f20443a;
    }

    @Override
    public final id.h minusKey(id.g gVar) {
        return c8.q0.b(this, gVar);
    }

    @Override
    public final id.h plus(id.h hVar) {
        return c8.q0.c(this, hVar);
    }
}
