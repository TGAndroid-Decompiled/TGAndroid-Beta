package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class xe0 extends c4 {
    public static final Parcelable.Creator<xe0> CREATOR = new t4f((byte) 5);
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
