package m8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.maps.model.LatLng;
import hi.t5;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float E;
    public LatLng f20929a;
    public String f20930b;
    public String f20931c;
    public t5 d;
    public float f20932e;
    public float f20933f;
    public boolean h;
    public boolean f20934n;
    public boolean f20935r;
    public float f20936s;
    public float f20937w;
    public float f20938x;
    public float f20939y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f20929a, i7);
        bc.l(parcel, 3, this.f20930b);
        bc.l(parcel, 4, this.f20931c);
        t5 t5Var = this.d;
        if (t5Var == null) {
            asBinder = null;
        } else {
            asBinder = ((a7.a) t5Var.f15505b).asBinder();
        }
        bc.f(parcel, 5, asBinder);
        float f10 = this.f20932e;
        bc.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f20933f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20934n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f20935r;
        bc.q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.f20936s;
        bc.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.f20937w;
        bc.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f20938x;
        bc.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f20939y;
        bc.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        bc.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        bc.s(parcel, r10);
    }
}
