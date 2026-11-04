package i6;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
import java.util.Arrays;
public final class x extends q6.a {
    public static final Parcelable.Creator<x> CREATOR = new c0(12);
    public final int f14666a;
    public final boolean f14667b;
    public final boolean f14668c;

    public x(int i3, boolean z10, boolean z11) {
        this.f14666a = i3;
        this.f14667b = z10;
        this.f14668c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f14666a == xVar.f14666a && this.f14667b == xVar.f14667b && this.f14668c == xVar.f14668c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14666a), Boolean.valueOf(this.f14667b), Boolean.valueOf(this.f14668c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f14666a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f14667b ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f14668c ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
