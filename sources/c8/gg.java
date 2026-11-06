package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class gg extends r6.a {
    public static final Parcelable.Creator<gg> CREATOR = new ag(2);
    public final List f5692a;
    public final float[] f5693b;
    public final Bitmap f5694c;
    public final List d;

    public gg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f5692a = arrayList;
        this.f5693b = fArr;
        this.f5694c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.p(parcel, 1, this.f5692a);
        float[] fArr = this.f5693b;
        if (fArr != null) {
            int r11 = wb.r(parcel, 2);
            parcel.writeFloatArray(fArr);
            wb.s(parcel, r11);
        }
        wb.k(parcel, 3, this.f5694c, i7);
        List list = this.d;
        if (list != null) {
            int r12 = wb.r(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            wb.s(parcel, r12);
        }
        wb.s(parcel, r10);
    }
}
