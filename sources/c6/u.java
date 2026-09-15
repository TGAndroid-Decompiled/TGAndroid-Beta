package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4053a;
    public final int f4054b;
    public final int f4055c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4053a = i10;
        this.f4054b = i11;
        this.f4055c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4054b == uVar.f4054b && this.f4053a == uVar.f4053a && this.f4055c == uVar.f4055c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4054b), Integer.valueOf(this.f4053a), Integer.valueOf(this.f4055c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4053a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f4054b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4055c);
        w7.e0.r(parcel, q6);
    }
}
