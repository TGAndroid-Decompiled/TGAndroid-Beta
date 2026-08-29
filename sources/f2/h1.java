package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class h1 extends i1.b {
    public static final Parcelable.Creator<h1> CREATOR = new g1(0);
    public Parcelable f6343c;

    public h1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6343c = parcel.readParcelable(classLoader == null ? w0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f6343c, 0);
    }
}
