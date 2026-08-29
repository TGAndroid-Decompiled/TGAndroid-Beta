package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new d6.d(8);
    public String f5503a;
    public String f5504b;
    public String f5505c;
    public String d;
    public String f5506e;
    public String f5507f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f5503a);
        o.l(parcel, 3, this.f5504b);
        o.l(parcel, 4, this.f5505c);
        o.l(parcel, 5, this.d);
        o.l(parcel, 6, this.f5506e);
        o.l(parcel, 7, this.f5507f);
        o.l(parcel, 8, this.h);
        o.r(parcel, q6);
    }
}
