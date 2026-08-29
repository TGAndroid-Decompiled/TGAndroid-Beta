package a8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import z5.u;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(3);
    public final int f221a;
    public final u f222b;

    public g(int i10, u uVar) {
        this.f221a = i10;
        this.f222b = uVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f221a);
        o.k(parcel, 2, this.f222b, i10);
        o.r(parcel, q6);
    }
}
