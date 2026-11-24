package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class o69 extends w1 {
    public static final Parcelable.Creator<o69> CREATOR = new v1((byte) 1);
    public Parcelable c;

    public o69(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? f69.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }
}
