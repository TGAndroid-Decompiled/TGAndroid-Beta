package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10899a;
    public final boolean f10900b;
    public final boolean f10901c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10899a = i10;
        this.f10900b = z10;
        this.f10901c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10899a == xVar.f10899a && this.f10900b == xVar.f10900b && this.f10901c == xVar.f10901c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10899a), Boolean.valueOf(this.f10900b), Boolean.valueOf(this.f10901c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10899a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f10900b ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f10901c ? 1 : 0);
        f0.r(parcel, q6);
    }
}
