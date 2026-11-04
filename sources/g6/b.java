package g6;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new c0(4);
    public final int f11977a;
    public final int f11978b;
    public final int f11979c;

    public b(int i3, int i10, int i11) {
        this.f11977a = i3;
        this.f11978b = i10;
        this.f11979c = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f11977a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f11978b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f11979c);
        j8.a.t(parcel, s6);
    }
}
