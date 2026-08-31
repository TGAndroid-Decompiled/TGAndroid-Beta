package n7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class ig extends c6.a {
    public static final Parcelable.Creator<ig> CREATOR = new dg(1);
    public final float[] f15596a;
    public final Bitmap f15597b;
    public final int f15598c;
    public final int d;
    public final int f15599e;
    public final int f15600f;
    public final int h;

    public ig(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f15596a = fArr;
        this.f15597b = bitmap;
        this.f15598c = i10;
        this.d = i11;
        this.f15599e = i12;
        this.f15600f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        float[] fArr = this.f15596a;
        if (fArr != null) {
            int q11 = j7.g5.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            j7.g5.r(parcel, q11);
        }
        j7.g5.k(parcel, 2, this.f15597b, i10);
        j7.g5.s(parcel, 3, 4);
        parcel.writeInt(this.f15598c);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.g5.s(parcel, 5, 4);
        parcel.writeInt(this.f15599e);
        j7.g5.s(parcel, 6, 4);
        parcel.writeInt(this.f15600f);
        j7.g5.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        j7.g5.r(parcel, q10);
    }
}
