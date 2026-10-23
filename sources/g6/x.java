package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10917a;
    public final boolean f10918b;
    public final boolean f10919c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10917a = i10;
        this.f10918b = z10;
        this.f10919c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10917a == xVar.f10917a && this.f10918b == xVar.f10918b && this.f10919c == xVar.f10919c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10917a), Boolean.valueOf(this.f10918b), Boolean.valueOf(this.f10919c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10917a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f10918b ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f10919c ? 1 : 0);
        f0.r(parcel, q6);
    }
}
