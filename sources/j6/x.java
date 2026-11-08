package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new t0(27);
    public final int f16554a;
    public final boolean f16555b;
    public final boolean f16556c;

    public x(int i7, boolean z9, boolean z10) {
        this.f16554a = i7;
        this.f16555b = z9;
        this.f16556c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f16554a == xVar.f16554a && this.f16555b == xVar.f16555b && this.f16556c == xVar.f16556c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16554a), Boolean.valueOf(this.f16555b), Boolean.valueOf(this.f16556c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f16554a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f16555b ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f16556c ? 1 : 0);
        xb.s(parcel, r10);
    }
}
