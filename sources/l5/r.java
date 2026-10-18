package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15935a;
    public final i f15936b;
    public final t f15937c;

    public r(Set set, i iVar, t tVar) {
        this.f15935a = set;
        this.f15936b = iVar;
        this.f15937c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15935a;
        if (set.contains(cVar)) {
            return new s(this.f15936b, str, cVar, eVar, this.f15937c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
