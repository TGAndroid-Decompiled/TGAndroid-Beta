package g8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new b(0);
    public final PointF[] f7130a;
    public final int f7131b;

    public a(PointF[] pointFArr, int i10) {
        this.f7130a = pointFArr;
        this.f7131b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.o(parcel, 2, this.f7130a, i10);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.f7131b);
        o.r(parcel, q6);
    }
}
