package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class h3e extends c4 {
    public static final Parcelable.Creator<h3e> CREATOR = new g3e((byte) 8);
    public final String a;

    public h3e(String str) {
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
