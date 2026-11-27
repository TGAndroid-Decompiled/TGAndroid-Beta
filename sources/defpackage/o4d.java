package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class o4d extends c4 {
    public static final Parcelable.Creator<o4d> CREATOR = new mx6((byte) 21);
    public final String a;

    public o4d(String str) {
        str.getClass();
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
