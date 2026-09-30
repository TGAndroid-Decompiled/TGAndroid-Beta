package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.f0;
public final class g extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<g> CREATOR = new j(0);
    public final Status f9510a;
    public final h f9511b;

    public g(Status status, h hVar) {
        this.f9510a = status;
        this.f9511b = hVar;
    }

    @Override
    public final Status i() {
        return this.f9510a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f9510a, i10);
        f0.k(parcel, 2, this.f9511b, i10);
        f0.r(parcel, q6);
    }
}
