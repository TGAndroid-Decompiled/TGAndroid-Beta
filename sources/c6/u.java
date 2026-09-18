package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4058a;
    public final int f4059b;
    public final int f4060c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4058a = i10;
        this.f4059b = i11;
        this.f4060c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4059b == uVar.f4059b && this.f4058a == uVar.f4058a && this.f4060c == uVar.f4060c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4059b), Integer.valueOf(this.f4058a), Integer.valueOf(this.f4060c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4058a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f4059b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4060c);
        w7.f0.r(parcel, q6);
    }
}
