package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class gg extends r6.a {
    public static final Parcelable.Creator<gg> CREATOR = new ag(2);
    public final List f4799a;
    public final float[] f4800b;
    public final Bitmap f4801c;
    public final List d;

    public gg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f4799a = arrayList;
        this.f4800b = fArr;
        this.f4801c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.p(parcel, 1, this.f4799a);
        float[] fArr = this.f4800b;
        if (fArr != null) {
            int r11 = bc.r(parcel, 2);
            parcel.writeFloatArray(fArr);
            bc.s(parcel, r11);
        }
        bc.k(parcel, 3, this.f4801c, i7);
        List list = this.d;
        if (list != null) {
            int r12 = bc.r(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeFloat(((Float) list.get(i10)).floatValue());
            }
            bc.s(parcel, r12);
        }
        bc.s(parcel, r10);
    }
}
