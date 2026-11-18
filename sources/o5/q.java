package o5;

import java.util.Set;
public final class q implements l5.f {
    public final Set f21727a;
    public final i f21728b;
    public final s f21729c;

    public q(Set set, i iVar, s sVar) {
        this.f21727a = set;
        this.f21728b = iVar;
        this.f21729c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f21727a;
        if (set.contains(cVar)) {
            return new r(this.f21728b, str, cVar, eVar, this.f21729c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
