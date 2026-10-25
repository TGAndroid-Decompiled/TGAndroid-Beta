package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends p6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(10);
    public final int f8201a;
    public final short f8202b;
    public final short f8203c;

    public l0(int i10, short s10, short s11) {
        this.f8201a = i10;
        this.f8202b = s10;
        this.f8203c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f8201a != l0Var.f8201a || this.f8202b != l0Var.f8202b || this.f8203c != l0Var.f8203c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8201a), Short.valueOf(this.f8202b), Short.valueOf(this.f8203c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f8201a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f8202b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f8203c);
        df.r(parcel, q5);
    }
}
