package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f14150a;
    public final i f14151b;
    public final s f14152c;

    public q(Set set, i iVar, s sVar) {
        this.f14150a = set;
        this.f14151b = iVar;
        this.f14152c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f14150a;
        if (set.contains(cVar)) {
            return new r(this.f14151b, str, cVar, eVar, this.f14152c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
