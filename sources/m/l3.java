package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class l3 extends i1.b {
    public static final Parcelable.Creator<l3> CREATOR = new f2.f1(3);
    public int f13243c;
    public boolean d;

    public l3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z4;
        this.f13243c = parcel.readInt();
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
        parcel.writeInt(this.f13243c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
