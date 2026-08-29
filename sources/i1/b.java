package i1;

import android.os.Parcel;
import android.os.Parcelable;
import f2.g1;
public abstract class b implements Parcelable {
    public final Parcelable f8208a;
    public static final a f8207b = new b();
    public static final Parcelable.Creator<b> CREATOR = new g1(1);

    public b() {
        this.f8208a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f8208a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f8208a = parcelable == f8207b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f8208a = readParcelable == null ? f8207b : readParcelable;
    }
}
