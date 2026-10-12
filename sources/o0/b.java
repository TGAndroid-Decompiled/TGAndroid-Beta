package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16419a;
    public String f16420b;
    public List f16421c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16419a, bVar.f16419a) && Objects.equals(this.f16420b, bVar.f16420b) && Objects.equals(this.f16421c, bVar.f16421c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16419a, this.f16420b, this.f16421c);
    }
}
