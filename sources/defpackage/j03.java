package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class j03 extends b4 {
    public static final Parcelable.Creator<j03> CREATOR = new x21((byte) 12);
    public final String a;
    public final Bundle b;

    public j03(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.b(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
