package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new d6.d(4);
    public h f5482a;
    public String f5483b;
    public String f5484c;
    public i[] d;
    public f[] f5485e;
    public String[] f5486f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 2, this.f5482a, i10);
        o.l(parcel, 3, this.f5483b);
        o.l(parcel, 4, this.f5484c);
        o.o(parcel, 5, this.d, i10);
        o.o(parcel, 6, this.f5485e, i10);
        o.m(parcel, 7, this.f5486f);
        o.o(parcel, 8, this.h, i10);
        o.r(parcel, q6);
    }
}
