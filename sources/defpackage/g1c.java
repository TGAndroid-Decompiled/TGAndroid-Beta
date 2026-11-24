package defpackage;

import java.util.Set;
public final class g1c implements f1c {
    public final Set a;
    public final ra0 b;
    public final i1c c;

    public g1c(Set set, ra0 ra0Var, i1c i1cVar) {
        this.a = set;
        this.b = ra0Var;
        this.c = i1cVar;
    }

    public final h1c a(String str, s24 s24Var, yyb yybVar) {
        Set set = this.a;
        if (set.contains(s24Var)) {
            return new h1c(this.b, str, s24Var, yybVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", s24Var, set));
    }
}
