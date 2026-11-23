package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new db.k(28);
    public final int f11563a;
    public final short f11564b;
    public final short f11565c;

    public l0(int i7, short s5, short s9) {
        this.f11563a = i7;
        this.f11564b = s5;
        this.f11565c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f11563a != l0Var.f11563a || this.f11564b != l0Var.f11564b || this.f11565c != l0Var.f11565c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11563a), Short.valueOf(this.f11564b), Short.valueOf(this.f11565c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f11563a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f11564b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f11565c);
        bc.s(parcel, r10);
    }
}
