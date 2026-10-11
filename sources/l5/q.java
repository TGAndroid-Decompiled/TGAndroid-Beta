package l5;

import java.util.Set;
public final class q implements i5.f {
    public final Set f15466a;
    public final i f15467b;
    public final s f15468c;

    public q(Set set, i iVar, s sVar) {
        this.f15466a = set;
        this.f15467b = iVar;
        this.f15468c = sVar;
    }

    public final r a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f15466a;
        if (set.contains(cVar)) {
            return new r(this.f15467b, str, cVar, eVar, this.f15468c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
