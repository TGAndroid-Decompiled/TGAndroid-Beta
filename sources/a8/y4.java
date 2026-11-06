package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class y4 extends r6.a {
    public static final Parcelable.Creator<y4> CREATOR = new z5(0);
    public final String f713a;
    public final String f714b;
    public final float f715c;
    public final int d;

    public y4(float f10, int i7, String str, String str2) {
        this.f714b = str2;
        this.f715c = f10;
        this.f713a = str;
        this.d = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f714b);
        wb.q(parcel, 3, 4);
        parcel.writeFloat(this.f715c);
        wb.l(parcel, 4, this.f713a);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        wb.s(parcel, r10);
    }
}
