package m;

import android.os.Parcel;
import android.os.Parcelable;

public final class n3 extends i1.b {
    public static final Parcelable.Creator<n3> CREATOR = new f2.h1(3);

    public int f17393c;
    public boolean d;

    public n3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f17393c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f17393c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
