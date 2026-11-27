package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class l9d extends c4 {
    public static final Parcelable.Creator<l9d> CREATOR = new ced((byte) 13);
    public final String a;

    public l9d(String str) {
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
