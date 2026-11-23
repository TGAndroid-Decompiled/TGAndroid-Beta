package o0;

import j$.util.Objects;
import java.util.List;
public final class b {
    public String f21552a;
    public String f21553b;
    public List f21554c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f21552a, bVar.f21552a) && Objects.equals(this.f21553b, bVar.f21553b) && Objects.equals(this.f21554c, bVar.f21554c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21552a, this.f21553b, this.f21554c);
    }
}
