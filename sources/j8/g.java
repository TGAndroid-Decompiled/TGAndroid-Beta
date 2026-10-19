package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng f14311a;
    public String f14312b;
    public String f14313c;
    public z2.b d;
    public float e;
    public float f14314f;
    public boolean h;
    public boolean f14315n;
    public boolean f14316r;
    public float f14317s;
    public float v;
    public float f14318w;
    public float f14319x;
    public float f14320y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.f14311a, i10);
        f0.l(parcel, 3, this.f14312b);
        f0.l(parcel, 4, this.f14313c);
        z2.b bVar = this.d;
        if (bVar == null) {
            asBinder = null;
        } else {
            asBinder = ((x6.a) bVar.f50626a).asBinder();
        }
        f0.f(parcel, 5, asBinder);
        float f7 = this.e;
        f0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f14314f;
        f0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        f0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f14315n;
        f0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f14316r;
        f0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f14317s;
        f0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        f0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f14318w;
        f0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f14319x;
        f0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f14320y;
        f0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        f0.r(parcel, q6);
    }
}
