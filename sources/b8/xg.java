package b8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class xg extends q6.a {
    public static final Parcelable.Creator<xg> CREATOR = new sg(1);
    public final float[] f3130a;
    public final Bitmap f3131b;
    public final int f3132c;
    public final int d;
    public final int f3133e;
    public final int f3134f;
    public final int h;

    public xg(float[] fArr, Bitmap bitmap, int i3, int i10, int i11, int i12, int i13) {
        this.f3130a = fArr;
        this.f3131b = bitmap;
        this.f3132c = i3;
        this.d = i10;
        this.f3133e = i11;
        this.f3134f = i12;
        this.h = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        float[] fArr = this.f3130a;
        if (fArr != null) {
            int s10 = j8.a.s(parcel, 1);
            parcel.writeFloatArray(fArr);
            j8.a.t(parcel, s10);
        }
        j8.a.l(parcel, 2, this.f3131b, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f3132c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f3133e);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f3134f);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.h);
        j8.a.t(parcel, s6);
    }
}
