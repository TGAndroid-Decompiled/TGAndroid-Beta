package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class s26 implements Parcelable {
    public static final Parcelable.Creator<s26> CREATOR = new x21((byte) 24);
    public int a;
    public int b;
    public boolean c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
