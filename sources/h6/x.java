package h6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x extends p6.a {
    public static final Parcelable.Creator<x> CREATOR = new f6.i(9);
    public final int f12677a;
    public final boolean f12678b;
    public final boolean f12679c;

    public x(int i10, boolean z10, boolean z11) {
        this.f12677a = i10;
        this.f12678b = z10;
        this.f12679c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f12677a == xVar.f12677a && this.f12678b == xVar.f12678b && this.f12679c == xVar.f12679c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12677a), Boolean.valueOf(this.f12678b), Boolean.valueOf(this.f12679c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f12677a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f12678b ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f12679c ? 1 : 0);
        df.r(parcel, q5);
    }
}
