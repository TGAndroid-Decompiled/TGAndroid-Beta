package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class i3 extends i1.b {
    public static final Parcelable.Creator<i3> CREATOR = new b5.j(3);
    public int f18610c;
    public boolean d;

    public i3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f18610c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f18610c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
