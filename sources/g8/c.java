package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new b(2);
    public int f7133a;
    public int f7134b;
    public int f7135c;
    public boolean d;
    public boolean f7136e;
    public float f7137f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.f7133a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f7134b;
        o.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f7135c;
        o.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        o.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f7136e;
        o.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f9 = this.f7137f;
        o.s(parcel, 7, 4);
        parcel.writeFloat(f9);
        o.r(parcel, q6);
    }
}
