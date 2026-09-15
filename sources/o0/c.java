package o0;

import j$.util.Objects;
import java.util.List;
public final class c {
    public String f15302a;
    public String f15303b;
    public List f15304c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.f15302a, cVar.f15302a) && Objects.equals(this.f15303b, cVar.f15303b) && Objects.equals(this.f15304c, cVar.f15304c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15302a, this.f15303b, this.f15304c);
    }
}
