package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class i3 extends j1.b {
    public static final Parcelable.Creator<i3> CREATOR = new c5.j(3);
    public int f20180c;
    public boolean d;

    public i3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f20180c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f20180c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
