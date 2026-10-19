package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4914a;
    public final int f4915b;
    public final int f4916c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4914a = i10;
        this.f4915b = i11;
        this.f4916c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4915b == uVar.f4915b && this.f4914a == uVar.f4914a && this.f4916c == uVar.f4916c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4915b), Integer.valueOf(this.f4914a), Integer.valueOf(this.f4916c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4914a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f4915b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4916c);
        w7.f0.r(parcel, q6);
    }
}
