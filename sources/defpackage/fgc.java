package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class fgc extends w1 {
    public static final Parcelable.Creator<fgc> CREATOR = new v1((byte) 4);
    public int c;
    public Parcelable d;
    public final ClassLoader e;

    public fgc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? fgc.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.e = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return hg9.k(sb, this.c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
