package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new i4.g(8);
    public long f8573a;
    public long f8574b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        long j10 = this.f8573a;
        o.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f8574b;
        o.s(parcel, 3, 8);
        parcel.writeLong(j11);
        o.r(parcel, q6);
    }
}
