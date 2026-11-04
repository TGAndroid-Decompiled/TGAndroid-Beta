package i1;

import android.os.Parcel;
import android.os.Parcelable;
import b5.j;
public abstract class b implements Parcelable {
    public final Parcelable f14517a;
    public static final a f14516b = new b();
    public static final Parcelable.Creator<b> CREATOR = new j(1);

    public b() {
        this.f14517a = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f14517a, i3);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f14517a = parcelable == f14516b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f14517a = readParcelable == null ? f14516b : readParcelable;
    }
}
