package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class l89 extends b4 {
    public static final Parcelable.Creator<l89> CREATOR = new hx6((byte) 17);
    public final Bundle a;
    public qt b;

    public l89(Bundle bundle) {
        this.a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.b(parcel, 2, this.a);
        mve.s(parcel, r);
    }
}
