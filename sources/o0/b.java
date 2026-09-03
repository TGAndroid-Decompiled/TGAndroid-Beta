package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16283a;
    public String f16284b;
    public List f16285c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16283a, bVar.f16283a) && Objects.equals(this.f16284b, bVar.f16284b) && Objects.equals(this.f16285c, bVar.f16285c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16283a, this.f16284b, this.f16285c);
    }
}
