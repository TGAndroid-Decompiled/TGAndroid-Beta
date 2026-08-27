package k7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public final class hg extends z5.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);

    public final float[] f14810a;

    public final Bitmap f14811b;

    public final int f14812c;
    public final int d;

    public final int f14813e;

    public final int f14814f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f14810a = fArr;
        this.f14811b = bitmap;
        this.f14812c = i10;
        this.d = i11;
        this.f14813e = i12;
        this.f14814f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = h7.r8.q(parcel, 20293);
        float[] fArr = this.f14810a;
        if (fArr != null) {
            int iQ2 = h7.r8.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            h7.r8.r(parcel, iQ2);
        }
        h7.r8.k(parcel, 2, this.f14811b, i10);
        h7.r8.s(parcel, 3, 4);
        parcel.writeInt(this.f14812c);
        h7.r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h7.r8.s(parcel, 5, 4);
        parcel.writeInt(this.f14813e);
        h7.r8.s(parcel, 6, 4);
        parcel.writeInt(this.f14814f);
        h7.r8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        h7.r8.r(parcel, iQ);
    }
}
