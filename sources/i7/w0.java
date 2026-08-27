package i7;

import java.util.Arrays;

public final class w0 {

    public final s7 f10866a;

    public final Boolean f10867b;

    public final m8 f10868c;

    public w0(a5.n nVar) {
        this.f10866a = (s7) nVar.f100b;
        this.f10867b = (Boolean) nVar.f101c;
        this.f10868c = (m8) nVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return y5.l.l(this.f10866a, w0Var.f10866a) && y5.l.l(this.f10867b, w0Var.f10867b) && y5.l.l(null, null) && y5.l.l(this.f10868c, w0Var.f10868c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10866a, this.f10867b, null, this.f10868c});
    }
}
