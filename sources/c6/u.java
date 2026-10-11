package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4432a;
    public final int f4433b;
    public final int f4434c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4432a = i10;
        this.f4433b = i11;
        this.f4434c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4433b == uVar.f4433b && this.f4432a == uVar.f4432a && this.f4434c == uVar.f4434c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4433b), Integer.valueOf(this.f4432a), Integer.valueOf(this.f4434c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f4432a);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f4433b);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.f4434c);
        w7.d0.r(parcel, q6);
    }
}
