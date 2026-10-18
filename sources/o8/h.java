package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(23);
    public final int f17708a;
    public final k6.a f17709b;
    public final v f17710c;

    public h(int i10, k6.a aVar, v vVar) {
        this.f17708a = i10;
        this.f17709b = aVar;
        this.f17710c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f17708a);
        f0.k(parcel, 2, this.f17709b, i10);
        f0.k(parcel, 3, this.f17710c, i10);
        f0.r(parcel, q6);
    }
}
