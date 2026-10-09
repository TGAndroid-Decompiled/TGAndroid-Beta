package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10383a;
    public final boolean f10384b;
    public final boolean f10385c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10383a = i10;
        this.f10384b = z10;
        this.f10385c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10383a == xVar.f10383a && this.f10384b == xVar.f10384b && this.f10385c == xVar.f10385c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10383a), Boolean.valueOf(this.f10384b), Boolean.valueOf(this.f10385c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f10383a);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f10384b ? 1 : 0);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f10385c ? 1 : 0);
        d0.r(parcel, q6);
    }
}
