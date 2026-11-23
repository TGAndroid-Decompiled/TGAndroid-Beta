package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(3);
    public LatLng f20980a;
    public double f20981b;
    public float f20982c;
    public int d;
    public int f20983e;
    public float f20984f;
    public boolean h;
    public boolean f20985n;
    public ArrayList f20986r;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f20980a, i7);
        double d = this.f20981b;
        cc.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f20982c;
        cc.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f20983e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f20984f;
        cc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        cc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20985n;
        cc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        cc.p(parcel, 10, this.f20986r);
        cc.s(parcel, r10);
    }
}
