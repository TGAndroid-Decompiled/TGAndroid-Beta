package j7;

import java.util.Arrays;
public final class w0 {
    public final t7 f11238a;
    public final Boolean f11239b;
    public final n8 f11240c;

    public w0(androidx.biometric.e eVar) {
        this.f11238a = (t7) eVar.f1030b;
        this.f11239b = (Boolean) eVar.f1031c;
        this.f11240c = (n8) eVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (z5.l.l(this.f11238a, w0Var.f11238a) && z5.l.l(this.f11239b, w0Var.f11239b) && z5.l.l(null, null) && z5.l.l(this.f11240c, w0Var.f11240c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11238a, this.f11239b, null, this.f11240c});
    }
}
