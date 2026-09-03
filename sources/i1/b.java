package i1;

import android.os.Parcel;
import android.os.Parcelable;
import f2.e1;
public abstract class b implements Parcelable {
    public final Parcelable f7217a;
    public static final a f7216b = new b();
    public static final Parcelable.Creator<b> CREATOR = new e1(1);

    public b() {
        this.f7217a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7217a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7217a = parcelable == f7216b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f7217a = readParcelable == null ? f7216b : readParcelable;
    }
}
