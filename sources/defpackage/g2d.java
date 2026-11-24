package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class g2d extends b4 {
    public static final Parcelable.Creator<g2d> CREATOR = new hx6((byte) 24);
    public final ArrayList a;

    public g2d(ArrayList arrayList) {
        arrayList.getClass();
        this.a = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.p(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
