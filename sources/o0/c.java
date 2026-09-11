package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f16771a;
    public String f16772b;
    public List f16773c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f16771a, cVar.f16771a) && Objects.equals(this.f16772b, cVar.f16772b) && Objects.equals(this.f16773c, cVar.f16773c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16771a, this.f16772b, this.f16773c);
    }
}
