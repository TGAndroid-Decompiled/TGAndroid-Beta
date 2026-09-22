package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f13911a;
    public final i f13912b;
    public final t f13913c;

    public r(Set set, i iVar, t tVar) {
        this.f13911a = set;
        this.f13912b = iVar;
        this.f13913c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f13911a;
        if (set.contains(cVar)) {
            return new s(this.f13912b, str, cVar, eVar, this.f13913c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
