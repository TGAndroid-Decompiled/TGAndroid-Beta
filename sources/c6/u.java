package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class u extends o6.a {
    public final int f3946a;
    public final int f3947b;
    public final int f3948c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f3946a = i10;
        this.f3947b = i11;
        this.f3948c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f3947b == uVar.f3947b && this.f3946a == uVar.f3946a && this.f3948c == uVar.f3948c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3947b), Integer.valueOf(this.f3946a), Integer.valueOf(this.f3948c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f3946a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f3947b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f3948c);
        h0.r(parcel, q6);
    }
}
