package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16888a;
    public String f16889b;
    public List f16890c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16888a, bVar.f16888a) && Objects.equals(this.f16889b, bVar.f16889b) && Objects.equals(this.f16890c, bVar.f16890c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16888a, this.f16889b, this.f16890c);
    }
}
