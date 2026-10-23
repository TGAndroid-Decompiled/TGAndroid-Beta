package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4919a;
    public final int f4920b;
    public final int f4921c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4919a = i10;
        this.f4920b = i11;
        this.f4921c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4920b == uVar.f4920b && this.f4919a == uVar.f4919a && this.f4921c == uVar.f4921c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4920b), Integer.valueOf(this.f4919a), Integer.valueOf(this.f4921c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4919a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f4920b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4921c);
        w7.f0.r(parcel, q6);
    }
}
