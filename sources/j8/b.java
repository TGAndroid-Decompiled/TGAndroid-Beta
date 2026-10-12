package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import java.util.ArrayList;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public LatLng f12881a;
    public double f12882b;
    public float f12883c;
    public int d;
    public int e;
    public float f12884f;
    public boolean h;
    public boolean f12885n;
    public ArrayList f12886r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f12881a, i10);
        double d = this.f12882b;
        g0.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f7 = this.f12883c;
        g0.s(parcel, 4, 4);
        parcel.writeFloat(f7);
        int i11 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f12884f;
        g0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f12885n;
        g0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        g0.p(parcel, 10, this.f12886r);
        g0.r(parcel, q6);
    }
}
