package o5;

import java.util.Set;
public final class q implements l5.f {
    public final Set f21752a;
    public final i f21753b;
    public final s f21754c;

    public q(Set set, i iVar, s sVar) {
        this.f21752a = set;
        this.f21753b = iVar;
        this.f21754c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f21752a;
        if (set.contains(cVar)) {
            return new r(this.f21753b, str, cVar, eVar, this.f21754c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
