package m;

import android.os.Parcel;
import android.os.Parcelable;
public final class j3 extends i1.c {
    public static final Parcelable.Creator<j3> CREATOR = new i1.b(2);
    public int f15556c;
    public boolean d;

    public j3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f15556c = parcel.readInt();
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
        parcel.writeInt(this.f15556c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
