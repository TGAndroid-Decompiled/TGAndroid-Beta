package a5;

import android.os.Parcel;
import android.os.Parcelable;
public final class l extends i1.b {
    public static final Parcelable.Creator<l> CREATOR = new k(0);
    public int f296c;
    public Parcelable d;
    public final ClassLoader e;

    public l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? l.class.getClassLoader() : classLoader;
        this.f296c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return a1.g.n(this.f296c, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f296c);
        parcel.writeParcelable(this.d, i10);
    }
}
