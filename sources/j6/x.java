package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import f7.t0;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new t0(27);
    public final int f16551a;
    public final boolean f16552b;
    public final boolean f16553c;

    public x(int i7, boolean z9, boolean z10) {
        this.f16551a = i7;
        this.f16552b = z9;
        this.f16553c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f16551a == xVar.f16551a && this.f16552b == xVar.f16552b && this.f16553c == xVar.f16553c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16551a), Boolean.valueOf(this.f16552b), Boolean.valueOf(this.f16553c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f16551a);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f16552b ? 1 : 0);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.f16553c ? 1 : 0);
        wb.s(parcel, r10);
    }
}
