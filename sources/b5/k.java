package b5;

import android.os.Parcel;
import android.os.Parcelable;
public final class k extends i1.b {
    public static final Parcelable.Creator<k> CREATOR = new j(0);
    public int f2409c;
    public Parcelable d;
    public final ClassLoader f2410e;

    public k(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
        this.f2409c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.f2410e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return a1.g.o(this.f2409c, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f2409c);
        parcel.writeParcelable(this.d, i3);
    }
}
