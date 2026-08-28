package j7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends y5.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] f13956a;
    public final Bitmap f13957b;
    public final int f13958c;
    public final int d;
    public final int f13959e;
    public final int f13960f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i9, int i10, int i11, int i12, int i13) {
        this.f13956a = fArr;
        this.f13957b = bitmap;
        this.f13958c = i9;
        this.d = i10;
        this.f13959e = i11;
        this.f13960f = i12;
        this.h = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        float[] fArr = this.f13956a;
        if (fArr != null) {
            int q11 = g7.p8.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            g7.p8.r(parcel, q11);
        }
        g7.p8.k(parcel, 2, this.f13957b, i9);
        g7.p8.s(parcel, 3, 4);
        parcel.writeInt(this.f13958c);
        g7.p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g7.p8.s(parcel, 5, 4);
        parcel.writeInt(this.f13959e);
        g7.p8.s(parcel, 6, 4);
        parcel.writeInt(this.f13960f);
        g7.p8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g7.p8.r(parcel, q10);
    }
}
