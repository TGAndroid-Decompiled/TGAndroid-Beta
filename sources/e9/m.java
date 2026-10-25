package e9;

import java.io.Serializable;
import java.util.List;
public final class m implements l, Serializable {
    public final List f9846a;

    public m(List list) {
        this.f9846a = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f9846a;
            if (i10 < list.size()) {
                if (!((l) list.get(i10)).apply(obj)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f9846a.equals(((m) obj).f9846a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9846a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f9846a) {
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
