package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class s8c extends b4 {
    public static final Parcelable.Creator<s8c> CREATOR = new sje((byte) 29);
    public String a;
    public String b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
