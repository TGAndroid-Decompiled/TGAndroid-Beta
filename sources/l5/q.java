package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f14119a;
    public final i f14120b;
    public final s f14121c;

    public q(Set set, i iVar, s sVar) {
        this.f14119a = set;
        this.f14120b = iVar;
        this.f14121c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f14119a;
        if (set.contains(cVar)) {
            return new r(this.f14120b, str, cVar, eVar, this.f14121c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
