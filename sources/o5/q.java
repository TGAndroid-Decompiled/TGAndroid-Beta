package o5;

import java.util.Set;
public final class q implements l5.f {
    public final Set f20842a;
    public final i f20843b;
    public final s f20844c;

    public q(Set set, i iVar, s sVar) {
        this.f20842a = set;
        this.f20843b = iVar;
        this.f20844c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f20842a;
        if (set.contains(cVar)) {
            return new r(this.f20843b, str, cVar, eVar, this.f20844c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
