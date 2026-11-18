package m8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.maps.model.LatLng;
import hi.u5;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float E;
    public LatLng f20901a;
    public String f20902b;
    public String f20903c;
    public u5 d;
    public float f20904e;
    public float f20905f;
    public boolean h;
    public boolean f20906n;
    public boolean f20907r;
    public float f20908s;
    public float f20909w;
    public float f20910x;
    public float f20911y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f20901a, i7);
        bc.l(parcel, 3, this.f20902b);
        bc.l(parcel, 4, this.f20903c);
        u5 u5Var = this.d;
        if (u5Var == null) {
            asBinder = null;
        } else {
            asBinder = ((a7.a) u5Var.f15536b).asBinder();
        }
        bc.f(parcel, 5, asBinder);
        float f10 = this.f20904e;
        bc.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f20905f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20906n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f20907r;
        bc.q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.f20908s;
        bc.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.f20909w;
        bc.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f20910x;
        bc.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f20911y;
        bc.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        bc.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        bc.s(parcel, r10);
    }
}
