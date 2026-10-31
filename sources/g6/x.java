package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.p(8);
    public final int f7423a;
    public final boolean f7424b;
    public final boolean f7425c;

    public x(int i10, boolean z10, boolean z11) {
        this.f7423a = i10;
        this.f7424b = z10;
        this.f7425c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f7423a == xVar.f7423a && this.f7424b == xVar.f7424b && this.f7425c == xVar.f7425c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7423a), Boolean.valueOf(this.f7424b), Boolean.valueOf(this.f7425c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f7423a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f7424b ? 1 : 0);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f7425c ? 1 : 0);
        h0.r(parcel, q6);
    }
}
