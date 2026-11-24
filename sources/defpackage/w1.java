package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class w1 implements Parcelable {
    public final Parcelable a;
    public static final u1 b = new w1();
    public static final Parcelable.Creator<w1> CREATOR = new v1((byte) 0);

    public w1(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
        } else {
            w26.j("superState must not be null");
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

    public w1() {
        this.a = null;
    }

    public w1(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? b : readParcelable;
    }
}
