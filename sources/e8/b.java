package e8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new c.c(19);
    public int f4980a;
    public int f4981b;
    public int f4982c;
    public boolean d;
    public boolean f4983e;
    public float f4984f;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f4980a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f4981b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f4982c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        p8.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f4983e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f4984f;
        p8.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        p8.r(parcel, q10);
    }
}
