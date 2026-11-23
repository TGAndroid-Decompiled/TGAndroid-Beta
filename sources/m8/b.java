package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(3);
    public LatLng f20884a;
    public double f20885b;
    public float f20886c;
    public int d;
    public int f20887e;
    public float f20888f;
    public boolean h;
    public boolean f20889n;
    public ArrayList f20890r;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f20884a, i7);
        double d = this.f20885b;
        cc.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f20886c;
        cc.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f20887e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f20888f;
        cc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        cc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20889n;
        cc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        cc.p(parcel, 10, this.f20890r);
        cc.s(parcel, r10);
    }
}
