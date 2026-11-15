package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
public final class e extends r6.a implements r {
    public static final Parcelable.Creator<e> CREATOR = new j7.b(18);
    public final Status f16941a;
    public final f f16942b;

    public e(Status status, f fVar) {
        this.f16941a = status;
        this.f16942b = fVar;
    }

    @Override
    public final Status a() {
        return this.f16941a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.f16941a, i7);
        yb.k(parcel, 2, this.f16942b, i7);
        yb.s(parcel, r10);
    }
}
