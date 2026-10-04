package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15363a;
    public final i f15364b;
    public final t f15365c;

    public r(Set set, i iVar, t tVar) {
        this.f15363a = set;
        this.f15364b = iVar;
        this.f15365c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15363a;
        if (set.contains(cVar)) {
            return new s(this.f15364b, str, cVar, eVar, this.f15365c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
