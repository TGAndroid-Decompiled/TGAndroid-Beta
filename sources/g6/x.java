package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10898a;
    public final boolean f10899b;
    public final boolean f10900c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10898a = i10;
        this.f10899b = z10;
        this.f10900c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10898a == xVar.f10898a && this.f10899b == xVar.f10899b && this.f10900c == xVar.f10900c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10898a), Boolean.valueOf(this.f10899b), Boolean.valueOf(this.f10900c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10898a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f10899b ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f10900c ? 1 : 0);
        f0.r(parcel, q6);
    }
}
