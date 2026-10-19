package g8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(1);
    public final boolean f10932a;
    public final boolean f10933b;
    public final boolean f10934c;
    public final boolean d;
    public final boolean e;
    public final boolean f10935f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f10932a = z10;
        this.f10933b = z11;
        this.f10934c = z12;
        this.d = z13;
        this.e = z14;
        this.f10935f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f10932a ? 1 : 0);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10933b ? 1 : 0);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f10934c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f10935f ? 1 : 0);
        f0.r(parcel, q6);
    }
}
