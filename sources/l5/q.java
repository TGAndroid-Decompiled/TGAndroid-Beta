package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f14595a;
    public final i f14596b;
    public final s f14597c;

    public q(Set set, i iVar, s sVar) {
        this.f14595a = set;
        this.f14596b = iVar;
        this.f14597c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f14595a;
        if (set.contains(cVar)) {
            return new r(this.f14596b, str, cVar, eVar, this.f14597c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
