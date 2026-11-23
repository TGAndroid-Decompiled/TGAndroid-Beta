package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class fg extends r6.a {
    public static final Parcelable.Creator<fg> CREATOR = new ag(1);
    public final float[] f4770a;
    public final Bitmap f4771b;
    public final int f4772c;
    public final int d;
    public final int f4773e;
    public final int f4774f;
    public final int h;

    public fg(float[] fArr, Bitmap bitmap, int i7, int i10, int i11, int i12, int i13) {
        this.f4770a = fArr;
        this.f4771b = bitmap;
        this.f4772c = i7;
        this.d = i10;
        this.f4773e = i11;
        this.f4774f = i12;
        this.h = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        float[] fArr = this.f4770a;
        if (fArr != null) {
            int r11 = cc.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            cc.s(parcel, r11);
        }
        cc.k(parcel, 2, this.f4771b, i7);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f4772c);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f4773e);
        cc.q(parcel, 6, 4);
        parcel.writeInt(this.f4774f);
        cc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        cc.s(parcel, r10);
    }
}
