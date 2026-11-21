package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
public final class e extends r6.a implements r {
    public static final Parcelable.Creator<e> CREATOR = new j7.b(18);
    public final Status f17348a;
    public final f f17349b;

    public e(Status status, f fVar) {
        this.f17348a = status;
        this.f17349b = fVar;
    }

    @Override
    public final Status a() {
        return this.f17348a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f17348a, i7);
        bc.k(parcel, 2, this.f17349b, i7);
        bc.s(parcel, r10);
    }
}
