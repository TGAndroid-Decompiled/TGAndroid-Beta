package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class lga extends b4 {
    public static final Parcelable.Creator<lga> CREATOR = new t4d((byte) 22);
    public ArrayList a;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.n(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
