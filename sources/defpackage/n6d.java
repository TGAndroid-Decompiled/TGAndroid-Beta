package defpackage;

import j$.util.Objects;
import java.util.Set;
public final class n6d implements fg0 {
    public final d05 a;
    public final ho b;
    public wi5 c;
    public Set d;
    public boolean e;
    public final n05 f;

    public n6d(n05 n05Var, d05 d05Var, ho hoVar) {
        Objects.requireNonNull(n05Var);
        this.f = n05Var;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = d05Var;
        this.b = hoVar;
    }

    @Override
    public final void a(ws2 ws2Var) {
        this.f.y.post(new iqd((Object) this, (Object) ws2Var, false, (byte) 12));
    }

    public final void b(ws2 ws2Var) {
        l6d l6dVar = (l6d) this.f.s.get(this.b);
        if (l6dVar != null) {
            l6dVar.k(ws2Var);
        }
    }
}
