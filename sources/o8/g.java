package o8;

import java.io.Serializable;
import java.util.List;

public final class g implements f, Serializable {

    public final List f19366a;

    public g(List list) {
        this.f19366a = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f19366a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((f) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f19366a.equals(((g) obj).f19366a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19366a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f19366a) {
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
