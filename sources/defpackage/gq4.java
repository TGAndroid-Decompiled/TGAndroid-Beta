package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class gq4 implements Parcelable {
    public static final Parcelable.Creator<gq4> CREATOR = new g31((byte) 18);
    public String a;
    public int b;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
