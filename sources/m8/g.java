package m8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.maps.model.LatLng;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float E;
    public LatLng f20540a;
    public String f20541b;
    public String f20542c;
    public ia.d d;
    public float f20543e;
    public float f20544f;
    public boolean h;
    public boolean f20545n;
    public boolean f20546r;
    public float f20547s;
    public float f20548w;
    public float f20549x;
    public float f20550y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f20540a, i7);
        yb.l(parcel, 3, this.f20541b);
        yb.l(parcel, 4, this.f20542c);
        ia.d dVar = this.d;
        if (dVar == null) {
            asBinder = null;
        } else {
            asBinder = ((a7.a) dVar.f15881b).asBinder();
        }
        yb.f(parcel, 5, asBinder);
        float f10 = this.f20543e;
        yb.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f20544f;
        yb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        yb.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20545n;
        yb.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f20546r;
        yb.q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.f20547s;
        yb.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.f20548w;
        yb.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f20549x;
        yb.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f20550y;
        yb.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        yb.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        yb.s(parcel, r10);
    }
}
