package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new db.k(28);
    public final int f11560a;
    public final short f11561b;
    public final short f11562c;

    public l0(int i7, short s5, short s9) {
        this.f11560a = i7;
        this.f11561b = s5;
        this.f11562c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f11560a != l0Var.f11560a || this.f11561b != l0Var.f11561b || this.f11562c != l0Var.f11562c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11560a), Short.valueOf(this.f11561b), Short.valueOf(this.f11562c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f11560a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f11561b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f11562c);
        bc.s(parcel, r10);
    }
}
