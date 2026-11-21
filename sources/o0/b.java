package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f21583a;
    public String f21584b;
    public List f21585c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f21583a, bVar.f21583a) && Objects.equals(this.f21584b, bVar.f21584b) && Objects.equals(this.f21585c, bVar.f21585c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21583a, this.f21584b, this.f21585c);
    }
}
