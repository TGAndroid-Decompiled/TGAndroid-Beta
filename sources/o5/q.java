package o5;

import java.util.Set;
public final class q implements l5.f {
    public final Set f20839a;
    public final i f20840b;
    public final s f20841c;

    public q(Set set, i iVar, s sVar) {
        this.f20839a = set;
        this.f20840b = iVar;
        this.f20841c = sVar;
    }

    public final r a(String str, l5.c cVar, l5.e eVar) {
        Set set = this.f20839a;
        if (set.contains(cVar)) {
            return new r(this.f20840b, str, cVar, eVar, this.f20841c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
