package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f15299a;
    public final i f15300b;
    public final s f15301c;

    public q(Set set, i iVar, s sVar) {
        this.f15299a = set;
        this.f15300b = iVar;
        this.f15301c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15299a;
        if (set.contains(cVar)) {
            return new r(this.f15300b, str, cVar, eVar, this.f15301c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
