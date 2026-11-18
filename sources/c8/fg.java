package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class fg extends r6.a {
    public static final Parcelable.Creator<fg> CREATOR = new ag(1);
    public final float[] f4781a;
    public final Bitmap f4782b;
    public final int f4783c;
    public final int d;
    public final int f4784e;
    public final int f4785f;
    public final int h;

    public fg(float[] fArr, Bitmap bitmap, int i7, int i10, int i11, int i12, int i13) {
        this.f4781a = fArr;
        this.f4782b = bitmap;
        this.f4783c = i7;
        this.d = i10;
        this.f4784e = i11;
        this.f4785f = i12;
        this.h = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        float[] fArr = this.f4781a;
        if (fArr != null) {
            int r11 = bc.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            bc.s(parcel, r11);
        }
        bc.k(parcel, 2, this.f4782b, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f4783c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f4784e);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f4785f);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bc.s(parcel, r10);
    }
}
