package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class w99 extends c4 {
    public static final Parcelable.Creator<w99> CREATOR = new mx6((byte) 17);
    public final Bundle a;
    public qs b;

    public w99(Bundle bundle) {
        this.a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.b(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
