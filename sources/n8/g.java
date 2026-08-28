package n8;

import java.io.Serializable;
import java.util.List;
public final class g implements f, Serializable {
    public final List f18516a;

    public g(List list) {
        this.f18516a = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i9 = 0;
        while (true) {
            List list = this.f18516a;
            if (i9 < list.size()) {
                if (!((f) list.get(i9)).apply(obj)) {
                    return false;
                }
                i9++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f18516a.equals(((g) obj).f18516a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18516a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f18516a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
