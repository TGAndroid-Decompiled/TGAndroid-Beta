package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class rff extends b4 {
    public static final Parcelable.Creator<rff> CREATOR = new c0f((byte) 28);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public rff(float[] fArr, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        this.a = fArr;
        this.b = bitmap;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.h = i5;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int r2 = jte.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            jte.s(parcel, r2);
        }
        jte.k(parcel, 2, this.b, i);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        jte.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        jte.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        jte.s(parcel, r);
    }
}
