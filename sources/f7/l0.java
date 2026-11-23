package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new db.k(28);
    public final int f11525a;
    public final short f11526b;
    public final short f11527c;

    public l0(int i7, short s5, short s9) {
        this.f11525a = i7;
        this.f11526b = s5;
        this.f11527c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f11525a != l0Var.f11525a || this.f11526b != l0Var.f11526b || this.f11527c != l0Var.f11527c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11525a), Short.valueOf(this.f11526b), Short.valueOf(this.f11527c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f11525a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f11526b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f11527c);
        cc.s(parcel, r10);
    }
}
