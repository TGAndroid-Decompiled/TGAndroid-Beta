package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f14108a;
    public final i f14109b;
    public final s f14110c;

    public q(Set set, i iVar, s sVar) {
        this.f14108a = set;
        this.f14109b = iVar;
        this.f14110c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f14108a;
        if (set.contains(cVar)) {
            return new r(this.f14109b, str, cVar, eVar, this.f14110c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
