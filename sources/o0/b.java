package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f21194a;
    public String f21195b;
    public List f21196c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f21194a, bVar.f21194a) && Objects.equals(this.f21195b, bVar.f21195b) && Objects.equals(this.f21196c, bVar.f21196c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21194a, this.f21195b, this.f21196c);
    }
}
