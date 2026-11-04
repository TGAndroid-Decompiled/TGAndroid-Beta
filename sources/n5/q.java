package n5;

import java.util.Set;
public final class q implements k5.f {
    public final Set f20261a;
    public final i f20262b;
    public final s f20263c;

    public q(Set set, i iVar, s sVar) {
        this.f20261a = set;
        this.f20262b = iVar;
        this.f20263c = sVar;
    }

    public final r a(String str, k5.c cVar, k5.e eVar) {
        Set set = this.f20261a;
        if (set.contains(cVar)) {
            return new r(this.f20262b, str, cVar, eVar, this.f20263c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
