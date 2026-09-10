package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f12808a;
    public final i f12809b;
    public final s f12810c;

    public q(Set set, i iVar, s sVar) {
        this.f12808a = set;
        this.f12809b = iVar;
        this.f12810c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f12808a;
        if (set.contains(cVar)) {
            return new r(this.f12809b, str, cVar, eVar, this.f12810c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
