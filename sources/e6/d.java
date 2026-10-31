package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p(1);
    public final String f6271a;
    public final int f6272b;
    public final String f6273c;

    public d(String str, int i10, String str2) {
        this.f6271a = str;
        this.f6272b = i10;
        this.f6273c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f6271a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f6272b);
        h0.l(parcel, 4, this.f6273c);
        h0.r(parcel, q6);
    }
}
