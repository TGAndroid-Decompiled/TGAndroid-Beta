package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class u extends r6.a {
    public final int f11467a;
    public final int f11468b;
    public final int f11469c;
    public static final j6.b d = new j6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i7, int i10, int i11) {
        this.f11467a = i7;
        this.f11468b = i10;
        this.f11469c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11468b == uVar.f11468b && this.f11467a == uVar.f11467a && this.f11469c == uVar.f11469c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11468b), Integer.valueOf(this.f11467a), Integer.valueOf(this.f11469c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f11467a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f11468b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11469c);
        bc.s(parcel, r10);
    }
}
