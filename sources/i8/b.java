package i8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.f5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(10);
    public int f7346a;
    public int f7347b;
    public int f7348c;
    public boolean d;
    public boolean e;
    public float f7349f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f7346a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f7347b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f7348c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z4 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f7349f;
        f5.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        f5.r(parcel, q10);
    }
}
