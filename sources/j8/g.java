package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng f12928a;
    public String f12929b;
    public String f12930c;
    public xa.c d;
    public float e;
    public float f12931f;
    public boolean h;
    public boolean f12932n;
    public boolean f12933r;
    public float f12934s;
    public float v;
    public float f12935w;
    public float f12936x;
    public float f12937y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f12928a, i10);
        e0.l(parcel, 3, this.f12929b);
        e0.l(parcel, 4, this.f12930c);
        xa.c cVar = this.d;
        if (cVar == null) {
            asBinder = null;
        } else {
            asBinder = ((x6.a) cVar.f45737b).asBinder();
        }
        e0.f(parcel, 5, asBinder);
        float f7 = this.e;
        e0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f12931f;
        e0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        e0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f12932n;
        e0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f12933r;
        e0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f12934s;
        e0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        e0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f12935w;
        e0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f12936x;
        e0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f12937y;
        e0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        e0.r(parcel, q6);
    }
}
