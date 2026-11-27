package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class n74 extends c4 {
    public static final Parcelable.Creator<n74> CREATOR = new g31((byte) 17);
    public final Bundle a;

    public n74(Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.b(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
