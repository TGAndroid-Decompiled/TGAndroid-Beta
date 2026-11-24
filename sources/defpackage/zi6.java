package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
public final class zi6 extends b4 {
    public static final Parcelable.Creator<zi6> CREATOR = new rhe((byte) 0);
    public float E;
    public LatLng a;
    public String b;
    public String c;
    public lj9 d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public float s;
    public float w;
    public float x;
    public float y;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        lj9 lj9Var = this.d;
        if (lj9Var == null) {
            asBinder = null;
        } else {
            asBinder = ((yi5) lj9Var.b).asBinder();
        }
        jte.f(parcel, 5, asBinder);
        float f = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.h;
        jte.q(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.n;
        jte.q(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.r;
        jte.q(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.s;
        jte.q(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.w;
        jte.q(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.x;
        jte.q(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.y;
        jte.q(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.E;
        jte.q(parcel, 15, 4);
        parcel.writeFloat(f7);
        jte.s(parcel, r);
    }
}
