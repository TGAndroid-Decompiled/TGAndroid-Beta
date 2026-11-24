package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
public final class vi2 extends b4 {
    public static final Parcelable.Creator<vi2> CREATOR = new jid((byte) 2);
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
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        double d = this.b;
        mve.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeFloat(f);
        int i2 = this.d;
        mve.q(parcel, 5, 4);
        parcel.writeInt(i2);
        int i3 = this.e;
        mve.q(parcel, 6, 4);
        parcel.writeInt(i3);
        float f2 = this.f;
        mve.q(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.h;
        mve.q(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.n;
        mve.q(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        mve.p(parcel, 10, this.r);
        mve.s(parcel, r);
    }
}
