package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class mae extends c4 implements ie9 {
    public static final Parcelable.Creator<mae> CREATOR = new g3e((byte) 20);
    public final Status a;

    public mae(Status status) {
        this.a = status;
    }

    @Override
    public final Status a() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.s(parcel, r);
    }
}
