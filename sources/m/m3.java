package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class m3 extends i1.b {
    public static final Parcelable.Creator<m3> CREATOR = new f2.g1(3);
    public int f16602c;
    public boolean d;

    public m3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f16602c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f16602c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
