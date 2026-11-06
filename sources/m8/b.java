package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(3);
    public LatLng f19926a;
    public double f19927b;
    public float f19928c;
    public int d;
    public int f19929e;
    public float f19930f;
    public boolean h;
    public boolean f19931n;
    public ArrayList f19932r;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.f19926a, i7);
        double d = this.f19927b;
        wb.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f19928c;
        wb.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f19929e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f19930f;
        wb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z9 = this.h;
        wb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f19931n;
        wb.q(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        wb.p(parcel, 10, this.f19932r);
        wb.s(parcel, r10);
    }
}
