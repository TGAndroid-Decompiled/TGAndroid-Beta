package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new b9.e(15);
    public int f5720a;
    public int f5721b;
    public boolean f5722c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5720a);
        parcel.writeInt(this.f5721b);
        parcel.writeInt(this.f5722c ? 1 : 0);
    }
}
