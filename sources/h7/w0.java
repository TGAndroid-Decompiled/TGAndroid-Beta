package h7;

import java.util.Arrays;
public final class w0 {
    public final s7 f10157a;
    public final Boolean f10158b;
    public final m8 f10159c;

    public w0(a5.m mVar) {
        this.f10157a = (s7) mVar.f98b;
        this.f10158b = (Boolean) mVar.f99c;
        this.f10159c = (m8) mVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (x5.l.l(this.f10157a, w0Var.f10157a) && x5.l.l(this.f10158b, w0Var.f10158b) && x5.l.l(null, null) && x5.l.l(this.f10159c, w0Var.f10159c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10157a, this.f10158b, null, this.f10159c});
    }
}
