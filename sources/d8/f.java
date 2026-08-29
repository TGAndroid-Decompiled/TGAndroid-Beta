package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new d6.d(6);
    public int f5498a;
    public String f5499b;
    public String f5500c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.f5498a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        o.l(parcel, 3, this.f5499b);
        o.l(parcel, 4, this.f5500c);
        o.l(parcel, 5, this.d);
        o.r(parcel, q6);
    }
}
