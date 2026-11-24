package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class v13 extends b4 {
    public static final Parcelable.Creator<v13> CREATOR = new f41((byte) 12);
    public final String a;
    public final Bundle b;

    public v13(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.b(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
