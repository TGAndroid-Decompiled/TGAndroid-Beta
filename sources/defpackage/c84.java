package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class c84 extends b4 {
    public static final Parcelable.Creator<c84> CREATOR = new f41((byte) 17);
    public final Bundle a;

    public c84(Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.b(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
