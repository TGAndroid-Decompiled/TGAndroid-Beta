package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class k3 extends j1.b {
    public static final Parcelable.Creator<k3> CREATOR = new c5.i(3);
    public int f19149c;
    public boolean d;

    public k3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z9;
        this.f19149c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f19149c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
