package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f15427a;
    public final i f15428b;
    public final s f15429c;

    public q(Set set, i iVar, s sVar) {
        this.f15427a = set;
        this.f15428b = iVar;
        this.f15429c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15427a;
        if (set.contains(cVar)) {
            return new r(this.f15428b, str, cVar, eVar, this.f15429c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
