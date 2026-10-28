package k8;

import a8.df;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h8.j;
import jg.i;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng f16443a;
    public String f16444b;
    public String f16445c;
    public i d;
    public float e;
    public float f16446f;
    public boolean h;
    public boolean f16447n;
    public boolean f16448r;
    public float f16449s;
    public float v;
    public float f16450w;
    public float f16451x;
    public float f16452y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f16443a, i10);
        df.l(parcel, 3, this.f16444b);
        df.l(parcel, 4, this.f16445c);
        i iVar = this.d;
        if (iVar == null) {
            asBinder = null;
        } else {
            asBinder = ((y6.a) iVar.f15725a).asBinder();
        }
        df.f(parcel, 5, asBinder);
        float f7 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f16446f;
        df.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        df.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f16447n;
        df.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f16448r;
        df.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f16449s;
        df.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        df.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f16450w;
        df.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f16451x;
        df.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f16452y;
        df.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        df.r(parcel, q5);
    }
}
