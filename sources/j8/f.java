package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import k6.h;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new g8.g(14);
    public float D;
    public LatLng f9717a;
    public String f9718b;
    public String f9719c;
    public h d;
    public float e;
    public float f9720f;
    public boolean h;
    public boolean f9721n;
    public boolean f9722r;
    public float f9723s;
    public float f9724w;
    public float f9725x;
    public float f9726y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.f9717a, i10);
        h0.l(parcel, 3, this.f9718b);
        h0.l(parcel, 4, this.f9719c);
        h hVar = this.d;
        if (hVar == null) {
            asBinder = null;
        } else {
            asBinder = ((x6.a) hVar.f10944b).asBinder();
        }
        h0.f(parcel, 5, asBinder);
        float f7 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f9720f;
        h0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        h0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f9721n;
        h0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f9722r;
        h0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f9723s;
        h0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.f9724w;
        h0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f9725x;
        h0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f9726y;
        h0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.D;
        h0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        h0.r(parcel, q6);
    }
}
