package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new i4.g(5);
    public int f8566a;
    public String f8567b;
    public double f8568c;
    public String d;
    public long f8569e;
    public int f8570f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.f8566a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        o.l(parcel, 3, this.f8567b);
        double d = this.f8568c;
        o.s(parcel, 4, 8);
        parcel.writeDouble(d);
        o.l(parcel, 5, this.d);
        long j10 = this.f8569e;
        o.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f8570f;
        o.s(parcel, 7, 4);
        parcel.writeInt(i12);
        o.r(parcel, q6);
    }
}
