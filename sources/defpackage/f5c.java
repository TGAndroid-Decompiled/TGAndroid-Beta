package defpackage;

import java.util.Set;
public final class f5c implements e5c {
    public final Set a;
    public final ta0 b;
    public final h5c c;

    public f5c(Set set, ta0 ta0Var, h5c h5cVar) {
        this.a = set;
        this.b = ta0Var;
        this.c = h5cVar;
    }

    public final g5c a(String str, n34 n34Var, y2c y2cVar) {
        Set set = this.a;
        if (set.contains(n34Var)) {
            return new g5c(this.b, str, n34Var, y2cVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", n34Var, set));
    }
}
