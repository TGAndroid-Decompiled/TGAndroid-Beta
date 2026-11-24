package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
public final class cl6 extends b4 {
    public static final Parcelable.Creator<cl6> CREATOR = new sje((byte) 0);
    public float E;
    public LatLng a;
    public String b;
    public String c;
    public nl9 d;
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
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        nl9 nl9Var = this.d;
        if (nl9Var == null) {
            asBinder = null;
        } else {
            asBinder = ((xk5) nl9Var.b).asBinder();
        }
        mve.f(parcel, 5, asBinder);
        float f = this.e;
        mve.q(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.f;
        mve.q(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.h;
        mve.q(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.n;
        mve.q(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.r;
        mve.q(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.s;
        mve.q(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.w;
        mve.q(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.x;
        mve.q(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.y;
        mve.q(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.E;
        mve.q(parcel, 15, 4);
        parcel.writeFloat(f7);
        mve.s(parcel, r);
    }
}
