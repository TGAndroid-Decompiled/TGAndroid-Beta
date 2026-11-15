package o5;

import java.util.Set;
public final class r implements l5.f {
    public final Set f21364a;
    public final i f21365b;
    public final t f21366c;

    public r(Set set, i iVar, t tVar) {
        this.f21364a = set;
        this.f21365b = iVar;
        this.f21366c = tVar;
    }

    public final s a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f21364a;
        if (set.contains(cVar)) {
            return new s(this.f21365b, str, cVar, eVar, this.f21366c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
