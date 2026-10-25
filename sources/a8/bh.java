package a8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class bh extends p6.a {
    public static final Parcelable.Creator<bh> CREATOR = new vg(2);
    public final List f376a;
    public final float[] f377b;
    public final Bitmap f378c;
    public final List d;

    public bh(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f376a = arrayList;
        this.f377b = fArr;
        this.f378c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.p(parcel, 1, this.f376a);
        float[] fArr = this.f377b;
        if (fArr != null) {
            int q9 = df.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            df.r(parcel, q9);
        }
        df.k(parcel, 3, this.f378c, i10);
        List list = this.d;
        if (list != null) {
            int q10 = df.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            df.r(parcel, q10);
        }
        df.r(parcel, q5);
    }
}
