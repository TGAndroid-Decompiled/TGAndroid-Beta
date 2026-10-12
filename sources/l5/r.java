package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15176a;
    public final i f15177b;
    public final t f15178c;

    public r(Set set, i iVar, t tVar) {
        this.f15176a = set;
        this.f15177b = iVar;
        this.f15178c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15176a;
        if (set.contains(cVar)) {
            return new s(this.f15177b, str, cVar, eVar, this.f15178c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
