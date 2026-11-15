package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class u extends r6.a {
    public final int f11150a;
    public final int f11151b;
    public final int f11152c;
    public static final j6.b d = new j6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i7, int i10, int i11) {
        this.f11150a = i7;
        this.f11151b = i10;
        this.f11152c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11151b == uVar.f11151b && this.f11150a == uVar.f11150a && this.f11152c == uVar.f11152c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11151b), Integer.valueOf(this.f11150a), Integer.valueOf(this.f11152c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f11150a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f11151b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f11152c);
        yb.s(parcel, r10);
    }
}
