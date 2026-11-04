package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends q6.a {
    public final int f9779a;
    public final int f9780b;
    public final int f9781c;
    public static final i6.b d = new i6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i3, int i10, int i11) {
        this.f9779a = i3;
        this.f9780b = i10;
        this.f9781c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f9780b == uVar.f9780b && this.f9779a == uVar.f9779a && this.f9781c == uVar.f9781c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9780b), Integer.valueOf(this.f9779a), Integer.valueOf(this.f9781c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f9779a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f9780b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f9781c);
        j8.a.t(parcel, s6);
    }
}
