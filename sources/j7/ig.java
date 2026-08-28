package j7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class ig extends y5.a {
    public static final Parcelable.Creator<ig> CREATOR = new cg(2);
    public final List f13978a;
    public final float[] f13979b;
    public final Bitmap f13980c;
    public final List d;

    public ig(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f13978a = arrayList;
        this.f13979b = fArr;
        this.f13980c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.p(parcel, 1, this.f13978a);
        float[] fArr = this.f13979b;
        if (fArr != null) {
            int q11 = g7.p8.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            g7.p8.r(parcel, q11);
        }
        g7.p8.k(parcel, 3, this.f13980c, i9);
        List list = this.d;
        if (list != null) {
            int q12 = g7.p8.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            g7.p8.r(parcel, q12);
        }
        g7.p8.r(parcel, q10);
    }
}
