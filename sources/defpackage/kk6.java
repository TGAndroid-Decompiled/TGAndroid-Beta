package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class kk6 extends c4 {
    public static final Parcelable.Creator<kk6> CREATOR = new g3e((byte) 22);
    public final String a;

    public kk6(String str) {
        xve.i(str, "json must not be null");
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
