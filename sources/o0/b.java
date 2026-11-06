package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f20670a;
    public String f20671b;
    public List f20672c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f20670a, bVar.f20670a) && Objects.equals(this.f20671b, bVar.f20671b) && Objects.equals(this.f20672c, bVar.f20672c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20670a, this.f20671b, this.f20672c);
    }
}
