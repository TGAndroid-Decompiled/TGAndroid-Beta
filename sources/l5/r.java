package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f15930a;
    public final i f15931b;
    public final t f15932c;

    public r(Set set, i iVar, t tVar) {
        this.f15930a = set;
        this.f15931b = iVar;
        this.f15932c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15930a;
        if (set.contains(cVar)) {
            return new s(this.f15931b, str, cVar, eVar, this.f15932c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
