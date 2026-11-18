package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class u extends r6.a {
    public final int f11470a;
    public final int f11471b;
    public final int f11472c;
    public static final j6.b d = new j6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i7, int i10, int i11) {
        this.f11470a = i7;
        this.f11471b = i10;
        this.f11472c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11471b == uVar.f11471b && this.f11470a == uVar.f11470a && this.f11472c == uVar.f11472c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11471b), Integer.valueOf(this.f11470a), Integer.valueOf(this.f11472c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f11470a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f11471b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11472c);
        bc.s(parcel, r10);
    }
}
