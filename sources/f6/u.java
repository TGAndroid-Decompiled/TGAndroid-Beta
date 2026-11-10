package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class u extends r6.a {
    public final int f11341a;
    public final int f11342b;
    public final int f11343c;
    public static final j6.b d = new j6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i7, int i10, int i11) {
        this.f11341a = i7;
        this.f11342b = i10;
        this.f11343c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11342b == uVar.f11342b && this.f11341a == uVar.f11341a && this.f11343c == uVar.f11343c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11342b), Integer.valueOf(this.f11341a), Integer.valueOf(this.f11343c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f11341a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f11342b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f11343c);
        xb.s(parcel, r10);
    }
}
