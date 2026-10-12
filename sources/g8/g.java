package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.c0;
public final class g extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<g> CREATOR = new j(0);
    public final Status f10414a;
    public final h f10415b;

    public g(Status status, h hVar) {
        this.f10414a = status;
        this.f10415b = hVar;
    }

    @Override
    public final Status i() {
        return this.f10414a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 1, this.f10414a, i10);
        c0.k(parcel, 2, this.f10415b, i10);
        c0.r(parcel, q6);
    }
}
