package l7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends a6.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] f14815a;
    public final Bitmap f14816b;
    public final int f14817c;
    public final int d;
    public final int f14818e;
    public final int f14819f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f14815a = fArr;
        this.f14816b = bitmap;
        this.f14817c = i10;
        this.d = i11;
        this.f14818e = i12;
        this.f14819f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        float[] fArr = this.f14815a;
        if (fArr != null) {
            int q9 = com.google.android.gms.internal.cast.o.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            com.google.android.gms.internal.cast.o.r(parcel, q9);
        }
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f14816b, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f14817c);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f14818e);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(this.f14819f);
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
