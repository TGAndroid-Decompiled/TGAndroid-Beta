package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class n3 extends i1.c {
    public static final Parcelable.Creator<n3> CREATOR = new i1.b(2);
    public int f14904c;
    public boolean d;

    public n3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f14904c = parcel.readInt();
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
        parcel.writeInt(this.f14904c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
