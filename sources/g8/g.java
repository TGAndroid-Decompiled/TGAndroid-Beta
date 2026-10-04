package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.g0;
public final class g extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<g> CREATOR = new j(0);
    public final Status f10343a;
    public final h f10344b;

    public g(Status status, h hVar) {
        this.f10343a = status;
        this.f10344b = hVar;
    }

    @Override
    public final Status i() {
        return this.f10343a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f10343a, i10);
        g0.k(parcel, 2, this.f10344b, i10);
        g0.r(parcel, q6);
    }
}
