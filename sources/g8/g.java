package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.d0;
public final class g extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<g> CREATOR = new j(0);
    public final Status f10416a;
    public final h f10417b;

    public g(Status status, h hVar) {
        this.f10416a = status;
        this.f10417b = hVar;
    }

    @Override
    public final Status i() {
        return this.f10416a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f10416a, i10);
        d0.k(parcel, 2, this.f10417b, i10);
        d0.r(parcel, q6);
    }
}
