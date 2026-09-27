package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f14136a;
    public final i f14137b;
    public final s f14138c;

    public q(Set set, i iVar, s sVar) {
        this.f14136a = set;
        this.f14137b = iVar;
        this.f14138c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f14136a;
        if (set.contains(cVar)) {
            return new r(this.f14137b, str, cVar, eVar, this.f14138c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
