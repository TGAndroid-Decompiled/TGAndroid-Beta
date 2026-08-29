package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class v extends a6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<v> CREATOR = new m(4);
    public final Status f5468a;

    public v(Status status) {
        this.f5468a = status;
    }

    @Override
    public final Status i() {
        return this.f5468a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.f5468a, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
