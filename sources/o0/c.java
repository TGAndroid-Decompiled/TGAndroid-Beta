package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f16930a;
    public String f16931b;
    public List f16932c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f16930a, cVar.f16930a) && Objects.equals(this.f16931b, cVar.f16931b) && Objects.equals(this.f16932c, cVar.f16932c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16930a, this.f16931b, this.f16932c);
    }
}
