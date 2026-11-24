package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class k8f extends b4 {
    public static final Parcelable.Creator<k8f> CREATOR = new e2f((byte) 11);
    public final float a;
    public final int b;

    public k8f(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.s(parcel, r);
    }
}
