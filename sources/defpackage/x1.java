package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class x1 implements Parcelable {
    public final Parcelable a;
    public static final v1 b = new x1();
    public static final Parcelable.Creator<x1> CREATOR = new w1((byte) 0);

    public x1(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
        } else {
            lq5.j("superState must not be null");
            throw null;
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public x1() {
        this.a = null;
    }

    public x1(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? b : readParcelable;
    }
}
