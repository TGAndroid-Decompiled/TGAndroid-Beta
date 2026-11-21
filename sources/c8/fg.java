package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class fg extends r6.a {
    public static final Parcelable.Creator<fg> CREATOR = new ag(1);
    public final float[] f4807a;
    public final Bitmap f4808b;
    public final int f4809c;
    public final int d;
    public final int f4810e;
    public final int f4811f;
    public final int h;

    public fg(float[] fArr, Bitmap bitmap, int i7, int i10, int i11, int i12, int i13) {
        this.f4807a = fArr;
        this.f4808b = bitmap;
        this.f4809c = i7;
        this.d = i10;
        this.f4810e = i11;
        this.f4811f = i12;
        this.h = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        float[] fArr = this.f4807a;
        if (fArr != null) {
            int r11 = bc.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            bc.s(parcel, r11);
        }
        bc.k(parcel, 2, this.f4808b, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f4809c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f4810e);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f4811f);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bc.s(parcel, r10);
    }
}
