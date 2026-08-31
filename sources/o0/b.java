package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16281a;
    public String f16282b;
    public List f16283c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16281a, bVar.f16281a) && Objects.equals(this.f16282b, bVar.f16282b) && Objects.equals(this.f16283c, bVar.f16283c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16281a, this.f16282b, this.f16283c);
    }
}
