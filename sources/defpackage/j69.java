package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class j69 extends b4 {
    public static final Parcelable.Creator<j69> CREATOR = new hv6((byte) 17);
    public final Bundle a;
    public ps b;

    public j69(Bundle bundle) {
        this.a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.b(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
