package o5;

import java.util.Set;
public final class r implements l5.f {
    public final Set f21821a;
    public final i f21822b;
    public final t f21823c;

    public r(Set set, i iVar, t tVar) {
        this.f21821a = set;
        this.f21822b = iVar;
        this.f21823c = tVar;
    }

    public final s a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f21821a;
        if (set.contains(cVar)) {
            return new s(this.f21822b, str, cVar, eVar, this.f21823c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
