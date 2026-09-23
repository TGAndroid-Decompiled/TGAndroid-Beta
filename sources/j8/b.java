package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import java.util.ArrayList;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public LatLng f12908a;
    public double f12909b;
    public float f12910c;
    public int d;
    public int e;
    public float f12911f;
    public boolean h;
    public boolean f12912n;
    public ArrayList f12913r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f12908a, i10);
        double d = this.f12909b;
        e0.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f7 = this.f12910c;
        e0.s(parcel, 4, 4);
        parcel.writeFloat(f7);
        int i11 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        e0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f12911f;
        e0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        e0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f12912n;
        e0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        e0.p(parcel, 10, this.f12913r);
        e0.r(parcel, q6);
    }
}
