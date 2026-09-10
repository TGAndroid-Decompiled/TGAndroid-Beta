package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f8614a;
    public final boolean f8615b;
    public final boolean f8616c;

    public x(int i10, boolean z10, boolean z11) {
        this.f8614a = i10;
        this.f8615b = z10;
        this.f8616c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f8614a == xVar.f8614a && this.f8615b == xVar.f8615b && this.f8616c == xVar.f8616c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8614a), Boolean.valueOf(this.f8615b), Boolean.valueOf(this.f8616c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f8614a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f8615b ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f8616c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
