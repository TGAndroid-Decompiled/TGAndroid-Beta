package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class f0d extends b4 {
    public static final Parcelable.Creator<f0d> CREATOR = new hv6((byte) 24);
    public final ArrayList a;

    public f0d(ArrayList arrayList) {
        arrayList.getClass();
        this.a = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.p(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
