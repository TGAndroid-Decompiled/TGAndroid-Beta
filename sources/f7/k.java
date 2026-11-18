package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.telegram.ui.nd0;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r f11527a;
    public final String f11528b;
    public final int f11529c;

    public k(int i7, int i10, String str) {
        try {
            this.f11527a = r.a(i7);
            this.f11528b = str;
            this.f11529c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!q6.m.l(this.f11527a, kVar.f11527a) || !q6.m.l(this.f11528b, kVar.f11528b) || !q6.m.l(Integer.valueOf(this.f11529c), Integer.valueOf(kVar.f11529c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11527a, this.f11528b, Integer.valueOf(this.f11529c)});
    }

    public final String toString() {
        nd0 nd0Var = new nd0(getClass().getSimpleName(), 10);
        String valueOf = String.valueOf(this.f11527a.f11558a);
        nd0 nd0Var2 = new nd0(9, false);
        ((nd0) nd0Var.f50149c).f50149c = nd0Var2;
        nd0Var.f50149c = nd0Var2;
        nd0Var2.f50148b = valueOf;
        nd0Var2.d = "errorCode";
        String str = this.f11528b;
        if (str != null) {
            nd0Var.L(str, "errorMessage");
        }
        return nd0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f11527a.f11558a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f11528b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11529c);
        bc.s(parcel, r10);
    }
}
