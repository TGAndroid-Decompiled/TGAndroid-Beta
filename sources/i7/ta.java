package i7;

import android.os.Parcel;
import android.os.Parcelable;

public final class ta extends z5.a {
    public static final Parcelable.Creator<ta> CREATOR = new s5(3);

    public final float f10843a;

    public final int f10844b;

    public ta(float f10, int i10) {
        this.f10843a = f10;
        this.f10844b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = h7.r8.q(parcel, 20293);
        h7.r8.s(parcel, 1, 4);
        parcel.writeFloat(this.f10843a);
        h7.r8.s(parcel, 2, 4);
        parcel.writeInt(this.f10844b);
        h7.r8.r(parcel, iQ);
    }
}
