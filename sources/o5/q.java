package o5;

import java.util.Set;
public final class q implements l5.f {
    public final Set f21755a;
    public final i f21756b;
    public final s f21757c;

    public q(Set set, i iVar, s sVar) {
        this.f21755a = set;
        this.f21756b = iVar;
        this.f21757c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f21755a;
        if (set.contains(cVar)) {
            return new r(this.f21756b, str, cVar, eVar, this.f21757c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
