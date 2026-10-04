package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15362a;
    public final i f15363b;
    public final t f15364c;

    public r(Set set, i iVar, t tVar) {
        this.f15362a = set;
        this.f15363b = iVar;
        this.f15364c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15362a;
        if (set.contains(cVar)) {
            return new s(this.f15363b, str, cVar, eVar, this.f15364c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
