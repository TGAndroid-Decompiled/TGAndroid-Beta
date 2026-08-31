package i1;

import android.os.Parcel;
import android.os.Parcelable;
import f2.f1;
public abstract class b implements Parcelable {
    public final Parcelable f7779a;
    public static final a f7778b = new b();
    public static final Parcelable.Creator<b> CREATOR = new f1(1);

    public b() {
        this.f7779a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7779a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7779a = parcelable == f7778b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f7779a = readParcelable == null ? f7778b : readParcelable;
    }
}
