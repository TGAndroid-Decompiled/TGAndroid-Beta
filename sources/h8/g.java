package h8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class g extends p6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<g> CREATOR = new j(0);
    public final Status f12707a;
    public final h f12708b;

    public g(Status status, h hVar) {
        this.f12707a = status;
        this.f12708b = hVar;
    }

    @Override
    public final Status h() {
        return this.f12707a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f12707a, i10);
        df.k(parcel, 2, this.f12708b, i10);
        df.r(parcel, q5);
    }
}
