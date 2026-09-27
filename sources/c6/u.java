package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4052a;
    public final int f4053b;
    public final int f4054c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4052a = i10;
        this.f4053b = i11;
        this.f4054c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4053b == uVar.f4053b && this.f4052a == uVar.f4052a && this.f4054c == uVar.f4054c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4053b), Integer.valueOf(this.f4052a), Integer.valueOf(this.f4054c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4052a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f4053b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4054c);
        w7.f0.r(parcel, q6);
    }
}
