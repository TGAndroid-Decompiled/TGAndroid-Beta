package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import java.util.ArrayList;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public LatLng f12919a;
    public double f12920b;
    public float f12921c;
    public int d;
    public int e;
    public float f12922f;
    public boolean h;
    public boolean f12923n;
    public ArrayList f12924r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.f12919a, i10);
        double d = this.f12920b;
        f0.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f7 = this.f12921c;
        f0.s(parcel, 4, 4);
        parcel.writeFloat(f7);
        int i11 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        f0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f12922f;
        f0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        f0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f12923n;
        f0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        f0.p(parcel, 10, this.f12924r);
        f0.r(parcel, q6);
    }
}
