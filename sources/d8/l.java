package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class l extends a6.a {
    public static final Parcelable.Creator<l> CREATOR = new d6.d(12);
    public String f5514a;
    public String f5515b;
    public int f5516c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f5514a);
        o.l(parcel, 3, this.f5515b);
        int i11 = this.f5516c;
        o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        o.r(parcel, q6);
    }
}
