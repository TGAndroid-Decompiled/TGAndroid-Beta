package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(3);
    public LatLng f20526a;
    public double f20527b;
    public float f20528c;
    public int d;
    public int f20529e;
    public float f20530f;
    public boolean h;
    public boolean f20531n;
    public ArrayList f20532r;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f20526a, i7);
        double d = this.f20527b;
        yb.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f20528c;
        yb.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f20529e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f20530f;
        yb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        yb.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20531n;
        yb.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        yb.p(parcel, 10, this.f20532r);
        yb.s(parcel, r10);
    }
}
