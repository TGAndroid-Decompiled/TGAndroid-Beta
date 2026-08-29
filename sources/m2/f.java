package m2;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import f2.g1;
public final class f extends i1.b {
    public static final Parcelable.Creator<f> CREATOR = new g1(4);
    public int f16777c;
    public Parcelable d;
    public final ClassLoader f16778e;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? f.class.getClassLoader() : classLoader;
        this.f16777c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.f16778e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return w.l(this.f16777c, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f16777c);
        parcel.writeParcelable(this.d, i10);
    }
}
