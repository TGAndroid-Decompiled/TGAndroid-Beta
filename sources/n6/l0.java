package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class l0 extends z5.a {
    public static final Parcelable.Creator<l0> CREATOR = new o0(20);

    public final int f18378a;

    public final short f18379b;

    public final short f18380c;

    public l0(int i10, short s10, short s11) {
        this.f18378a = i10;
        this.f18379b = s10;
        this.f18380c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f18378a == l0Var.f18378a && this.f18379b == l0Var.f18379b && this.f18380c == l0Var.f18380c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18378a), Short.valueOf(this.f18379b), Short.valueOf(this.f18380c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f18378a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f18379b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f18380c);
        r8.r(parcel, iQ);
    }
}
