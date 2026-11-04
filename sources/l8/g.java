package l8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import gi.v5;
import i7.p;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(21);
    public float E;
    public LatLng f18111a;
    public String f18112b;
    public String f18113c;
    public v5 d;
    public float f18114e;
    public float f18115f;
    public boolean h;
    public boolean f18116n;
    public boolean f18117r;
    public float f18118s;
    public float f18119w;
    public float f18120x;
    public float f18121y;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        IBinder asBinder;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f18111a, i3);
        j8.a.m(parcel, 3, this.f18112b);
        j8.a.m(parcel, 4, this.f18113c);
        v5 v5Var = this.d;
        if (v5Var == null) {
            asBinder = null;
        } else {
            asBinder = ((z6.a) v5Var.f13688b).asBinder();
        }
        j8.a.g(parcel, 5, asBinder);
        float f10 = this.f18114e;
        j8.a.r(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f18115f;
        j8.a.r(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f18116n;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f18117r;
        j8.a.r(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.f18118s;
        j8.a.r(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.f18119w;
        j8.a.r(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f18120x;
        j8.a.r(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f18121y;
        j8.a.r(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        j8.a.r(parcel, 15, 4);
        parcel.writeFloat(f16);
        j8.a.t(parcel, s6);
    }
}
