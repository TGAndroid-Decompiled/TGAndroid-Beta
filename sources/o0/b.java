package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16128a;
    public String f16129b;
    public List f16130c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16128a, bVar.f16128a) && Objects.equals(this.f16129b, bVar.f16129b) && Objects.equals(this.f16130c, bVar.f16130c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16128a, this.f16129b, this.f16130c);
    }
}
