package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class u extends r6.a {
    public final int f11462a;
    public final int f11463b;
    public final int f11464c;
    public static final j6.b d = new j6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i7, int i10, int i11) {
        this.f11462a = i7;
        this.f11463b = i10;
        this.f11464c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11463b == uVar.f11463b && this.f11462a == uVar.f11462a && this.f11464c == uVar.f11464c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11463b), Integer.valueOf(this.f11462a), Integer.valueOf(this.f11464c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f11462a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f11463b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f11464c);
        cc.s(parcel, r10);
    }
}
