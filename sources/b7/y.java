package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import g7.p8;
public final class y extends y5.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<y> CREATOR = new o(4);
    public final Status f1594a;

    public y(Status status) {
        this.f1594a = status;
    }

    @Override
    public final Status i() {
        return this.f1594a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f1594a, i9);
        p8.r(parcel, q10);
    }
}
