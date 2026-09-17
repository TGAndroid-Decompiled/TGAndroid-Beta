package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f15326a;
    public final i f15327b;
    public final s f15328c;

    public q(Set set, i iVar, s sVar) {
        this.f15326a = set;
        this.f15327b = iVar;
        this.f15328c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15326a;
        if (set.contains(cVar)) {
            return new r(this.f15327b, str, cVar, eVar, this.f15328c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
