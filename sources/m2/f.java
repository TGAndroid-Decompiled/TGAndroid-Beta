package m2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.j1;
public final class f extends i1.b {
    public static final Parcelable.Creator<f> CREATOR = new j1(4);
    public int f17179c;
    public Parcelable d;
    public final ClassLoader f17180e;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? f.class.getClassLoader() : classLoader;
        this.f17179c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.f17180e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return aa.d.l(this.f17179c, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f17179c);
        parcel.writeParcelable(this.d, i9);
    }
}
