package defpackage;

import java.util.Set;
public final class g3c implements f3c {
    public final Set a;
    public final rb0 b;
    public final i3c c;

    public g3c(Set set, rb0 rb0Var, i3c i3cVar) {
        this.a = set;
        this.b = rb0Var;
        this.c = i3cVar;
    }

    public final h3c a(String str, d44 d44Var, z0c z0cVar) {
        Set set = this.a;
        if (set.contains(d44Var)) {
            return new h3c(this.b, str, d44Var, z0cVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", d44Var, set));
    }
}
