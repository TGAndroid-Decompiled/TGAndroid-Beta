package d6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(28);
    public final boolean f5421a;
    public final int f5422b;

    public a(int i10, boolean z10) {
        this.f5421a = z10;
        this.f5422b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f5421a ? 1 : 0);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.f5422b);
        o.r(parcel, q6);
    }
}
