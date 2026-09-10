package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.e0;
public final class g extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<g> CREATOR = new j(0);
    public final Status f8644a;
    public final h f8645b;

    public g(Status status, h hVar) {
        this.f8644a = status;
        this.f8645b = hVar;
    }

    @Override
    public final Status i() {
        return this.f8644a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f8644a, i10);
        e0.k(parcel, 2, this.f8645b, i10);
        e0.r(parcel, q6);
    }
}
