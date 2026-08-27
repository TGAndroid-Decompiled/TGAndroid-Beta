package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class v extends z5.a {

    public final int f17858a;

    public final int f17859b;

    public final int f17860c;
    public static final r5.b d = new r5.b("VideoInfo", null);
    public static final Parcelable.Creator<v> CREATOR = new w(21);

    public v(int i10, int i11, int i12) {
        this.f17858a = i10;
        this.f17859b = i11;
        this.f17860c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f17859b == vVar.f17859b && this.f17858a == vVar.f17858a && this.f17860c == vVar.f17860c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17859b), Integer.valueOf(this.f17858a), Integer.valueOf(this.f17860c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f17858a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f17859b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f17860c);
        r8.r(parcel, iQ);
    }
}
