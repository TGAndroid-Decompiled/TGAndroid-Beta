package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class a5d extends c4 {
    public static final Parcelable.Creator<a5d> CREATOR = new mx6((byte) 25);
    public final String a;

    public a5d(String str) {
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
