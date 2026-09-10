package d9;

import java.io.Serializable;
import java.util.List;
public final class g implements f, Serializable {
    public final List f6337a;

    public g(List list) {
        this.f6337a = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f6337a;
            if (i10 < list.size()) {
                if (!((f) list.get(i10)).apply(obj)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f6337a.equals(((g) obj).f6337a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6337a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f6337a) {
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
