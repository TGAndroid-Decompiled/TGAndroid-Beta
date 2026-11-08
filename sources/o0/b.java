package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f20673a;
    public String f20674b;
    public List f20675c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f20673a, bVar.f20673a) && Objects.equals(this.f20674b, bVar.f20674b) && Objects.equals(this.f20675c, bVar.f20675c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20673a, this.f20674b, this.f20675c);
    }
}
