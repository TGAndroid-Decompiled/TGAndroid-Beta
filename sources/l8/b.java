package l8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i7.p;
import java.util.ArrayList;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(17);
    public LatLng f18097a;
    public double f18098b;
    public float f18099c;
    public int d;
    public int f18100e;
    public float f18101f;
    public boolean h;
    public boolean f18102n;
    public ArrayList f18103r;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f18097a, i3);
        double d = this.f18098b;
        j8.a.r(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f18099c;
        j8.a.r(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f18100e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f18101f;
        j8.a.r(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f18102n;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j8.a.q(parcel, 10, this.f18103r);
        j8.a.t(parcel, s6);
    }
}
