package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
public final class e extends r6.a implements r {
    public static final Parcelable.Creator<e> CREATOR = new j7.b(18);
    public final Status f17351a;
    public final f f17352b;

    public e(Status status, f fVar) {
        this.f17351a = status;
        this.f17352b = fVar;
    }

    @Override
    public final Status a() {
        return this.f17351a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f17351a, i7);
        bc.k(parcel, 2, this.f17352b, i7);
        bc.s(parcel, r10);
    }
}
