package n4;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new m8.h(8);
    public int f16549a;
    public int f16550b;
    public int f16551c;
    public int d;
    public int f16552e;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16549a);
        parcel.writeInt(this.f16551c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f16552e);
        parcel.writeInt(this.f16550b);
    }
}
