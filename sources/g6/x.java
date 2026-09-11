package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10446a;
    public final boolean f10447b;
    public final boolean f10448c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10446a = i10;
        this.f10447b = z10;
        this.f10448c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10446a == xVar.f10446a && this.f10447b == xVar.f10447b && this.f10448c == xVar.f10448c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10446a), Boolean.valueOf(this.f10447b), Boolean.valueOf(this.f10448c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f10446a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f10447b ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f10448c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
