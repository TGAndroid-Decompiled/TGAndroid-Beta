package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class w5e extends b4 implements ua9 {
    public static final Parcelable.Creator<w5e> CREATOR = new qyd((byte) 20);
    public final Status a;

    public w5e(Status status) {
        this.a = status;
    }

    @Override
    public final Status a() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.s(parcel, r);
    }
}
