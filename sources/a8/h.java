package a8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import z5.v;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new w.a(4);
    public final int f223a;
    public final w5.a f224b;
    public final v f225c;

    public h(int i10, w5.a aVar, v vVar) {
        this.f223a = i10;
        this.f224b = aVar;
        this.f225c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f223a);
        o.k(parcel, 2, this.f224b, i10);
        o.k(parcel, 3, this.f225c, i10);
        o.r(parcel, q6);
    }
}
