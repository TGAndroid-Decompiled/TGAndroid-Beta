package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class fg extends r6.a {
    public static final Parcelable.Creator<fg> CREATOR = new ag(1);
    public final float[] f5669a;
    public final Bitmap f5670b;
    public final int f5671c;
    public final int d;
    public final int f5672e;
    public final int f5673f;
    public final int h;

    public fg(float[] fArr, Bitmap bitmap, int i7, int i10, int i11, int i12, int i13) {
        this.f5669a = fArr;
        this.f5670b = bitmap;
        this.f5671c = i7;
        this.d = i10;
        this.f5672e = i11;
        this.f5673f = i12;
        this.h = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        float[] fArr = this.f5669a;
        if (fArr != null) {
            int r11 = wb.r(parcel, 1);
            parcel.writeFloatArray(fArr);
            wb.s(parcel, r11);
        }
        wb.k(parcel, 2, this.f5670b, i7);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f5671c);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f5672e);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f5673f);
        wb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        wb.s(parcel, r10);
    }
}
