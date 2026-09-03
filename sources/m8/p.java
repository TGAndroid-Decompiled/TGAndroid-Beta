package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f13824a;
    public final b f13825b;

    public p(int i10, b bVar) {
        this.f13824a = i10;
        this.f13825b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13824a);
        f5.k(parcel, 3, this.f13825b, i10);
        f5.r(parcel, q10);
    }
}
