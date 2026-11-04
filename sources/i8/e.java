package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import i7.p;
public final class e extends q6.a implements q {
    public static final Parcelable.Creator<e> CREATOR = new p(3);
    public final Status f14700a;
    public final f f14701b;

    public e(Status status, f fVar) {
        this.f14700a = status;
        this.f14701b = fVar;
    }

    @Override
    public final Status a() {
        return this.f14700a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f14700a, i3);
        j8.a.l(parcel, 2, this.f14701b, i3);
        j8.a.t(parcel, s6);
    }
}
