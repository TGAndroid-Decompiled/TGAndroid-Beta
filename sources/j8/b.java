package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import java.util.ArrayList;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public LatLng f14069a;
    public double f14070b;
    public float f14071c;
    public int d;
    public int f14072e;
    public float f14073f;
    public boolean h;
    public boolean f14074n;
    public ArrayList f14075r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 2, this.f14069a, i10);
        double d = this.f14070b;
        d0.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f7 = this.f14071c;
        d0.s(parcel, 4, 4);
        parcel.writeFloat(f7);
        int i11 = this.d;
        d0.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.f14072e;
        d0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f14073f;
        d0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        d0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f14074n;
        d0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        d0.p(parcel, 10, this.f14075r);
        d0.r(parcel, q6);
    }
}
