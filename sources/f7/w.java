package f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j7.f5;
public final class w extends c6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<w> CREATOR = new n(4);
    public final Status f6036a;

    public w(Status status) {
        this.f6036a = status;
    }

    @Override
    public final Status i() {
        return this.f6036a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f6036a, i10);
        f5.r(parcel, q10);
    }
}
