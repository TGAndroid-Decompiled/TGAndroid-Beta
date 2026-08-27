package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class t extends z5.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);

    public final int f12833a;

    public final boolean f12834b;

    public final boolean f12835c;

    public t(int i10, boolean z10, boolean z11) {
        this.f12833a = i10;
        this.f12834b = z10;
        this.f12835c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12833a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12834b ? 1 : 0);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f12835c ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
