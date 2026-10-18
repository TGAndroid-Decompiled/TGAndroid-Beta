package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4917a;
    public final int f4918b;
    public final int f4919c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4917a = i10;
        this.f4918b = i11;
        this.f4919c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4918b == uVar.f4918b && this.f4917a == uVar.f4917a && this.f4919c == uVar.f4919c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4918b), Integer.valueOf(this.f4917a), Integer.valueOf(this.f4919c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4917a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f4918b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4919c);
        w7.f0.r(parcel, q6);
    }
}
