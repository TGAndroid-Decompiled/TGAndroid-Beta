package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new db.k(28);
    public final int f11405a;
    public final short f11406b;
    public final short f11407c;

    public l0(int i7, short s5, short s9) {
        this.f11405a = i7;
        this.f11406b = s5;
        this.f11407c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f11405a != l0Var.f11405a || this.f11406b != l0Var.f11406b || this.f11407c != l0Var.f11407c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11405a), Short.valueOf(this.f11406b), Short.valueOf(this.f11407c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f11405a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f11406b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f11407c);
        xb.s(parcel, r10);
    }
}
