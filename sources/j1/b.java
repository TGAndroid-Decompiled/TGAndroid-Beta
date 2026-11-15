package j1;

import android.os.Parcel;
import android.os.Parcelable;
import c5.j;
public abstract class b implements Parcelable {
    public final Parcelable f16759a;
    public static final a f16758b = new b();
    public static final Parcelable.Creator<b> CREATOR = new j(1);

    public b() {
        this.f16759a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f16759a, i7);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f16759a = parcelable == f16758b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f16759a = readParcelable == null ? f16758b : readParcelable;
    }
}
