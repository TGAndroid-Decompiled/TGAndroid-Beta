package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4055a;
    public final int f4056b;
    public final int f4057c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4055a = i10;
        this.f4056b = i11;
        this.f4057c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4056b == uVar.f4056b && this.f4055a == uVar.f4055a && this.f4057c == uVar.f4057c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4056b), Integer.valueOf(this.f4055a), Integer.valueOf(this.f4057c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4055a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f4056b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4057c);
        w7.e0.r(parcel, q6);
    }
}
