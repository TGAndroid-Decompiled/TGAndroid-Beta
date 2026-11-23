package c5;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
public final class k extends j1.b {
    public static final Parcelable.Creator<k> CREATOR = new j(0);
    public int f4457c;
    public Parcelable d;
    public final ClassLoader f4458e;

    public k(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
        this.f4457c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.f4458e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return p0.n(this.f4457c, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f4457c);
        parcel.writeParcelable(this.d, i7);
    }
}
