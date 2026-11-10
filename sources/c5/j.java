package c5;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
public final class j extends j1.b {
    public static final Parcelable.Creator<j> CREATOR = new i(0);
    public int f5324c;
    public Parcelable d;
    public final ClassLoader f5325e;

    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? j.class.getClassLoader() : classLoader;
        this.f5324c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.f5325e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return p0.n(this.f5324c, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f5324c);
        parcel.writeParcelable(this.d, i7);
    }
}
