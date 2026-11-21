package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(3);
    public LatLng f20915a;
    public double f20916b;
    public float f20917c;
    public int d;
    public int f20918e;
    public float f20919f;
    public boolean h;
    public boolean f20920n;
    public ArrayList f20921r;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f20915a, i7);
        double d = this.f20916b;
        bc.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f20917c;
        bc.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f20918e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f20919f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20920n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.p(parcel, 10, this.f20921r);
        bc.s(parcel, r10);
    }
}
