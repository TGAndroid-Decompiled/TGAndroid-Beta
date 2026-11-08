package c8;

import java.util.Arrays;
public final class pa {
    public final oa f5805a;
    public final Integer f5806b;

    public pa(wf.b bVar) {
        this.f5805a = (oa) bVar.f57654b;
        this.f5806b = (Integer) bVar.f57655c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        if (q6.m.k(this.f5805a, paVar.f5805a) && q6.m.k(this.f5806b, paVar.f5806b) && q6.m.k(null, null) && q6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5805a, this.f5806b, null, null});
    }
}
