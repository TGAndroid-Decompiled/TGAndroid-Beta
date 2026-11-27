package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class hxb extends x1 {
    public static final Parcelable.Creator<hxb> CREATOR = new w1((byte) 3);
    public int c;
    public boolean d;

    public hxb(Parcel parcel, ClassLoader classLoader) {
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
