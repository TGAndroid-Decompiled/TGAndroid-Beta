package m2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.f1;
public final class g extends i1.b {
    public static final Parcelable.Creator<g> CREATOR = new f1(4);
    public int f13431c;
    public Parcelable d;
    public final ClassLoader f13432e;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
        this.f13431c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.f13432e = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return android.support.v4.media.a.m(this.f13431c, "}", sb);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f13431c);
        parcel.writeParcelable(this.d, i10);
    }
}
