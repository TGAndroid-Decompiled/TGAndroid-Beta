package o0;

import j$.util.Objects;
import java.util.List;

public final class c {

    public String f19089a;

    public String f19090b;

    public List f19091c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f19089a, cVar.f19089a) && Objects.equals(this.f19090b, cVar.f19090b) && Objects.equals(this.f19091c, cVar.f19091c);
    }

    public final int hashCode() {
        return Objects.hash(this.f19089a, this.f19090b, this.f19091c);
    }
}
