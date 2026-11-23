package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f21586a;
    public String f21587b;
    public List f21588c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f21586a, bVar.f21586a) && Objects.equals(this.f21587b, bVar.f21587b) && Objects.equals(this.f21588c, bVar.f21588c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21586a, this.f21587b, this.f21588c);
    }
}
