package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class m23 extends b4 {
    public static final Parcelable.Creator<m23> CREATOR = new x21((byte) 14);
    public final Bundle a;

    public m23(Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.b(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
