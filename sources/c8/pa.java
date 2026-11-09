package c8;

import java.util.Arrays;
public final class pa {
    public final oa f5803a;
    public final Integer f5804b;

    public pa(wf.b bVar) {
        this.f5803a = (oa) bVar.f57667b;
        this.f5804b = (Integer) bVar.f57668c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        if (q6.m.k(this.f5803a, paVar.f5803a) && q6.m.k(this.f5804b, paVar.f5804b) && q6.m.k(null, null) && q6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5803a, this.f5804b, null, null});
    }
}
