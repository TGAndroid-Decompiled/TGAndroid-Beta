package m8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.maps.model.LatLng;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float D;
    public LatLng f19943a;
    public String f19944b;
    public String f19945c;
    public k8.a d;
    public float f19946e;
    public float f19947f;
    public boolean h;
    public boolean f19948n;
    public boolean f19949r;
    public float f19950s;
    public float f19951w;
    public float f19952x;
    public float f19953y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f19943a, i7);
        xb.l(parcel, 3, this.f19944b);
        xb.l(parcel, 4, this.f19945c);
        k8.a aVar = this.d;
        if (aVar == null) {
            asBinder = null;
        } else {
            asBinder = aVar.f17230a.asBinder();
        }
        xb.f(parcel, 5, asBinder);
        float f10 = this.f19946e;
        xb.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f19947f;
        xb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z9 = this.h;
        xb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f19948n;
        xb.q(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f19949r;
        xb.q(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.f19950s;
        xb.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.f19951w;
        xb.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f19952x;
        xb.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f19953y;
        xb.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.D;
        xb.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        xb.s(parcel, r10);
    }
}
