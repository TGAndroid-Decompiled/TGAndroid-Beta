package o5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(9);

    public final String f19316a;

    public final int f19317b;

    public final String f19318c;

    public d(String str, int i10, String str2) {
        this.f19316a = str;
        this.f19317b = i10;
        this.f19318c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f19316a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f19317b);
        r8.l(parcel, 4, this.f19318c);
        r8.r(parcel, iQ);
    }
}
