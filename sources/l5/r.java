package l5;

import java.util.Set;
public final class r implements i5.f {
    public final Set f13913a;
    public final i f13914b;
    public final t f13915c;

    public r(Set set, i iVar, t tVar) {
        this.f13913a = set;
        this.f13914b = iVar;
        this.f13915c = tVar;
    }

    public final s a(String str, i5.c cVar, i5.e eVar) {
        Set set = this.f13913a;
        if (set.contains(cVar)) {
            return new s(this.f13914b, str, cVar, eVar, this.f13915c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
