package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f15431a;
    public final i f15432b;
    public final s f15433c;

    public q(Set set, i iVar, s sVar) {
        this.f15431a = set;
        this.f15432b = iVar;
        this.f15433c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15431a;
        if (set.contains(cVar)) {
            return new r(this.f15432b, str, cVar, eVar, this.f15433c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
