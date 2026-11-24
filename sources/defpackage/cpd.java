package defpackage;

import java.util.Arrays;
public final class cpd {
    public final yse a;
    public final Boolean b;
    public final kxe c;

    public cpd(rod rodVar) {
        this.a = (yse) rodVar.b;
        this.b = (Boolean) rodVar.c;
        this.c = (kxe) rodVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cpd)) {
            return false;
        }
        cpd cpdVar = (cpd) obj;
        if (cqe.a(this.a, cpdVar.a) && cqe.a(this.b, cpdVar.b) && cqe.a(null, null) && cqe.a(this.c, cpdVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
