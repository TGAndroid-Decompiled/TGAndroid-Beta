package n7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class ig extends c6.a {
    public static final Parcelable.Creator<ig> CREATOR = new dg(1);
    public final float[] f14607a;
    public final Bitmap f14608b;
    public final int f14609c;
    public final int d;
    public final int e;
    public final int f14610f;
    public final int h;

    public ig(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f14607a = fArr;
        this.f14608b = bitmap;
        this.f14609c = i10;
        this.d = i11;
        this.e = i12;
        this.f14610f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        float[] fArr = this.f14607a;
        if (fArr != null) {
            int q11 = j7.f5.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            j7.f5.r(parcel, q11);
        }
        j7.f5.k(parcel, 2, this.f14608b, i10);
        j7.f5.s(parcel, 3, 4);
        parcel.writeInt(this.f14609c);
        j7.f5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.f5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        j7.f5.s(parcel, 6, 4);
        parcel.writeInt(this.f14610f);
        j7.f5.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        j7.f5.r(parcel, q10);
    }
}
