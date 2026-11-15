package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class gg extends r6.a {
    public static final Parcelable.Creator<gg> CREATOR = new ag(2);
    public final List f4515a;
    public final float[] f4516b;
    public final Bitmap f4517c;
    public final List d;

    public gg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f4515a = arrayList;
        this.f4516b = fArr;
        this.f4517c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.p(parcel, 1, this.f4515a);
        float[] fArr = this.f4516b;
        if (fArr != null) {
            int r11 = yb.r(parcel, 2);
            parcel.writeFloatArray(fArr);
            yb.s(parcel, r11);
        }
        yb.k(parcel, 3, this.f4517c, i7);
        List list = this.d;
        if (list != null) {
            int r12 = yb.r(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            yb.s(parcel, r12);
        }
        yb.s(parcel, r10);
    }
}
