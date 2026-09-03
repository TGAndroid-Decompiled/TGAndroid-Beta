package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f13797a;

    public i(int i10) {
        this.f13797a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13797a);
        f5.r(parcel, q10);
    }
}
