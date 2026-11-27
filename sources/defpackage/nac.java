package defpackage;
public final class nac implements kx2 {
    public final nac a;
    public final o83 b;

    public nac(nac nacVar, o83 o83Var) {
        this.a = nacVar;
        this.b = o83Var;
    }

    public final void a(o83 o83Var) {
        if (this.b != o83Var) {
            nac nacVar = this.a;
            if (nacVar != null) {
                nacVar.a(o83Var);
                return;
            }
            return;
        }
        grb.i("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override
    public final Object fold(Object obj, is4 is4Var) {
        return is4Var.invoke(obj, this);
    }

    @Override
    public final kx2 get(lx2 lx2Var) {
        return azd.a(this, lx2Var);
    }

    @Override
    public final lx2 getKey() {
        return sg7.d;
    }

    @Override
    public final mx2 minusKey(lx2 lx2Var) {
        return azd.b(this, lx2Var);
    }

    @Override
    public final mx2 plus(mx2 mx2Var) {
        return azd.c(this, mx2Var);
    }
}
