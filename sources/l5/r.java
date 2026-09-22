package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f14123a;
    public final i f14124b;
    public final t f14125c;

    public r(Set set, i iVar, t tVar) {
        this.f14123a = set;
        this.f14124b = iVar;
        this.f14125c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f14123a;
        if (set.contains(cVar)) {
            return new s(this.f14124b, str, cVar, eVar, this.f14125c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
