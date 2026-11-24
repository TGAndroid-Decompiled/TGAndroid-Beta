package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class q2d extends b4 {
    public static final Parcelable.Creator<q2d> CREATOR = new hx6((byte) 26);
    public final List a;

    public q2d(List list) {
        list.getClass();
        this.a = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.h(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
