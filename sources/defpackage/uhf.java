package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class uhf extends b4 {
    public static final Parcelable.Creator<uhf> CREATOR = new e2f((byte) 29);
    public final ArrayList a;
    public final float[] b;
    public final Bitmap c;
    public final ArrayList d;

    public uhf(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = fArr;
        this.c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.p(parcel, 1, this.a);
        float[] fArr = this.b;
        if (fArr != null) {
            int r2 = mve.r(parcel, 2);
            parcel.writeFloatArray(fArr);
            mve.s(parcel, r2);
        }
        mve.k(parcel, 3, this.c, i);
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            int r3 = mve.r(parcel, 4);
            int size = arrayList.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeFloat(((Float) arrayList.get(i2)).floatValue());
            }
            mve.s(parcel, r3);
        }
        mve.s(parcel, r);
    }
}
