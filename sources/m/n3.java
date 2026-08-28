package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class n3 extends i1.b {
    public static final Parcelable.Creator<n3> CREATOR = new f2.j1(3);
    public int f17018c;
    public boolean d;

    public n3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f17018c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f17018c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
