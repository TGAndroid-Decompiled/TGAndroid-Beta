package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(3);
    public LatLng f20918a;
    public double f20919b;
    public float f20920c;
    public int d;
    public int f20921e;
    public float f20922f;
    public boolean h;
    public boolean f20923n;
    public ArrayList f20924r;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f20918a, i7);
        double d = this.f20919b;
        bc.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f20920c;
        bc.q(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f20921e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f20922f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f20923n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.p(parcel, 10, this.f20924r);
        bc.s(parcel, r10);
    }
}
