package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4472a;
    public final int f4473b;
    public final int f4474c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4472a = i10;
        this.f4473b = i11;
        this.f4474c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4473b == uVar.f4473b && this.f4472a == uVar.f4472a && this.f4474c == uVar.f4474c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4473b), Integer.valueOf(this.f4472a), Integer.valueOf(this.f4474c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4472a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f4473b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4474c);
        w7.e0.r(parcel, q6);
    }
}
