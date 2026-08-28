package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class u extends y5.a {
    public final int f17479a;
    public final int f17480b;
    public final int f17481c;
    public static final q5.b d = new q5.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i9, int i10, int i11) {
        this.f17479a = i9;
        this.f17480b = i10;
        this.f17481c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f17480b == uVar.f17480b && this.f17479a == uVar.f17479a && this.f17481c == uVar.f17481c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17480b), Integer.valueOf(this.f17479a), Integer.valueOf(this.f17481c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f17479a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f17480b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f17481c);
        p8.r(parcel, q10);
    }
}
