package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.telegram.ui.md0;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r f11556a;
    public final String f11557b;
    public final int f11558c;

    public k(int i7, int i10, String str) {
        try {
            this.f11556a = r.a(i7);
            this.f11557b = str;
            this.f11558c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!q6.m.l(this.f11556a, kVar.f11556a) || !q6.m.l(this.f11557b, kVar.f11557b) || !q6.m.l(Integer.valueOf(this.f11558c), Integer.valueOf(kVar.f11558c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11556a, this.f11557b, Integer.valueOf(this.f11558c)});
    }

    public final String toString() {
        md0 md0Var = new md0(getClass().getSimpleName(), 10);
        String valueOf = String.valueOf(this.f11556a.f11587a);
        md0 md0Var2 = new md0(9, false);
        ((md0) md0Var.f49854c).f49854c = md0Var2;
        md0Var.f49854c = md0Var2;
        md0Var2.f49853b = valueOf;
        md0Var2.d = "errorCode";
        String str = this.f11557b;
        if (str != null) {
            md0Var.L(str, "errorMessage");
        }
        return md0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f11556a.f11587a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f11557b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11558c);
        bc.s(parcel, r10);
    }
}
