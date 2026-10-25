package m5;

import java.util.Set;
public final class r implements j5.f {
    public final Set f18349a;
    public final i f18350b;
    public final t f18351c;

    public r(Set set, i iVar, t tVar) {
        this.f18349a = set;
        this.f18350b = iVar;
        this.f18351c = tVar;
    }

    public final s a(String str, j5.c cVar, j5.e eVar) {
        Set set = this.f18349a;
        if (set.contains(cVar)) {
            return new s(this.f18350b, str, cVar, eVar, this.f18351c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
