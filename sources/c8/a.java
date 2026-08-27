package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(28);

    public int f2501a;

    public String[] f2502b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f2501a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.m(parcel, 3, this.f2502b);
        r8.r(parcel, iQ);
    }
}
