package m8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.maps.model.LatLng;
import hi.u5;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float E;
    public LatLng f20898a;
    public String f20899b;
    public String f20900c;
    public u5 d;
    public float f20901e;
    public float f20902f;
    public boolean h;
    public boolean f20903n;
    public boolean f20904r;
    public float f20905s;
    public float f20906w;
    public float f20907x;
    public float f20908y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f20898a, i7);
        cc.l(parcel, 3, this.f20899b);
        cc.l(parcel, 4, this.f20900c);
        u5 u5Var = this.d;
        if (u5Var == null) {
            asBinder = null;
        } else {
            asBinder = ((a7.a) u5Var.f15495b).asBinder();
        }
        cc.f(parcel, 5, asBinder);
        float f10 = this.f20901e;
        cc.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f20902f;
        cc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        cc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20903n;
        cc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f20904r;
        cc.q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.f20905s;
        cc.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.f20906w;
        cc.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f20907x;
        cc.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f20908y;
        cc.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        cc.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        cc.s(parcel, r10);
    }
}
