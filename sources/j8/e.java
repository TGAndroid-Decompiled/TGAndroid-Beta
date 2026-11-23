package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
public final class e extends r6.a implements r {
    public static final Parcelable.Creator<e> CREATOR = new j7.b(18);
    public final Status f17417a;
    public final f f17418b;

    public e(Status status, f fVar) {
        this.f17417a = status;
        this.f17418b = fVar;
    }

    @Override
    public final Status a() {
        return this.f17417a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f17417a, i7);
        cc.k(parcel, 2, this.f17418b, i7);
        cc.s(parcel, r10);
    }
}
