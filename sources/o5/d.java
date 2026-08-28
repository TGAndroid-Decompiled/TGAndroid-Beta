package o5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new p(1);
    public final String f18969a;
    public final int f18970b;
    public final String f18971c;

    public d(String str, int i9, String str2) {
        this.f18969a = str;
        this.f18970b = i9;
        this.f18971c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f18969a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f18970b);
        p8.l(parcel, 4, this.f18971c);
        p8.r(parcel, q10);
    }
}
