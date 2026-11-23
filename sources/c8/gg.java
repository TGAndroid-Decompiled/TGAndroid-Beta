package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class gg extends r6.a {
    public static final Parcelable.Creator<gg> CREATOR = new ag(2);
    public final List f4792a;
    public final float[] f4793b;
    public final Bitmap f4794c;
    public final List d;

    public gg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f4792a = arrayList;
        this.f4793b = fArr;
        this.f4794c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.p(parcel, 1, this.f4792a);
        float[] fArr = this.f4793b;
        if (fArr != null) {
            int r11 = cc.r(parcel, 2);
            parcel.writeFloatArray(fArr);
            cc.s(parcel, r11);
        }
        cc.k(parcel, 3, this.f4794c, i7);
        List list = this.d;
        if (list != null) {
            int r12 = cc.r(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            cc.s(parcel, r12);
        }
        cc.s(parcel, r10);
    }
}
