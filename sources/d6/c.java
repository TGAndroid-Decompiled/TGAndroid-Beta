package d6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new d(0);
    public final int f5424a;
    public final boolean f5425b;

    public c(int i10, boolean z10) {
        this.f5424a = i10;
        this.f5425b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f5424a);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.f5425b ? 1 : 0);
        o.r(parcel, q6);
    }
}
