package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f11679a;
    public final i f11680b;
    public final s f11681c;

    public q(Set set, i iVar, s sVar) {
        this.f11679a = set;
        this.f11680b = iVar;
        this.f11681c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f11679a;
        if (set.contains(cVar)) {
            return new r(this.f11680b, str, cVar, eVar, this.f11681c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
