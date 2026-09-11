package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import java.util.ArrayList;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public LatLng f13559a;
    public double f13560b;
    public float f13561c;
    public int d;
    public int f13562e;
    public float f13563f;
    public boolean h;
    public boolean f13564n;
    public ArrayList f13565r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f13559a, i10);
        double d = this.f13560b;
        e0.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f7 = this.f13561c;
        e0.s(parcel, 4, 4);
        parcel.writeFloat(f7);
        int i11 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.f13562e;
        e0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f13563f;
        e0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        e0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f13564n;
        e0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        e0.p(parcel, 10, this.f13565r);
        e0.r(parcel, q6);
    }
}
