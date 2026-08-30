package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class m3 extends i1.b {
    public static final Parcelable.Creator<m3> CREATOR = new f2.e1(3);
    public int f13562c;
    public boolean d;

    public m3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z4;
        this.f13562c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f13562c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
