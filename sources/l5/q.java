package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f11680a;
    public final i f11681b;
    public final s f11682c;

    public q(Set set, i iVar, s sVar) {
        this.f11680a = set;
        this.f11681b = iVar;
        this.f11682c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f11680a;
        if (set.contains(cVar)) {
            return new r(this.f11681b, str, cVar, eVar, this.f11682c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
