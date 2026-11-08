package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class e extends r6.a implements q {
    public static final Parcelable.Creator<e> CREATOR = new j7.b(18);
    public final Status f16588a;
    public final f f16589b;

    public e(Status status, f fVar) {
        this.f16588a = status;
        this.f16589b = fVar;
    }

    @Override
    public final Status a() {
        return this.f16588a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f16588a, i7);
        xb.k(parcel, 2, this.f16589b, i7);
        xb.s(parcel, r10);
    }
}
