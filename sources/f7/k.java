package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.telegram.ui.ly0;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r f11401a;
    public final String f11402b;
    public final int f11403c;

    public k(int i7, int i10, String str) {
        try {
            this.f11401a = r.a(i7);
            this.f11402b = str;
            this.f11403c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!q6.m.k(this.f11401a, kVar.f11401a) || !q6.m.k(this.f11402b, kVar.f11402b) || !q6.m.k(Integer.valueOf(this.f11403c), Integer.valueOf(kVar.f11403c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11401a, this.f11402b, Integer.valueOf(this.f11403c)});
    }

    public final String toString() {
        ly0 ly0Var = new ly0(getClass().getSimpleName(), 9);
        String valueOf = String.valueOf(this.f11401a.f11432a);
        ly0 ly0Var2 = new ly0(8, false);
        ((ly0) ly0Var.d).d = ly0Var2;
        ly0Var.d = ly0Var2;
        ly0Var2.f47747c = valueOf;
        ly0Var2.f47746b = "errorCode";
        String str = this.f11402b;
        if (str != null) {
            ly0Var.N(str, "errorMessage");
        }
        return ly0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f11401a.f11432a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f11402b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f11403c);
        xb.s(parcel, r10);
    }
}
