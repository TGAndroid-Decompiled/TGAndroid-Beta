package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4603a;
    public final int f4604b;
    public final int f4605c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4603a = i10;
        this.f4604b = i11;
        this.f4605c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4604b == uVar.f4604b && this.f4603a == uVar.f4603a && this.f4605c == uVar.f4605c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4604b), Integer.valueOf(this.f4603a), Integer.valueOf(this.f4605c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4603a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f4604b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4605c);
        w7.e0.r(parcel, q6);
    }
}
