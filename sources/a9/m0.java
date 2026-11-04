package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class m0 extends q6.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0(0);
    public final int f224a;
    public final f f225b;

    public m0(int i3, f fVar) {
        this.f224a = i3;
        this.f225b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f224a);
        j8.a.l(parcel, 3, this.f225b, i3);
        j8.a.t(parcel, s6);
    }
}
