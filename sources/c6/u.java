package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4916a;
    public final int f4917b;
    public final int f4918c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4916a = i10;
        this.f4917b = i11;
        this.f4918c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4917b == uVar.f4917b && this.f4916a == uVar.f4916a && this.f4918c == uVar.f4918c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4917b), Integer.valueOf(this.f4916a), Integer.valueOf(this.f4918c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4916a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f4917b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4918c);
        w7.f0.r(parcel, q6);
    }
}
