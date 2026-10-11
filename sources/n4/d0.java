package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new m8.h(8);
    public int f16595a;
    public int f16596b;
    public int f16597c;
    public int d;
    public int f16598e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16595a);
        parcel.writeInt(this.f16597c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16598e);
        parcel.writeInt(this.f16596b);
    }
}
