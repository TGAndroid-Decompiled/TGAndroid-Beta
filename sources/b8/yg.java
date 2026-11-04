package b8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class yg extends q6.a {
    public static final Parcelable.Creator<yg> CREATOR = new sg(2);
    public final List f3149a;
    public final float[] f3150b;
    public final Bitmap f3151c;
    public final List d;

    public yg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f3149a = arrayList;
        this.f3150b = fArr;
        this.f3151c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.q(parcel, 1, this.f3149a);
        float[] fArr = this.f3150b;
        if (fArr != null) {
            int s10 = j8.a.s(parcel, 2);
            parcel.writeFloatArray(fArr);
            j8.a.t(parcel, s10);
        }
        j8.a.l(parcel, 3, this.f3151c, i3);
        List list = this.d;
        if (list != null) {
            int s11 = j8.a.s(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            j8.a.t(parcel, s11);
        }
        j8.a.t(parcel, s6);
    }
}
