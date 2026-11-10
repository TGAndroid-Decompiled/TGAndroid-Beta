package o5;

import java.util.Set;
public final class q implements l5.f {
    public final Set f20847a;
    public final i f20848b;
    public final s f20849c;

    public q(Set set, i iVar, s sVar) {
        this.f20847a = set;
        this.f20848b = iVar;
        this.f20849c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f20847a;
        if (set.contains(cVar)) {
            return new r(this.f20848b, str, cVar, eVar, this.f20849c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
