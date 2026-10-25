package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends p6.a {
    public final int f8142a;
    public final int f8143b;
    public final int f8144c;
    public static final h6.b d = new h6.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f8142a = i10;
        this.f8143b = i11;
        this.f8144c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f8143b == uVar.f8143b && this.f8142a == uVar.f8142a && this.f8144c == uVar.f8144c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8143b), Integer.valueOf(this.f8142a), Integer.valueOf(this.f8144c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f8142a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f8143b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f8144c);
        df.r(parcel, q5);
    }
}
