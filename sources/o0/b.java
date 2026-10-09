package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16884a;
    public String f16885b;
    public List f16886c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16884a, bVar.f16884a) && Objects.equals(this.f16885b, bVar.f16885b) && Objects.equals(this.f16886c, bVar.f16886c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16884a, this.f16885b, this.f16886c);
    }
}
