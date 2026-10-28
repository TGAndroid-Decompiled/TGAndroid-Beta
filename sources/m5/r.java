package m5;

import java.util.Set;
public final class r implements j5.f {
    public final Set f18348a;
    public final i f18349b;
    public final t f18350c;

    public r(Set set, i iVar, t tVar) {
        this.f18348a = set;
        this.f18349b = iVar;
        this.f18350c = tVar;
    }

    public final s a(String str, j5.c cVar, j5.e eVar) {
        Set set = this.f18348a;
        if (set.contains(cVar)) {
            return new s(this.f18349b, str, cVar, eVar, this.f18350c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
