package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class a0 extends z5.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);

    public final int f12742a;

    public final String f12743b;

    public a0(int i10, String str) {
        this.f12742a = i10;
        this.f12743b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12742a);
        r8.l(parcel, 3, this.f12743b);
        r8.r(parcel, iQ);
    }
}
