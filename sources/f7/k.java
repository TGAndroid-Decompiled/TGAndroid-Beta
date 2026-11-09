package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.telegram.ui.ky0;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r f11396a;
    public final String f11397b;
    public final int f11398c;

    public k(int i7, int i10, String str) {
        try {
            this.f11396a = r.a(i7);
            this.f11397b = str;
            this.f11398c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!q6.m.k(this.f11396a, kVar.f11396a) || !q6.m.k(this.f11397b, kVar.f11397b) || !q6.m.k(Integer.valueOf(this.f11398c), Integer.valueOf(kVar.f11398c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11396a, this.f11397b, Integer.valueOf(this.f11398c)});
    }

    public final String toString() {
        ky0 ky0Var = new ky0(getClass().getSimpleName(), 9);
        String valueOf = String.valueOf(this.f11396a.f11427a);
        ky0 ky0Var2 = new ky0(8, false);
        ((ky0) ky0Var.d).d = ky0Var2;
        ky0Var.d = ky0Var2;
        ky0Var2.f47423c = valueOf;
        ky0Var2.f47422b = "errorCode";
        String str = this.f11397b;
        if (str != null) {
            ky0Var.N(str, "errorMessage");
        }
        return ky0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f11396a.f11427a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f11397b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f11398c);
        xb.s(parcel, r10);
    }
}
