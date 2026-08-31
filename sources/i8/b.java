package i8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.g5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(10);
    public int f7925a;
    public int f7926b;
    public int f7927c;
    public boolean d;
    public boolean f7928e;
    public float f7929f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f7925a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f7926b;
        g5.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f7927c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z4 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f7928e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f7929f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        g5.r(parcel, q10);
    }
}
