package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f14069a;
    public final i f14070b;
    public final s f14071c;

    public q(Set set, i iVar, s sVar) {
        this.f14069a = set;
        this.f14070b = iVar;
        this.f14071c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f14069a;
        if (set.contains(cVar)) {
            return new r(this.f14070b, str, cVar, eVar, this.f14071c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
