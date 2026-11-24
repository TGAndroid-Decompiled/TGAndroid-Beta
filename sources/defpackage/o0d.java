package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o0d extends b4 {
    public static final Parcelable.Creator<o0d> CREATOR = new hv6((byte) 26);
    public final List a;

    public o0d(List list) {
        list.getClass();
        this.a = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.h(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
