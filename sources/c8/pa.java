package c8;

import java.util.Arrays;
public final class pa {
    public final oa f5808a;
    public final Integer f5809b;

    public pa(wf.b bVar) {
        this.f5808a = (oa) bVar.f57666b;
        this.f5809b = (Integer) bVar.f57667c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        if (q6.m.k(this.f5808a, paVar.f5808a) && q6.m.k(this.f5809b, paVar.f5809b) && q6.m.k(null, null) && q6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5808a, this.f5809b, null, null});
    }
}
