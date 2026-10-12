package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends o6.a {
    public final int f4431a;
    public final int f4432b;
    public final int f4433c;
    public static final g6.b d = new g6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f4431a = i10;
        this.f4432b = i11;
        this.f4433c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4432b == uVar.f4432b && this.f4431a == uVar.f4431a && this.f4433c == uVar.f4433c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4432b), Integer.valueOf(this.f4431a), Integer.valueOf(this.f4433c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f4431a);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f4432b);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.f4433c);
        w7.c0.r(parcel, q6);
    }
}
