package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class gtb extends w1 {
    public static final Parcelable.Creator<gtb> CREATOR = new v1((byte) 3);
    public int c;
    public boolean d;

    public gtb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        this.c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
