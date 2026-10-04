package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10309a;
    public final boolean f10310b;
    public final boolean f10311c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10309a = i10;
        this.f10310b = z10;
        this.f10311c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10309a == xVar.f10309a && this.f10310b == xVar.f10310b && this.f10311c == xVar.f10311c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10309a), Boolean.valueOf(this.f10310b), Boolean.valueOf(this.f10311c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10309a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f10310b ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f10311c ? 1 : 0);
        g0.r(parcel, q6);
    }
}
