package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f16636a;
    public String f16637b;
    public List f16638c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f16636a, bVar.f16636a) && Objects.equals(this.f16637b, bVar.f16637b) && Objects.equals(this.f16638c, bVar.f16638c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16636a, this.f16637b, this.f16638c);
    }
}
