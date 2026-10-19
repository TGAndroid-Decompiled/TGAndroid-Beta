package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15936a;
    public final i f15937b;
    public final t f15938c;

    public r(Set set, i iVar, t tVar) {
        this.f15936a = set;
        this.f15937b = iVar;
        this.f15938c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15936a;
        if (set.contains(cVar)) {
            return new s(this.f15937b, str, cVar, eVar, this.f15938c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
