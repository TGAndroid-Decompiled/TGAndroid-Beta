package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class we0 extends c4 {
    public static final Parcelable.Creator<we0> CREATOR = new ime((byte) 15);
    public String a;
    public String b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
