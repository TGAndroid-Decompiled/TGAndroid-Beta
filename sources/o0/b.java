package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16112a;
    public String f16113b;
    public List f16114c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16112a, bVar.f16112a) && Objects.equals(this.f16113b, bVar.f16113b) && Objects.equals(this.f16114c, bVar.f16114c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16112a, this.f16113b, this.f16114c);
    }
}
