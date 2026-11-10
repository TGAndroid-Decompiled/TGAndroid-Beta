package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class fg extends r6.a {
    public static final Parcelable.Creator<fg> CREATOR = new ag(1);
    public final float[] f5672a;
    public final Bitmap f5673b;
    public final int f5674c;
    public final int d;
    public final int f5675e;
    public final int f5676f;
    public final int h;

    public fg(float[] fArr, Bitmap bitmap, int i7, int i10, int i11, int i12, int i13) {
        this.f5672a = fArr;
        this.f5673b = bitmap;
        this.f5674c = i7;
        this.d = i10;
        this.f5675e = i11;
        this.f5676f = i12;
        this.h = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        float[] fArr = this.f5672a;
        if (fArr != null) {
            int r11 = xb.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            xb.s(parcel, r11);
        }
        xb.k(parcel, 2, this.f5673b, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f5674c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f5675e);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f5676f);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        xb.s(parcel, r10);
    }
}
