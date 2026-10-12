package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15177a;
    public final i f15178b;
    public final t f15179c;

    public r(Set set, i iVar, t tVar) {
        this.f15177a = set;
        this.f15178b = iVar;
        this.f15179c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15177a;
        if (set.contains(cVar)) {
            return new s(this.f15178b, str, cVar, eVar, this.f15179c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
