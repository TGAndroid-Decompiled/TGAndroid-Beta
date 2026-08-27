package c7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import h7.r8;

public final class x extends z5.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<x> CREATOR = new n(4);

    public final Status f2500a;

    public x(Status status) {
        this.f2500a = status;
    }

    @Override
    public final Status i() {
        return this.f2500a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f2500a, i10);
        r8.r(parcel, iQ);
    }
}
