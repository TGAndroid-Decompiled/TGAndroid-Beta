package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f16798a;
    public String f16799b;
    public List f16800c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f16798a, cVar.f16798a) && Objects.equals(this.f16799b, cVar.f16799b) && Objects.equals(this.f16800c, cVar.f16800c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16798a, this.f16799b, this.f16800c);
    }
}
