package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class x33 extends b4 {
    public static final Parcelable.Creator<x33> CREATOR = new f41((byte) 14);
    public final Bundle a;

    public x33(Bundle bundle) {
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
