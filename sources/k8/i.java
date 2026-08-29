package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class i extends a6.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f13513a;

    public i(int i10) {
        this.f13513a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13513a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
