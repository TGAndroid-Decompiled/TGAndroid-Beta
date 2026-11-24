package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class shf extends b4 {
    public static final Parcelable.Creator<shf> CREATOR = new e2f((byte) 28);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public shf(float[] fArr, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
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
        int r = mve.r(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int r2 = mve.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            mve.s(parcel, r2);
        }
        mve.k(parcel, 2, this.b, i);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        mve.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        mve.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        mve.s(parcel, r);
    }
}
