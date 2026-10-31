package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import e6.p;
import w7.h0;
public final class e extends o6.a implements q {
    public static final Parcelable.Creator<e> CREATOR = new p(29);
    public final Status f7453a;
    public final f f7454b;

    public e(Status status, f fVar) {
        this.f7453a = status;
        this.f7454b = fVar;
    }

    @Override
    public final Status a() {
        return this.f7453a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f7453a, i10);
        h0.k(parcel, 2, this.f7454b, i10);
        h0.r(parcel, q6);
    }
}
