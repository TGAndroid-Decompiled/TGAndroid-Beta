package i1;

import android.os.Parcel;
import android.os.Parcelable;
import f2.j1;
public abstract class b implements Parcelable {
    public final Parcelable f10870a;
    public static final a f10869b = new b();
    public static final Parcelable.Creator<b> CREATOR = new j1(1);

    public b() {
        this.f10870a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeParcelable(this.f10870a, i9);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10870a = parcelable == f10869b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f10870a = readParcelable == null ? f10869b : readParcelable;
    }
}
