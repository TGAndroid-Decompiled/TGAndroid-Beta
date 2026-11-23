package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
public final class e extends r6.a implements r {
    public static final Parcelable.Creator<e> CREATOR = new j7.b(18);
    public final Status f17317a;
    public final f f17318b;

    public e(Status status, f fVar) {
        this.f17317a = status;
        this.f17318b = fVar;
    }

    @Override
    public final Status a() {
        return this.f17317a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f17317a, i7);
        cc.k(parcel, 2, this.f17318b, i7);
        cc.s(parcel, r10);
    }
}
