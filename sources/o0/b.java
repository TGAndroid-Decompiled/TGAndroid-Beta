package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16934a;
    public String f16935b;
    public List f16936c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16934a, bVar.f16934a) && Objects.equals(this.f16935b, bVar.f16935b) && Objects.equals(this.f16936c, bVar.f16936c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16934a, this.f16935b, this.f16936c);
    }
}
