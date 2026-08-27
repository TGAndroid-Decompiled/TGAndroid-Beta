package f8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new f4.e(3);

    public int f5909a;

    public int f5910b;

    public int f5911c;
    public boolean d;

    public boolean f5912e;

    public float f5913f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f5909a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f5910b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f5911c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f5912e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f5913f;
        r8.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        r8.r(parcel, iQ);
    }
}
