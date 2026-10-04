package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import ii.n4;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng f14045a;
    public String f14046b;
    public String f14047c;
    public n4 d;
    public float f14048e;
    public float f14049f;
    public boolean h;
    public boolean f14050n;
    public boolean f14051r;
    public float f14052s;
    public float v;
    public float f14053w;
    public float f14054x;
    public float f14055y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f14045a, i10);
        g0.l(parcel, 3, this.f14046b);
        g0.l(parcel, 4, this.f14047c);
        n4 n4Var = this.d;
        if (n4Var == null) {
            asBinder = null;
        } else {
            asBinder = ((x6.a) n4Var.f12543b).asBinder();
        }
        g0.f(parcel, 5, asBinder);
        float f7 = this.f14048e;
        g0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f14049f;
        g0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f14050n;
        g0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f14051r;
        g0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f14052s;
        g0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        g0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f14053w;
        g0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f14054x;
        g0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f14055y;
        g0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        g0.r(parcel, q6);
    }
}
