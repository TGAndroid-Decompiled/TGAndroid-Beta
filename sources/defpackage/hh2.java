package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class hh2 extends b4 {
    public static final Parcelable.Creator<hh2> CREATOR = new igd((byte) 2);
    public LatLng a;
    public double b;
    public float c;
    public int d;
    public int e;
    public float f;
    public boolean h;
    public boolean n;
    public ArrayList r;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        double d = this.b;
        jte.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeFloat(f);
        int i2 = this.d;
        jte.q(parcel, 5, 4);
        parcel.writeInt(i2);
        int i3 = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(i3);
        float f2 = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.h;
        jte.q(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.n;
        jte.q(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jte.p(parcel, 10, this.r);
        jte.s(parcel, r);
    }
}
