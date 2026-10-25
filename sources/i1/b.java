package i1;

import a5.k;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class b implements Parcelable {
    public final Parcelable f13471a;
    public static final a f13470b = new b();
    public static final Parcelable.Creator<b> CREATOR = new k(1);

    public b() {
        this.f13471a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f13471a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f13471a = parcelable == f13470b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f13471a = readParcelable == null ? f13470b : readParcelable;
    }
}
