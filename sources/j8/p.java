package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class p extends z5.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);

    public final int f12817a;

    public final b f12818b;

    public p(int i10, b bVar) {
        this.f12817a = i10;
        this.f12818b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12817a);
        r8.k(parcel, 3, this.f12818b, i10);
        r8.r(parcel, iQ);
    }
}
