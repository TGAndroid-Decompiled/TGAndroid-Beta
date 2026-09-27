package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f9473a;
    public final boolean f9474b;
    public final boolean f9475c;

    public x(int i10, boolean z10, boolean z11) {
        this.f9473a = i10;
        this.f9474b = z10;
        this.f9475c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f9473a == xVar.f9473a && this.f9474b == xVar.f9474b && this.f9475c == xVar.f9475c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9473a), Boolean.valueOf(this.f9474b), Boolean.valueOf(this.f9475c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f9473a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f9474b ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f9475c ? 1 : 0);
        f0.r(parcel, q6);
    }
}
