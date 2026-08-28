package f2;

import android.os.Parcel;
import android.os.Parcelable;
public final class k1 extends i1.b {
    public static final Parcelable.Creator<k1> CREATOR = new j1(0);
    public Parcelable f5413c;

    public k1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5413c = parcel.readParcelable(classLoader == null ? z0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeParcelable(this.f5413c, 0);
    }
}
