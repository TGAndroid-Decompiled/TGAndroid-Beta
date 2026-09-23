package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f13899a;
    public final i f13900b;
    public final t f13901c;

    public r(Set set, i iVar, t tVar) {
        this.f13899a = set;
        this.f13900b = iVar;
        this.f13901c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f13899a;
        if (set.contains(cVar)) {
            return new s(this.f13900b, str, cVar, eVar, this.f13901c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
