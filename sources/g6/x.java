package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f9486a;
    public final boolean f9487b;
    public final boolean f9488c;

    public x(int i10, boolean z10, boolean z11) {
        this.f9486a = i10;
        this.f9487b = z10;
        this.f9488c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f9486a == xVar.f9486a && this.f9487b == xVar.f9487b && this.f9488c == xVar.f9488c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9486a), Boolean.valueOf(this.f9487b), Boolean.valueOf(this.f9488c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f9486a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f9487b ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f9488c ? 1 : 0);
        f0.r(parcel, q6);
    }
}
