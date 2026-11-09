package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class gg extends r6.a {
    public static final Parcelable.Creator<gg> CREATOR = new ag(2);
    public final List f5688a;
    public final float[] f5689b;
    public final Bitmap f5690c;
    public final List d;

    public gg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f5688a = arrayList;
        this.f5689b = fArr;
        this.f5690c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 1, this.f5688a);
        float[] fArr = this.f5689b;
        if (fArr != null) {
            int r11 = xb.r(parcel, 2);
            parcel.writeFloatArray(fArr);
            xb.s(parcel, r11);
        }
        xb.k(parcel, 3, this.f5690c, i7);
        List list = this.d;
        if (list != null) {
            int r12 = xb.r(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            xb.s(parcel, r12);
        }
        xb.s(parcel, r10);
    }
}
