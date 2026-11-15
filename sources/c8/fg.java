package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class fg extends r6.a {
    public static final Parcelable.Creator<fg> CREATOR = new ag(1);
    public final float[] f4494a;
    public final Bitmap f4495b;
    public final int f4496c;
    public final int d;
    public final int f4497e;
    public final int f4498f;
    public final int h;

    public fg(float[] fArr, Bitmap bitmap, int i7, int i10, int i11, int i12, int i13) {
        this.f4494a = fArr;
        this.f4495b = bitmap;
        this.f4496c = i7;
        this.d = i10;
        this.f4497e = i11;
        this.f4498f = i12;
        this.h = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        float[] fArr = this.f4494a;
        if (fArr != null) {
            int r11 = yb.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            yb.s(parcel, r11);
        }
        yb.k(parcel, 2, this.f4495b, i7);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f4496c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f4497e);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.f4498f);
        yb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        yb.s(parcel, r10);
    }
}
