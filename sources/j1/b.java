package j1;

import android.os.Parcel;
import android.os.Parcelable;
import c5.i;
public abstract class b implements Parcelable {
    public final Parcelable f16405a;
    public static final a f16404b = new b();
    public static final Parcelable.Creator<b> CREATOR = new i(1);

    public b() {
        this.f16405a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f16405a, i7);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f16405a = parcelable == f16404b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f16405a = readParcelable == null ? f16404b : readParcelable;
    }
}
