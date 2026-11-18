package o5;

import java.util.Set;
public final class q implements l5.f {
    public final Set f21730a;
    public final i f21731b;
    public final s f21732c;

    public q(Set set, i iVar, s sVar) {
        this.f21730a = set;
        this.f21731b = iVar;
        this.f21732c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f21730a;
        if (set.contains(cVar)) {
            return new r(this.f21731b, str, cVar, eVar, this.f21732c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
