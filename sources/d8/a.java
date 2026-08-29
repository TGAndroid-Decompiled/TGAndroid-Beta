package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new d6.d(1);
    public int f5469a;
    public String[] f5470b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.f5469a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        o.m(parcel, 3, this.f5470b);
        o.r(parcel, q6);
    }
}
