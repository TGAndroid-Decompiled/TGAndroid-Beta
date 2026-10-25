package a8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class ah extends p6.a {
    public static final Parcelable.Creator<ah> CREATOR = new vg(1);
    public final float[] f361a;
    public final Bitmap f362b;
    public final int f363c;
    public final int d;
    public final int e;
    public final int f364f;
    public final int h;

    public ah(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f361a = fArr;
        this.f362b = bitmap;
        this.f363c = i10;
        this.d = i11;
        this.e = i12;
        this.f364f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        float[] fArr = this.f361a;
        if (fArr != null) {
            int q9 = df.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            df.r(parcel, q9);
        }
        df.k(parcel, 2, this.f362b, i10);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f363c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.f364f);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        df.r(parcel, q5);
    }
}
