package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng f14082a;
    public String f14083b;
    public String f14084c;
    public xa.c d;
    public float f14085e;
    public float f14086f;
    public boolean h;
    public boolean f14087n;
    public boolean f14088r;
    public float f14089s;
    public float v;
    public float f14090w;
    public float f14091x;
    public float f14092y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 2, this.f14082a, i10);
        d0.l(parcel, 3, this.f14083b);
        d0.l(parcel, 4, this.f14084c);
        xa.c cVar = this.d;
        if (cVar == null) {
            asBinder = null;
        } else {
            asBinder = ((x6.a) cVar.f51194b).asBinder();
        }
        d0.f(parcel, 5, asBinder);
        float f7 = this.f14085e;
        d0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f14086f;
        d0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        d0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f14087n;
        d0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f14088r;
        d0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f14089s;
        d0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        d0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f14090w;
        d0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f14091x;
        d0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f14092y;
        d0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        d0.r(parcel, q6);
    }
}
