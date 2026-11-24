package defpackage;
public final class o8c implements ay2 {
    public final o8c a;
    public final h93 b;

    public o8c(o8c o8cVar, h93 h93Var) {
        this.a = o8cVar;
        this.b = h93Var;
    }

    public final void a(h93 h93Var) {
        if (this.b != h93Var) {
            o8c o8cVar = this.a;
            if (o8cVar != null) {
                o8cVar.a(h93Var);
                return;
            }
            return;
        }
        dq9.m("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override
    public final Object fold(Object obj, fs4 fs4Var) {
        return fs4Var.invoke(obj, this);
    }

    @Override
    public final ay2 get(by2 by2Var) {
        return nwd.a(this, by2Var);
    }

    @Override
    public final by2 getKey() {
        return kg7.d;
    }

    @Override
    public final cy2 minusKey(by2 by2Var) {
        return nwd.b(this, by2Var);
    }

    @Override
    public final cy2 plus(cy2 cy2Var) {
        return nwd.c(this, cy2Var);
    }
}
