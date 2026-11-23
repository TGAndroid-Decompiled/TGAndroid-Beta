package o5;

import java.util.Set;
public final class q implements l5.f {
    public final Set f21721a;
    public final i f21722b;
    public final s f21723c;

    public q(Set set, i iVar, s sVar) {
        this.f21721a = set;
        this.f21722b = iVar;
        this.f21723c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f21721a;
        if (set.contains(cVar)) {
            return new r(this.f21722b, str, cVar, eVar, this.f21723c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
