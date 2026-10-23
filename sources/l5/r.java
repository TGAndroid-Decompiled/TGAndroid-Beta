package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15999a;
    public final i f16000b;
    public final t f16001c;

    public r(Set set, i iVar, t tVar) {
        this.f15999a = set;
        this.f16000b = iVar;
        this.f16001c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15999a;
        if (set.contains(cVar)) {
            return new s(this.f16000b, str, cVar, eVar, this.f16001c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
