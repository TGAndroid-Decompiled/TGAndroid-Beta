package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class ubd extends b4 {
    public static final Parcelable.Creator<ubd> CREATOR = new lbd((byte) 4);
    public String a;
    public Bundle b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.b(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
