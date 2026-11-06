package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class u extends r6.a {
    public final int f11336a;
    public final int f11337b;
    public final int f11338c;
    public static final j6.b d = new j6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i7, int i10, int i11) {
        this.f11336a = i7;
        this.f11337b = i10;
        this.f11338c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11337b == uVar.f11337b && this.f11336a == uVar.f11336a && this.f11338c == uVar.f11338c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11337b), Integer.valueOf(this.f11336a), Integer.valueOf(this.f11338c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f11336a);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f11337b);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.f11338c);
        wb.s(parcel, r10);
    }
}
