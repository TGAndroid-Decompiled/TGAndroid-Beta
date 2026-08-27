package m2;

import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import f2.h1;

public final class f extends i1.b {
    public static final Parcelable.Creator<f> CREATOR = new h1(4);

    public int f17555c;
    public Parcelable d;

    public final ClassLoader f17556e;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? f.class.getClassLoader() : classLoader;
        this.f17555c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.f17556e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return p.k(this.f17555c, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f17555c);
        parcel.writeParcelable(this.d, i10);
    }
}
