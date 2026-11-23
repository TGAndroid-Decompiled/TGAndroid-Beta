package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class u extends r6.a {
    public final int f11461a;
    public final int f11462b;
    public final int f11463c;
    public static final j6.b d = new j6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i7, int i10, int i11) {
        this.f11461a = i7;
        this.f11462b = i10;
        this.f11463c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11462b == uVar.f11462b && this.f11461a == uVar.f11461a && this.f11463c == uVar.f11463c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11462b), Integer.valueOf(this.f11461a), Integer.valueOf(this.f11463c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f11461a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f11462b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f11463c);
        cc.s(parcel, r10);
    }
}
