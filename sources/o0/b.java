package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f21561a;
    public String f21562b;
    public List f21563c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f21561a, bVar.f21561a) && Objects.equals(this.f21562b, bVar.f21562b) && Objects.equals(this.f21563c, bVar.f21563c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21561a, this.f21562b, this.f21563c);
    }
}
