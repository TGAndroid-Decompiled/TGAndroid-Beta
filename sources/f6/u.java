package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class u extends r6.a {
    public final int f11499a;
    public final int f11500b;
    public final int f11501c;
    public static final j6.b d = new j6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i7, int i10, int i11) {
        this.f11499a = i7;
        this.f11500b = i10;
        this.f11501c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11500b == uVar.f11500b && this.f11499a == uVar.f11499a && this.f11501c == uVar.f11501c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11500b), Integer.valueOf(this.f11499a), Integer.valueOf(this.f11501c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f11499a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f11500b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11501c);
        bc.s(parcel, r10);
    }
}
