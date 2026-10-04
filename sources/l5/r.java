package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15364a;
    public final i f15365b;
    public final t f15366c;

    public r(Set set, i iVar, t tVar) {
        this.f15364a = set;
        this.f15365b = iVar;
        this.f15366c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15364a;
        if (set.contains(cVar)) {
            return new s(this.f15365b, str, cVar, eVar, this.f15366c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
