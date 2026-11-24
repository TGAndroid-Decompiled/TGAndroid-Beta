package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class z7e extends b4 implements uc9 {
    public static final Parcelable.Creator<z7e> CREATOR = new t0e((byte) 20);
    public final Status a;

    public z7e(Status status) {
        this.a = status;
    }

    @Override
    public final Status a() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
