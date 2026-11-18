package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new db.k(28);
    public final int f11531a;
    public final short f11532b;
    public final short f11533c;

    public l0(int i7, short s5, short s9) {
        this.f11531a = i7;
        this.f11532b = s5;
        this.f11533c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f11531a != l0Var.f11531a || this.f11532b != l0Var.f11532b || this.f11533c != l0Var.f11533c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11531a), Short.valueOf(this.f11532b), Short.valueOf(this.f11533c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f11531a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f11532b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f11533c);
        bc.s(parcel, r10);
    }
}
