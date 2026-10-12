package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng f12893a;
    public String f12894b;
    public String f12895c;
    public qb.c d;
    public float e;
    public float f12896f;
    public boolean h;
    public boolean f12897n;
    public boolean f12898r;
    public float f12899s;
    public float v;
    public float f12900w;
    public float f12901x;
    public float f12902y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f12893a, i10);
        g0.l(parcel, 3, this.f12894b);
        g0.l(parcel, 4, this.f12895c);
        qb.c cVar = this.d;
        if (cVar == null) {
            asBinder = null;
        } else {
            asBinder = ((x6.a) cVar.f43343b).asBinder();
        }
        g0.f(parcel, 5, asBinder);
        float f7 = this.e;
        g0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f12896f;
        g0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f12897n;
        g0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f12898r;
        g0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f12899s;
        g0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        g0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f12900w;
        g0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f12901x;
        g0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f12902y;
        g0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        g0.r(parcel, q6);
    }
}
