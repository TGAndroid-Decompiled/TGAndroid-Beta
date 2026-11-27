package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class zaf extends c4 {
    public static final Parcelable.Creator<zaf> CREATOR = new t4f((byte) 11);
    public final float a;
    public final int b;

    public zaf(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.s(parcel, r);
    }
}
