package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q6.m;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(6);
    public final String f20899a;

    public e(String str) {
        m.i(str, "json must not be null");
        this.f20899a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f20899a);
        bc.s(parcel, r10);
    }
}
