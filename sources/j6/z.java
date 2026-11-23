package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
import java.util.Arrays;
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new t0(27);
    public final int f17383a;
    public final boolean f17384b;
    public final boolean f17385c;

    public z(int i7, boolean z10, boolean z11) {
        this.f17383a = i7;
        this.f17384b = z10;
        this.f17385c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f17383a == zVar.f17383a && this.f17384b == zVar.f17384b && this.f17385c == zVar.f17385c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17383a), Boolean.valueOf(this.f17384b), Boolean.valueOf(this.f17385c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f17383a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f17384b ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f17385c ? 1 : 0);
        cc.s(parcel, r10);
    }
}
