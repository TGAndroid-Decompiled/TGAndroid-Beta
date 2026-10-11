package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16970a;
    public String f16971b;
    public List f16972c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16970a, bVar.f16970a) && Objects.equals(this.f16971b, bVar.f16971b) && Objects.equals(this.f16972c, bVar.f16972c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16970a, this.f16971b, this.f16972c);
    }
}
