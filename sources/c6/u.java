package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class u extends o6.a {
    public final int f4382a;
    public final int f4383b;
    public final int f4384c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4382a = i10;
        this.f4383b = i11;
        this.f4384c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4383b == uVar.f4383b && this.f4382a == uVar.f4382a && this.f4384c == uVar.f4384c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4383b), Integer.valueOf(this.f4382a), Integer.valueOf(this.f4384c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f4382a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f4383b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f4384c);
        g0.r(parcel, q6);
    }
}
