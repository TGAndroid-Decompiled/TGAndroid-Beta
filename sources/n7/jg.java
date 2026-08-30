package n7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class jg extends c6.a {
    public static final Parcelable.Creator<jg> CREATOR = new dg(2);
    public final List f14627a;
    public final float[] f14628b;
    public final Bitmap f14629c;
    public final List d;

    public jg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f14627a = arrayList;
        this.f14628b = fArr;
        this.f14629c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.p(parcel, 1, this.f14627a);
        float[] fArr = this.f14628b;
        if (fArr != null) {
            int q11 = j7.f5.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            j7.f5.r(parcel, q11);
        }
        j7.f5.k(parcel, 3, this.f14629c, i10);
        List list = this.d;
        if (list != null) {
            int q12 = j7.f5.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            j7.f5.r(parcel, q12);
        }
        j7.f5.r(parcel, q10);
    }
}
