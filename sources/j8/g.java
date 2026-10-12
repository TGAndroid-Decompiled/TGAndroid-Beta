package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import w7.c0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng f14080a;
    public String f14081b;
    public String f14082c;
    public xa.c d;
    public float f14083e;
    public float f14084f;
    public boolean h;
    public boolean f14085n;
    public boolean f14086r;
    public float f14087s;
    public float v;
    public float f14088w;
    public float f14089x;
    public float f14090y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 2, this.f14080a, i10);
        c0.l(parcel, 3, this.f14081b);
        c0.l(parcel, 4, this.f14082c);
        xa.c cVar = this.d;
        if (cVar == null) {
            asBinder = null;
        } else {
            asBinder = ((x6.a) cVar.f51335b).asBinder();
        }
        c0.f(parcel, 5, asBinder);
        float f7 = this.f14083e;
        c0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f14084f;
        c0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        c0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f14085n;
        c0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f14086r;
        c0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f14087s;
        c0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        c0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f14088w;
        c0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f14089x;
        c0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f14090y;
        c0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        c0.r(parcel, q6);
    }
}
