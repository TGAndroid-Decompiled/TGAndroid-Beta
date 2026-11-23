package m8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.maps.model.LatLng;
import hi.u0;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float E;
    public LatLng f20994a;
    public String f20995b;
    public String f20996c;
    public u0 d;
    public float f20997e;
    public float f20998f;
    public boolean h;
    public boolean f20999n;
    public boolean f21000r;
    public float f21001s;
    public float f21002w;
    public float f21003x;
    public float f21004y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f20994a, i7);
        cc.l(parcel, 3, this.f20995b);
        cc.l(parcel, 4, this.f20996c);
        u0 u0Var = this.d;
        if (u0Var == null) {
            asBinder = null;
        } else {
            asBinder = ((a7.a) u0Var.f15482b).asBinder();
        }
        cc.f(parcel, 5, asBinder);
        float f10 = this.f20997e;
        cc.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f20998f;
        cc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        cc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20999n;
        cc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f21000r;
        cc.q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.f21001s;
        cc.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.f21002w;
        cc.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f21003x;
        cc.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f21004y;
        cc.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        cc.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        cc.s(parcel, r10);
    }
}
