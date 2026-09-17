package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(8);
    public int f16460a;
    public int f16461b;
    public int f16462c;
    public int d;
    public int f16463e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16460a);
        parcel.writeInt(this.f16462c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16463e);
        parcel.writeInt(this.f16461b);
    }
}
