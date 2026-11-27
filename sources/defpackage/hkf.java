package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class hkf extends c4 {
    public static final Parcelable.Creator<hkf> CREATOR = new t4f((byte) 28);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public hkf(float[] fArr, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
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
        int r = bye.r(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int r2 = bye.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            bye.s(parcel, r2);
        }
        bye.k(parcel, 2, this.b, i);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        bye.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        bye.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bye.s(parcel, r);
    }
}
