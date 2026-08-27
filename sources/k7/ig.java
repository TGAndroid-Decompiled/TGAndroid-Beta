package k7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class ig extends z5.a {
    public static final Parcelable.Creator<ig> CREATOR = new cg(2);

    public final List f14832a;

    public final float[] f14833b;

    public final Bitmap f14834c;
    public final List d;

    public ig(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f14832a = arrayList;
        this.f14833b = fArr;
        this.f14834c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = h7.r8.q(parcel, 20293);
        h7.r8.p(parcel, 1, this.f14832a);
        float[] fArr = this.f14833b;
        if (fArr != null) {
            int iQ2 = h7.r8.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            h7.r8.r(parcel, iQ2);
        }
        h7.r8.k(parcel, 3, this.f14834c, i10);
        List list = this.d;
        if (list != null) {
            int iQ3 = h7.r8.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            h7.r8.r(parcel, iQ3);
        }
        h7.r8.r(parcel, iQ);
    }
}
