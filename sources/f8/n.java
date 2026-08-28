package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class n extends y5.a {
    public static final Parcelable.Creator<n> CREATOR = new r(3);
    public int f5963a;
    public String f5964b;
    public String f5965c;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f5963a;
        p8.s(parcel, 1, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 2, this.f5964b);
        p8.l(parcel, 3, this.f5965c);
        p8.r(parcel, q10);
    }
}
