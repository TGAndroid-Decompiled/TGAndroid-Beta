package l1;

import b8.cc;
public final class j1 implements fd.f {
    public final j1 f17571a;
    public final b0 f17572b;

    public j1(j1 j1Var, b0 b0Var) {
        this.f17571a = j1Var;
        this.f17572b = b0Var;
    }

    public final void a(b0 b0Var) {
        if (this.f17572b != b0Var) {
            j1 j1Var = this.f17571a;
            if (j1Var != null) {
                j1Var.a(b0Var);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override
    public final Object fold(Object obj, od.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public final fd.f get(fd.g gVar) {
        return cc.a(this, gVar);
    }

    @Override
    public final fd.g getKey() {
        return i1.f17563a;
    }

    @Override
    public final fd.h minusKey(fd.g gVar) {
        return cc.b(this, gVar);
    }

    @Override
    public final fd.h plus(fd.h hVar) {
        return cc.c(this, hVar);
    }
}
