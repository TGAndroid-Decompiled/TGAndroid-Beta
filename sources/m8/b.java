package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(3);
    public LatLng f19929a;
    public double f19930b;
    public float f19931c;
    public int d;
    public int f19932e;
    public float f19933f;
    public boolean h;
    public boolean f19934n;
    public ArrayList f19935r;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f19929a, i7);
        double d = this.f19930b;
        xb.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f19931c;
        xb.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f19932e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f19933f;
        xb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z9 = this.h;
        xb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f19934n;
        xb.q(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        xb.p(parcel, 10, this.f19935r);
        xb.s(parcel, r10);
    }
}
